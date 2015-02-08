import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ScoreTrakker {
    private ArrayList<Student> students = new ArrayList<Student>();
    private String[] files = {"scores.txt","badscore.txt","nofile.txt"};
    public void loadDataFromFile(String fileName) throws FileNotFoundException {
    	FileReader read = new FileReader(fileName);
    	Scanner in = new Scanner(read);
    	
    	String name = null;
    	String strscore = "";
    	
    	int score = 0;
    	while(in.hasNextLine()){
    	  
    	   try{ 
    		   name = in.nextLine();
        	   strscore = in.nextLine();
    	       score = Integer.parseInt(strscore);
    	       Student student = new Student(name,score);
       		   students.add(student);
    	   }catch (NumberFormatException e) {
    		   System.out.println("wrong format for " + name + " not a valid score  " + strscore);
    	   }
    		
    		
    		
    	}
    	in.close();
    }
    public void printInOrder() {
    	Collections.sort(students);
    	
    	 for(Student s : students){
    	   
    		System.out.println(s);
    	   
    	   
    	 }
   }
    
    public void processFiles()  {
    	try{
    	 loadDataFromFile("nofile.txt");
    	 printInOrder();
    	}catch(FileNotFoundException e){
    		System.out.println("file " + files[2] + " not found");
    	}
    }
    public static void main(String[] args) throws FileNotFoundException {
    	ScoreTrakker score = new ScoreTrakker();
    	score.processFiles();
    }
}
