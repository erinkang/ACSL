package _2010_2011;
import java.util.*;
import java.io.*;

public class C1JR_Prints {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1011c1jr.in"));
			for(int x = 0; x < 7; x++) {
				String [] temp = in.nextLine().split(" ");
				int [] num = new int[temp.length - 1];
				for(int i = 0; i < num.length; i++) {
					num[i] = Integer.parseInt(temp[i]);
				}
				int [] print = {16, 16, 8, 8, 4, 4, 2, 2, 1, 1};
				int topCount = 1;
				int bottomCount = 1;
				for(int i = 0; i < num.length; i++) {
					if(num[i] % 2 == 0) {
						topCount += print[num[i] - 1];
					} else {
						bottomCount += print[num[i] - 1];
					}
				}
				System.out.println(topCount + "/" + bottomCount);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}