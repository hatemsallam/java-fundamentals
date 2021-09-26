import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(3);

        clock();
    }


    // function 1 pluralize
    public static String pluralize(String name,int number) {
        if((number==0)||(number>1)) {
            return name + "s";
        }
        else {
            return name;
        }
    }

    // function 2 flipNHeads
    public static void flipNHeads(int n) {
        int flipCounter = 0 ;
        int headCounter = 0 ;
        double randomNumber = 0.0 ;

        while (headCounter != n ) {
            randomNumber = Math.random() ;
            if (randomNumber>=0.5) {
                System.out.println("head");
                flipCounter++;
                headCounter++;
            }
            else {
                System.out.println("tail");
                flipCounter++;
                headCounter=0;
            }
        }
        System.out.println("It took "+ flipCounter + " flips to flip " + n + " head in a row.");
    }

    // function 3 clock
    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
        int flag=1;
        while (flag!=0){
            now = LocalDateTime.now();
            if (second != now.getSecond()){
                clock();
            }
        }
    }




}