package accessmodifier;

public class InstanceBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlockDemo2 ibd2 = new InstanceBlockDemo2();
	}

}

class InstanceBlockDemo1 {
	InstanceBlockDemo1() {
		System.out.println("InstanceBlockDemo1: Constructor");
	}

	{
		System.out.println("InstanceBlockDemo1: Instance Block");
	}
}

class InstanceBlockDemo2 extends InstanceBlockDemo1 {
	InstanceBlockDemo2() {
		System.out.println("InstanceBlockDemo2: Constructor");
	}

	{
		System.out.println("InstanceBlockDemo2: Instance Block");
	}
}