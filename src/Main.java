import java.util.Scanner;

public class Main {


    public static String stopCommand = "S";

    public static void main(String[] args) {
        int age;
        String genre;
        String answer;
        boolean go = true;
        Scanner in = new Scanner(System.in);



        do{
            runDialog();
        } while (getUserAnswer("Do you want to continue?"));
        System.out.println("Thanks for using the Adder!");
        getUserString();



//        while (go) {
//
//            //method 1 {
//            System.out.println("Hi! How old are you?");
//            age = Integer.parseInt(in.nextLine());
//            System.out.println("Okay, and what genre do you want to read?");
//            genre = in.nextLine();
//            //}
//
//
//            if (age <= 6) {
//                System.out.println("NO! You should definitely read alphabet");
//            }
//            if (age >= 7 && genre.equalsIgnoreCase("adventure")) {
//                System.out.println("I recommend you to read The Adventures of Tom Sawyer");
//            }
//
//            if (age >= 7 && genre.equalsIgnoreCase("fantasy")) {
//                System.out.println("Oh, then I would like to recommend you Harry Potter and the philosophical stone");
//            }
//
//
//            if (age >= 18 && genre.equalsIgnoreCase("Adventure")) {
//                System.out.println("Hm? You should try to read Treasure island");
//            }
//
//            if (age >= 18 && genre.equalsIgnoreCase("Horror")) {
//                System.out.println("Like extreme? Try It");
//            }
//
//            if (age >= 23 && genre.equalsIgnoreCase("drama")) {
//                System.out.println("Romeo and Juliet hits hard");
//            }
//
//            if (age >= 23 && genre.equalsIgnoreCase("novel")) {
//                System.out.println("Fight Club is just what you need");
//            }
//
//
//            if (age > 60) {
//                System.out.println("Enjoy your retirement and read news, but honestly reading the Kobzar will be healthier for you");
//            } else if (!(genre.equalsIgnoreCase("novel") || genre.equalsIgnoreCase("drama") || genre.equalsIgnoreCase("Horror") || genre.equalsIgnoreCase("Adventure") || genre.equalsIgnoreCase("fantasy"))) {
//                System.out.println("Sorry I do not know what to recommend to you");
//            }
//            System.out.println("Do you want to continue? If so type Y or type any other letter to stop.");
//            answer = in.nextLine();
//
//
//            if (!(answer.equalsIgnoreCase("y"))) {
//                System.out.println("Sad to see you go.");
//                go = false;
//            }
//        }

    }


    public static void runDialog(){
        boolean run = true;
        int age;
        String genre;
        Scanner dialog = new Scanner(System.in);
        System.out.println("Hi! How old are you?");
            age = Integer.parseInt(dialog.nextLine());
            System.out.println("Okay, and what genre do you want to read?");
            genre = dialog.nextLine();



            if (age <= 6) {
                System.out.println("NO! You should definitely read alphabet");
            }
            if (age >= 7 && genre.equalsIgnoreCase("adventure")) {
                System.out.println("I recommend you to read The Adventures of Tom Sawyer");
            }

            if (age >= 7 && genre.equalsIgnoreCase("fantasy")) {
                System.out.println("Oh, then I would like to recommend you Harry Potter and the philosophical stone");
            }


            if (age >= 18 && genre.equalsIgnoreCase("Adventure")) {
                System.out.println("Hm? You should try to read Treasure island");
            }

            if (age >= 18 && genre.equalsIgnoreCase("Horror")) {
                System.out.println("Like extreme? Try It");
            }

            if (age >= 23 && genre.equalsIgnoreCase("drama")) {
                System.out.println("Romeo and Juliet hits hard");
            }

            if (age >= 23 && genre.equalsIgnoreCase("novel")) {
                System.out.println("Fight Club is just what you need");
            }


            if (age > 60) {
                System.out.println("Enjoy your retirement and read news, but honestly reading the Kobzar will be healthier for you");
            } else if (!(genre.equalsIgnoreCase("novel") || genre.equalsIgnoreCase("drama") || genre.equalsIgnoreCase("Horror") || genre.equalsIgnoreCase("Adventure") || genre.equalsIgnoreCase("fantasy"))) {
                System.out.println("Sorry I do not know what to recommend to you");
            }

        }


    public static String getUserString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String getUserString(String caption) {
        System.out.println(caption);
        return getUserString();
    }

    public static boolean getUserAnswer(String question) {
          String input = getUserString(question + " Y/N");
         return input.toUpperCase().equals("Y");
      //  System.out.println("Do you want to continue? If so type Y or type any other letter to stop.");



    }


}