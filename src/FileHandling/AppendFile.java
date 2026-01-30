package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("data.txt", true)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            fw.write(text + "\n");
            System.out.println("Data appended successfully");

        } catch (IOException e) {
            System.out.println("File write failed");
        }

        sc.close();
    }
}
