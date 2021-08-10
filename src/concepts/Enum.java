package concepts;

public class Enum {

	public static void main(String[] args) {

		Rank rank = null;
		int mark =90;
		if(mark>=90)
			System.out.println(rank.DISTINCTION);
	}
}


enum Rank{DISTINCTION, FIRSTCLASS, SECONDCLASS, THIRDCLASS}
