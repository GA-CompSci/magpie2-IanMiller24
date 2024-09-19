import java.util.Scanner;

public class StringExplorer
{
	public static void main(String[] args)
	{
        for(int i = 5; i > 0; i--) {
            System.out.println("T Minus " + i);
        }
      
        Scanner input = new Scanner(System.in);
    
        while(true) {
            String userSaysWhat = input.nextLine();
            System.out.println(userSaysWhat + " means you need more calcium in your diet");
            if(userSaysWhat.equals("stop")) {
                break;
            }
        }
    
      /*
      ---------------------------
          SAMPLE STUFF
      ---------------------------
      */
  		String sample = "The quick brown fox jumped over the lazy dog.";
  
        System.out.println("OUR SAMPLE:");
  		
  		int l = sample.length();
  		System.out.println ("sample.length() = " + l);
  
  		int position = sample.indexOf("quick");
  		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		String upperCase = sample.toUpperCase();
        System.out.println("sample.toUpperCase() = " + upperCase);
        System.out.println("After toUpperCase(), sample = " + sample);

        int lastThe = sample.toLowerCase().lastIndexOf("the");
        System.out.println("The last the occurs at index " + lastThe);

        String quick = sample.substring(4, 9);
        System.out.println("sample.substring(4, 9) is the substring " + quick);
        
        if(quick.equals("quick")) {
            System.out.println("The variable quick has the value " + quick);
        }

	}
}
