import java.util.*;

public class Sequence {
	public static void main(String[] args) {
		String str[] = {"A","C","G","T"};
		Random random = new Random();

		int count = 0; 
		for (int i=0; i<500; i++) {
			String seq = "";
			seq +=str[random.nextInt(4)];
			seq +=str[random.nextInt(4)];
			seq +=str[random.nextInt(4)];
		
			System.out.println(seq);

			if (seq.equals("AAA")) {count++;}
		}
		System.out.println("AAA/Total: "+count+"/100");
	}
}