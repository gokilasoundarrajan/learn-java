package basics.datatypes;

public class InstanceBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlockDemo2 ib = new InstanceBlockDemo2();
	}

}

class InstanceBlockDemo1 {
	InstanceBlockDemo1() {
		System.out.println("InstanceBlockDemo1 Constructor");   // 2
	}
	{
		System.out.println("Instance Block1");					// 1
	}
}

class InstanceBlockDemo2 extends InstanceBlockDemo1 {
	InstanceBlockDemo2() {
		System.out.println("InstanceBlockDemo2 Constructor");	// 4
	}

	{
		System.out.println("Instance Block2");					// 3
	}
	{
		System.out.println("Instance Block3");					// 3
	}
}
