package basics.string;

public class StringPool {

	public static void main(String[] args) {
		
		String s1 = "Rachel";
		String s2 = "Rachel";
		System.out.println(s1 == s2);			 // true  // points same adr in SCP

		String s3 = new String("Rachel");       
		System.out.println(s1 == s3);			// false  // Creates new String in Heap

		String s4 = new String("Rachel").intern();
		System.out.println(s1 == s4); 			// true	  // identifies str in SCP
		
		System.out.println("-------------------------------");

		String ss1="hello"; 
		String ss3="Hello";
		System.out.println(ss1.equals(ss3));   // returns false // Case Sensitive
		
		System.out.println("-------------intern------------------");

		// Si1 refers to Object in the Heap Area 
        String si1 = new String("GFG"); // Line-1 
        
        String si2 = "GFG";
  
        // Si2 refers to Object in SCP Area
        // Checks in SCP before assigning
        String si3 = si1.intern(); // Line-2    // same address as si2   
        
        // Comparing memory locations
        // si1 is in Heap
        // si2 is in SCP
        System.out.println(si1 == si3);        // false
        
        System.out.println(si2 == si3);        // true    
          
        // Comparing values
        System.out.println(si1.equals(si2));   // true
          
        // S3 refers to Object in the SCP Area 
        String si4 = "GFG"; // Line-3          
  
        System.out.println(si2 == si4); 		// true

	}
}
