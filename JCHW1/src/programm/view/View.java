package programm.view;

import programm.controller.Controller;

import java.util.Scanner;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    private String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public void run() {
        while (true) {
            String command = prompt("""
                    Choose an action:
                    1 - Add new note
                    2 - Show all notes
                    3 - exit
                    """);
            switch (command) {
                case "1":
                    String title = prompt("Enter title of the programm.note:\n");
                    String content = prompt("Enter content of the programm.note:\n");
                    controller.addNote(title, content);
                    System.out.println("Note was added successfully\n");
                    break;
                case "2":
                    controller.showNotes();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Wrong action. Please, try again.\n");
                    break;
            }
        }
    }
}