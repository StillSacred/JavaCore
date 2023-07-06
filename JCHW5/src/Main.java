import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BackupMaker bM = new BackupMaker();
        bM.makeBackup(prompt("Enter directory\n"));
    }
    private static String prompt(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(message);
            return scanner.nextLine();
        }
    }
}