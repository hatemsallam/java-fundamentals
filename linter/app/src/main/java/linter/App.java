/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.*;

import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String check(String link) {

        String error = "";
        int lineCount = 0;
        Path path = Paths.get(link);
        try {
            List<String> lines = Files.readAllLines(path);
            if (!(lines.size() == 0)) {
                for (String line : lines) {
                    lineCount++;
                    if (line.isBlank() || (line.endsWith("{")) || line.endsWith("}") || line.contains("else") || line.contains("if") || line.endsWith(";")) {

                    } else {
                        error += "Line " + lineCount + " : Missing semicolon.\n";
                    }
                }
            } else {
                return "File is Empty";
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        return error;


    }
    public static void main (String[]args){
        String path = ".\\app\\src\\main\\resources\\gates.js";
//          "resources\\gates.js";
        App app = new App();
        String error = app.check(path);
        System.out.println(error);
    }
}
