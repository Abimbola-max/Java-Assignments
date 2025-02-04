package diaryapp;

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
            System.out.println("Enter username: ");
            String username = input.next();

            Diary diary = diaries.findByUserName(username);
            diary.lockDiary();
            System.out.println("You have successfully locked your Diary.");
        } catch (InputMismatchException exception) {
            System.out.println("Password does not match.");
        } finally {
            mainOptions();

        }

    }

    public void unlockDiary() {
        try {
            System.out.println("Enter username: ");
            String username = input.next();

            System.out.println("Enter Your password: ");
            String password = input.next();

            Diary diary = diaries.findByUserName(username);

            diary.isUnlocked(password);
            System.out.println("Diary has been successfully unlocked.");
        } catch (NullPointerException exception) {
            System.out.println("You have to create your diary first or password and username doesn't match.");
        } catch (InputMismatchException exception) {
            System.out.println("Password OR USERNAME does not match.");
        } finally {
            mainOptions();
        }
    }

    public void createEntry() {
        input.nextLine();

        try {
            System.out.println("Enter username: ");
            String username = input.nextLine();

            Diary diary = diaries.findByUserName(username);

            System.out.println("Enter Entry Title: ");
            String title = input.nextLine();

            System.out.println("Enter the entry description of your diary: ");
            String body = input.nextLine();

            System.out.println("Enter password to unlock your diary: ");
            String password = input.next();

            diary.isUnlocked(password);
            Entry entry1 = diary.createEntry(title, body);

            System.out.println("Your entry has been saved successfully.");
            System.out.println("Your unique entry id is " + entry1.getId());
        } catch(InputMismatchException exception) {
            System.out.println("ID is invalid.");
        } catch (NullPointerException exception) {
            System.out.println("You have to create your diary first or password and username doesn't match.");
        } catch (IllegalStateException | IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } finally {
            mainOptions();
        }
    }

    public void findEntryById() {
        try {
            System.out.println("Enter username: ");
            String username = input.next();

            System.out.println("Enter Your password: ");
            String password = input.next();

            Diary diary = diaries.findByUserName(username);
            diary.isUnlocked(password);

            System.out.println("Enter Entry ID: ");
            int entryId = input.nextInt();

            Entry entry = diary.findEntryById(entryId);

            System.out.println("Your entry has been successfully found, Check below.");
            System.out.println("Title: " + entry.getTitle());
            System.out.println("Body: " + entry.getBody());
            System.out.println("The date of creation is: " + entry.getDateCreated());

        } catch (InputMismatchException exception) {
            System.out.println("Invalid ID.");
        } catch (NullPointerException exception) {
            System.out.println("You have to create your diary first or password and username doesn't match.");
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }catch (IllegalArgumentException exception) {
            System.out.println("Cannot find your entry because it does not exist.");
        }finally {
            mainOptions();
        }
    }

    public void updateEntry() {
        try {
            System.out.println("Enter username: ");
            String username = input.next();

            System.out.println("Enter Your password: ");
            String password = input.next();

            System.out.println("Enter Diary unique ID to update: ");
            int entryId = input.nextInt();
            input.nextLine();

            Diary diary = diaries.findByUserName(username);

            diary.isUnlocked(password);

            System.out.println("Write title update here: ");
            String title = input.nextLine();

            System.out.println("Write body/description update here: ");
            String body = input.nextLine();

            diary.updateEntry(entryId, title, body);

            System.out.println("Your entry has been successfully updated.");
        } catch (InputMismatchException exception) {
            System.out.println("Invalid ID.");
        } catch (NullPointerException exception) {
            System.out.println("You have to create your diary first or password and username doesn't match.");
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }catch (IllegalArgumentException exception) {
            System.out.println("Cannot find your entry because it does not exist.");
        } finally {
            mainOptions();
        }
    }

    public void deleteEntry() {
        try {
            System.out.println("Enter username: ");
            String username = input.next();

            System.out.println("Enter Your password: ");
            String password = input.next();

            Diary diary = diaries.findByUserName(username);
            diary.isUnlocked(password);

            System.out.println("Enter Diary unique ID to delete: ");
            int entryId = input.nextInt();
            input.nextLine();

            diary.deleteEntry(entryId);
            System.out.println("Entry" + entryId + " has been successfully deleted.");

        } catch (InputMismatchException exception) {
            System.out.println("Invalid ID.");
        } catch (NullPointerException exception) {
            System.out.println("You have to create your diary first or password and username doesn't match.");
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }catch (IllegalArgumentException exception) {
            System.out.println("Cannot find your entry because it does not exist.");
        } finally {
            mainOptions();
        }
    }

    public void exitApp() {
        System.out.println("Bye Bro!");
        System.exit(0);
    }

}
