import java.io.*;
import java.util.Scanner;

public class assignment_10A1 {
  public static void main(String[] args) {
    char operator;
    String oldContent="Hello Everyone My Name is Bajrang Gour";
    String newLine = "Hello Everyone My Name is Code.Bajju";
    String fileContents = "";
    fileContents = fileContents.replaceAll(oldContent,newLine);
    File myfile = new File("bajrang.txt");
  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Choice to Perform action on file \n 1.Create a file \n 2.Write Data \n 3.Append Data \n 4.Update Data \n 5.Delete Data ");
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
  try (FileWriter f = new FileWriter("bajrang.txt", true);
  BufferedWriter b = new BufferedWriter(f);
  PrintWriter p = new PrintWriter(b);) {
p.println("");
p.println("appending text into file");
p.println("I am Inserted Text");
p.println("I am 2nd Inserted Text");
System.out.println("Successfully Appended to the file");

} 
catch (IOException i) {
i.printStackTrace();
}

// case '4':
// try
//         {
//             BufferedReader reader = new BufferedReader(new FileReader(myfile));             
//             String line = reader.readLine();
//             while (line != null) 
//             {
//                 oldContent = oldContent + line + System.lineSeparator();
                 
//                 line = reader.readLine();
//             }
//             String newContent = oldContent.replaceAll(oldContent, newLine);
//             FilterWriter writer = new FileWriter(newContent,true);
//             writer.write(newLine);
//         }
//         catch (Exception e)
//         {
//             e.printStackTrace();
//         }
//     }
    break;
// try{
//     FileWriter fw = new FileWriter(myfile,false);
//     BufferedWriter bw = new BufferedWriter(fw);
//     PrintWriter pw = new PrintWriter(bw);
//     pw.println("Hello My name is code.bajju");
//     pw.close();
// }
// catch(IOException e){
//     System.out.println("An error Occur");
// }

// BufferedReader b = new BufferedReader(new FileReader(myfile));
// String line = b.readLine();  
// while (line != null) 
// {
//     oldContent = oldContent + line;
     
//     line = b.readLine();
// }
case '5':
try {  
  if (myfile.delete())  
  {
    System.out.println("Succesfully deleted" + myfile.getName());
  } else {
    System.out.println("failed");
  }
} catch (Exception e) {
  e.printStackTrace();
}
break;
    default :

   
    
  }
}
}
