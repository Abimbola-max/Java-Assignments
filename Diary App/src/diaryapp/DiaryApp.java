package diaryapp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaryApp {

    static Scanner input = new Scanner(System.in);
    private final Diaries diaries = new Diaries();

    public static void main(String[] args) {
        DiaryApp app = new DiaryApp();
        app.mainOptions();

    }

    public void mainOptions() {
        System.out.println("Welcome to AppByBibiDiary");
        System.out.println("""
                1 --> Create Diary
                2 --> Create Entry
                3 --> Lock Diary
                4 --> Unlock Diary
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
            case "2":
                createEntry();
                break;
            case "3":
                lockDiary();
                break;
            case "4":
                unlockDiary();
                break;
            case "5":
                findEntryById();
                break;
            case "6":
                updateEntry();
                break;
            case "7":
                deleteEntry();
                break;
            case "8":
                exitApp();
                break;
            default:
               mainOptions();
        }
    }

    public void createDiary() {
        try {
            System.out.println("Enter Diary Name: ");
            String name = input.next();

            System.out.println("Enter Your username: ");
            String username = input.next();

            System.out.println("Enter Your password: ");
            String password = input.next();

            if(username.isEmpty() || password.isEmpty()) throw new IllegalArgumentException("Username and password cannot be empty.");
            input.nextLine();

            diaries.add(username, password);

            System.out.println(name + "'s " + "Diary has been created");
            System.out.println("PLEASE NOTE YOUR DIARY IS LOCKED BY DEFAULT.");

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
        } finally {
            mainOptions();

        }

    }

    public void unlockDiary() {
        System.out.println("Enter Your password: ");
        String password = input.next();
    }

    public void createEntry() {
        input.nextLine();

        try {
            System.out.println("Enter username: ");
            String username = input.next();



            Diary diary = diaries.findByUserName(username);

            System.out.println("Enter Entry Title: ");
            String title = input.nextLine();
            input.nextLine();
            System.out.println("Enter the entry description of your diary: ");
            String body = input.nextLine();

            System.out.println("Enter password to unlock your diary: ");
            String password = input.next();

            diary.isUnlocked(password);
            Entry entry1 = diary.createEntry(title, body);

            System.out.println("Your entry has been saved successfully.");
            System.out.println("Your unique entry id is " + entry1.getId());
        } catch (NullPointerException exception) {
            System.out.println("You have to create your diary first.");
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        } finally {
            mainOptions();
        }
    }

    public void findEntryById() {
        try {
            System.out.println("Enter Entry ID: ");
            int entryId = input.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("ID can not be empty.");
        } finally {
            mainOptions();
        }
    }

    public void updateEntry() {
        try {
            System.out.println("Enter Diary unique ID: ");
            int entryId = input.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("ID can not be empty.");
        } finally {
            mainOptions();
        }
    }

    public void deleteEntry() {
        try {
            System.out.println("Enter Diary unique ID: ");
            int entryId = input.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("ID can not be empty.");
        } finally {
            mainOptions();
        }
    }

    public void exitApp() {
        System.out.println("Bye Bro!");
        System.exit(0);
    }

}
