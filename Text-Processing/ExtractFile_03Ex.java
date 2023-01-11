import java.util.Scanner;

public class ExtractFile_03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] folders = input.split("\\\\");
        String file = folders[folders.length-1];
        String fileName = file.split("\\.")[0];
        System.out.println("File name: " + fileName);
        String extension = file.split("\\.")[1];
        System.out.println("File extension: " + extension);
    }
}
