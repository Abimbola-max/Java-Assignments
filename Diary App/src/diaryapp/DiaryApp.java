package diaryapp;

import java.util.Scanner;

public class DiaryApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

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
        System.out.println("Enter Diary Title: ");
        String title = input.nextLine();
        System.out.println("Enter the body or description of your diary: ");
        String body = input.nextLine();
        
    }
}
