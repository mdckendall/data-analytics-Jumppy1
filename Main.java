import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner in = new Scanner(System.in);

    do { System.out.println ("Press 1 to learn about salary.");
        
        System.out.println ("Press 2 to learn about the job.");
        
        System.out.println ("Press 3 to learn about demand.");
        
        System.out.println ("Press 4 to view current students.");
          
         System.out.println ("Press 5 to quit.");
        int inPut = in.nextInt();

        
        if (inPut == 1) {
     System.out.println ("$98,345 average salary in South Florida!");
    
        } if (inPut == 2) {
          System.out.println ("US News - 100 Best Jobs!"); 
        } if (inPut == 3) {
          System.out.println ("Top 10 Forbes In-Demand Jobs!");
	}
    if (inPut == 4) { 
    while (fileScanner.hasNextLine()){
      String line = fileScanner.nextLine();
      System.out.println("Current Students: " + line);
    }
    }
      if (inPut == 5) {
        System.exit(0);
}
} while (true);
      }
}