import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInteraction {
    public File file;

    public void isExist(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert file name: ");
        String fileName = sc.nextLine();
        file = new File(fileName);
        if(file.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("File not exists");
        }
        
    }

    public void insertRecord() throws IOException{
        if(file == null){
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert file name: ");
            String fileName = sc.nextLine();
            file = new File(fileName);
        }
        if(!file.exists()){
            System.out.println(file.getName() + " not found. New file created!");
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\My project\\Java code\\TrieuGiaKhiem_225054154_Lab06\\src\\" + file));
        System.out.print("Insert amount of records: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String temp = sc.nextLine();
            writer.write(temp);
            writer.newLine();
        }
        
        writer.close();
    }

    public void copyFile() throws IOException{
        System.out.println("All contents of " + file.getName() + " will be copy into copyFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader("D:\\My project\\Java code\\TrieuGiaKhiem_225054154_Lab06\\src\\" + file));
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\My project\\Java code\\TrieuGiaKhiem_225054154_Lab06\\src\\" + "copyFile.txt"));
        String line;
        while ((line=reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
            System.out.print(".");
        }
        System.out.println("File copied");
        reader.close();
        writer.close();
    }

    public void search() throws IOException{
        int count = 0;
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println("Insert string to find");
        String searchString = sc.nextLine();
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains(searchString)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("String not found!");
        }else{
            System.out.println("String appears " + count + (count>1?" times":" time"));
        }
         
        reader.close();
    }
}

//
