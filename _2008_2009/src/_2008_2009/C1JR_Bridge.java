package _2008_2009;
import java.util.*;
import java.io.*;

public class C1JR_Bridge {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("0809c1jr.in"));
			for(int x = 0; x < 10; x++) {
				String [] temp = in.nextLine().split(" ");
				int bid = Integer.parseInt(temp[0]);
				int trick = Integer.parseInt(temp[1]);
				String suit = temp[2];
				
				trick -= 6;
				int line = trick - bid;
				if(suit.equals("H") || suit.equals("S")) {
					int under = bid * 30;
					int over = line * 30;
					System.out.println(under + ", " + over);
				} else if(suit.equals("C") || suit.equals("D")) {
					int under = bid * 20;
					int over = line * 20;
					System.out.println(under + ", " + over);
				} else {
					int under = (bid * 30) + 10;
					int over = line * 30;
					System.out.println(under + ", " + over);
				}
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}