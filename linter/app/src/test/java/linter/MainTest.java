package linter;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainTest {

    @Test
    public void noError(){
        String link="C:\\Users\\STUDENT\\codefellows\\401java\\java-fundamentals\\linter\\app\\src\\test\\resources\\noErrors.js";
        App app=new App();
        String exp="";
        assertEquals(exp,app.check(link));
    }
    @Test
    public void empty(){
        String link="C:\\Users\\STUDENT\\codefellows\\401java\\java-fundamentals\\linter\\app\\src\\test\\resources\\empty.js";
        App app=new App();
        String exp="File is Empty";
        assertEquals(exp,app.check(link));
    }
    @Test
    public void oneError(){
        String link="C:\\Users\\STUDENT\\codefellows\\401java\\java-fundamentals\\linter\\app\\src\\test\\resources\\oneError.js";
        App app=new App();
        String exp="Line 5 : Missing semicolon.\n";
        assertEquals(exp,app.check(link));
    }
    @Test
    public void fewError(){
        String link="C:\\Users\\STUDENT\\codefellows\\401java\\java-fundamentals\\linter\\app\\src\\test\\resources\\fewErrors.js";
        App app=new App();
        String exp="Line 3 : Missing semicolon.\nLine 5 : Missing semicolon.\n";
        assertEquals(exp,app.check(link));
    }
    @Test
    public void manyError(){
        String link="C:\\Users\\STUDENT\\codefellows\\401java\\java-fundamentals\\linter\\app\\src\\test\\resources\\manyErrors.js";
        App app=new App();
        String exp="Line 2 : Missing semicolon.\nLine 4 : Missing semicolon.\nLine 6 : Missing semicolon.\n";
        assertEquals(exp,app.check(link));
    }
}