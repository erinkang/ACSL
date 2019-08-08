package _2003_2004;
import java.util.*;
import java.io.*;

public class C2JR_CoinStrip {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("0304c2jr.in"));
			for(int x = 0; x < 9; x++) {
				in.nextInt();
				int numCoins = in.nextInt();
				int firstCoin = 0;
				int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
				for(int i = 0; i < numCoins ; i++) {
					int secondCoin = in.nextInt();
					int movements = (secondCoin - firstCoin) - 1;
					if(movements >= 5) {
						count5++;
					}
					if(movements >= 4) {
						count4++;
					}
					if(movements >= 3) {
						count3++;
					}
					if(movements >= 2) {
						count2++;
					}
					if(movements >= 1) {
						count1++;
					}
					firstCoin = secondCoin;
				}
				System.out.println(count1 + " " + count2 + " " + count3 + " " + count4 + " " + count5);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}