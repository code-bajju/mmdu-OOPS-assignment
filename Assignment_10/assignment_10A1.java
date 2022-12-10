import java.io.*;
import java.util.Scanner;
public class assignment_10A1 {
    public static void main(String[] args) throws IOException {
        char operator;
        File myfile = new File("bajrang.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n 1.Create a file \n 2.Write Data \n 3.Append Data \n 4.Update Data \n 5.Delete File ");
        operator = sc.next().charAt(0);
        sc.close();
        switch (operator) {
            case '1':
                try {
                    if (myfile.createNewFile()) {
                        System.out.println("File " + myfile.getName() + " is created successfully.");
                    } else {
                        System.out.println("file is already Exist !");
                    }
                } catch (IOException e) {
                    System.out.println("an Error Occur");
                    e.printStackTrace();
                }
                break;
            case '2':
                try {
                    FileWriter myWriter = new FileWriter("bajrang.txt");
                    myWriter.write("Hello Everyone My Name is Bajrang Gour");
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                break;
            case '3':
                try (FileWriter f = new FileWriter("bajrang.txt", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) {
                    p.println("");
                    p.println("appending text into file");
                    p.println("I am Inserted Text");
                    p.println("I am 2nd Inserted Text");
                    System.out.println("Successfully Appended to the file");

                } catch (IOException i) {
                    i.printStackTrace();
                }
                break;
            case '4':
                try {
                    String filePath = "bajrang.txt";
                    Scanner sc2 = new Scanner(new File(filePath));
                    StringBuffer buffer = new StringBuffer();
                    while (sc2.hasNextLine()) {
                        buffer.append(sc2.nextLine() + System.lineSeparator());
                    }
                    String fileContents = buffer.toString();
                    sc2.close();
                    String oldLine = "Hello";
                    String newLine = "Namskar";
                    fileContents = fileContents.replaceAll(oldLine, newLine);
                    FileWriter writer = new FileWriter(filePath);
                    System.out.println("");
                    System.out.println("Successfully Updated to the file");
                    writer.append(fileContents);
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    System.out.println("error");
                }
                break;
            case '5':
                try {
                    if (myfile.delete()) {
                        System.out.println("Succesfully deleted " + myfile.getName());
                    } else {
                        System.out.println("failed");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
        }
    }
}