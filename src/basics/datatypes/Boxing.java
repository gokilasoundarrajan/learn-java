package basics.datatypes;

public class Boxing {
	
	public static void main(String[] args) {
		
		int in1 = 10;
		
		// Boxing
		Integer In1 = new Integer(in1);
		
		// Auto-Boxing
		Integer In2 = in1;
		
		// UnBoxing
		int in2 = In1.intValue();
		
		System.out.println(" " + in1 +  " " + in2 + " " + In1 + " " + In2);
	}

}

