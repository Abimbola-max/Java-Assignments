package diaryapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaryApp {

    static Scanner input = new Scanner(System.in);
    private Diary diary;

    public static void main(String[] args) {
        DiaryApp app = new DiaryApp();
        app.mainOptions();

    }

    public void mainOptions() {
        System.out.println("Welcome to AppByBibiDiary");
        System.out.println("""
                1 --> Create Diary
                2 --> Lock Diary
                3 --> Unlock Diary
                4 --> Create Entry
                5 --> Find Entry By Id
                6 --> Update Entry
                7 --> Delete Entry
                8 --> Exit App
                """);
        System.out.print("Enter option: ");
        String option = input.next();
        switch (option) {
            case "1":
                createDiary();
                break;
        }

    }

    public void createDiary() {
        try {
            System.out.println("Enter Your username: ");
            String username = input.next();
            System.out.println("Enter Your password: ");
            String password = input.next();
            System.out.println("Confirm your password: ");
            String confirmPassword = input.next();

            if (password.equals(confirmPassword)) diary = new Diary(username, password);
        } catch (NullPointerException exception) {
            System.out.println("Username or password can not be empty.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Username or password is invalid.");
        } finally {
            mainOptions();
        }
    }

    public void lockDiary() {
        try {
            System.out.println("Enter Your password: ");
            String password = input.next();
        } catch (InputMismatchException exception) {
            System.out.println("Password can not be empty.");
        }
    }

    public void createEntry() {
        System.out.println("Enter Diary Title: ");
        String title = input.nextLine();
        System.out.println("Enter the body or description of your diary: ");
        String body = input.nextLine();
        try {
            diary = new Diary(title, body);


        }
    }

}
