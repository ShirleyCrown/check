
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInteraction fileInteraction = new FileInteraction();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose function:");
            System.out.println("1. Check existance");
            System.out.println("2. Add record");
            System.out.println("3. Copy contents to copyFile.txt");
            System.out.println("4. Find string in file.");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    fileInteraction.isExist();
                    break;
                case 2:
                    fileInteraction.insertRecord();
                    break;
                case 3: 
                    fileInteraction.copyFile();
                    break;
                case 4: 
                    fileInteraction.search();
                    break;
                default:
                    System.out.println("Program closed");
                    break;
        }
        } while (choice>0 && choice <=4);
        sc.close();
    }
}
