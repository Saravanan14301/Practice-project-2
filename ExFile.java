import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExFile {

	public static void main(String[] args) throws IOException {
		String loc="C:\\Users\\sarav\\New bad\\king.txt";
		File sc=new File("C:\\Users\\sarav\\New bad\\king.txt");
		
	  //create file
		
		boolean b=sc.createNewFile();
		if(b) {
			System.out.println("File Created Sucessfully");
		}
		else {
			System.out.println("File already created "+loc+"in this location");
		}
		//store the data
		Scanner sc1=new Scanner(System.in);        
	         
		FileOutputStream fos=new FileOutputStream("C:\\Users\\sarav\\New bad\\king.txt", true);  // true for append mode  
		System.out.print("Enter file content: ");         
		String str=sc1.nextLine()+"\n";      
		byte[] b1= str.getBytes();        
		fos.write(b1);         
		fos.close();  
		System.out.println("file saved.");  
		
		//display out put
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\\\sarav\\New bad\\king.txt"));
		String line;
		System.out.println("The file Content is: ");
		while((line = in.readLine()) != null)
		{
		    System.out.println(line);
		}
		in.close();
		//Delete the data
		if(sc.delete()) {
			System.out.println("file Deleted "+sc.getName());
		}
		else {
			System.out.println("file not deleted");
		}
		}
}