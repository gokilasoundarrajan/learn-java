package concepts;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		// 1. using new keyword
		A a1 = new A();
		System.out.println("a1: " + a1);
		System.out.println("--------------------------------");

		// 2. Using clone() method
		ClonningClass clonningClass1 = new ClonningClass();
		ClonningClass clonningClass2 = (ClonningClass) clonningClass1.clone();
		System.out.println("clonningClass1" + clonningClass1);
		System.out.println("clonningClass2" + clonningClass2);
		System.out.println("--------------------------------");

		// 3. using instanceOf() method from class Class
		// @Deprecated(since="9")

//		try {
//			Class<?> Ab = Class.forName("A");
//			@SuppressWarnings("deprecation")
//			ObjectCreation obj = (ObjectCreation) Ab.newInstance();
//			System.out.println("obj: " + obj);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}

		// 4. Using newInstance() method of Constructor class
		java.lang.reflect.Constructor<A> constructor = null;
		A objectCreation = null;

		try {
			constructor = A.class.getDeclaredConstructor();
			objectCreation = constructor.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		System.out.println("object " + objectCreation);

		
		// 5. using Deserialization
//		InputStream inputStream = null;
//		ObjectInputStream objectInputStream = null;
//		A object = null;
//		try {
//			objectInputStream = new ObjectInputStream(inputStream);
//			object = (A) objectInputStream.readObject();
//		} catch (ClassNotFoundException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		System.out.println("object: " + object);
	}
}

class A {
	A() {
		System.out.println("Do Nothing");
	}
}

class ClonningClass implements Cloneable {

	public ClonningClass() {
		System.out.println("Clone the class");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}