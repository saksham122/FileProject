package FileProject;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileProject{
	public String insert;
	public Scanner input;
	public static String ap;

	
	public void writeFile() throws IOException{
		 
		input = new Scanner (System.in);
		System.out.println("Please Enter the text you want to write in the file");
		insert = input.nextLine();
			
		FileWriter fw = new FileWriter("TestFile.txt");
		fw.write(insert);
		System.out.println("Success!");
		fw.close();	
						
	}
		
	
	public void readFile() throws IOException{
		File f1 = new File("Testfile.txt");
		Scanner re = new Scanner(f1);
		while(re.hasNextLine()) {
			System.out.println(re.nextLine());
		}
				
	}
	
	public void appendFile() throws IOException{
		System.out.println("Please Enter the text you want to append in the file");
		Scanner sc = new Scanner(System.in);
		ap = sc.nextLine();

		String space = " \n";
		FileWriter fw = new FileWriter("Testfile.txt", true);
		fw.write(space);
		fw.write(ap);
		System.out.println("Success! ");
		fw.close();
		
		File file = new File("Testfile.txt");
		System.out.println("\n **** now it is Reading Appended File *** \n");
			
		Scanner readr = new Scanner(file);
		
		while(readr.hasNextLine()) {
			System.out.println(readr.nextLine());
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		// If you already have run this prog then please delete the Testfile.txt 
		//from the FileProject in order to run it again
		
		File f1 = new File("Testfile.txt");
		if(f1.createNewFile()){
			System.out.println("A new Testfile created");
			FileProject fp = new FileProject();
			fp.writeFile();
			System.out.println("\n *** Now reading the content of the file *** \n");
			fp.readFile();
			fp.appendFile();
		}
		else {
			System.out.println("Please delete existing Testfile.txt in order to create new one");
		}
		
	}
}


		
		
		
		
		
		
		
		
		
	


