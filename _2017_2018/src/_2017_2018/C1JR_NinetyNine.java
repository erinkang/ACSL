package _2017_2018;
import java.util.*;
import java.io.*;

public class C1JR_NinetyNine {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1718c1jr.in"));
			for(int x = 0; x < 10; x++) {
				int score = in.nextInt();
				ArrayList<Integer> player = new ArrayList<Integer>();
				ArrayList<Integer> dealer = new ArrayList<Integer>();
				
				for(int i = 0; i < 4; i++) {
					player.add(in.nextInt());
				}
				for(int i = 0; i < 3; i++) {
					dealer.add(in.nextInt());
					player.add(in.nextInt());
				}
				
				while(true) {
					int temp = player.remove(0);
					score += convert(temp, score);
					if(score > 99) {
						System.out.println(score + " dealer");
						break;
					}
					int temp2 = dealer.remove(0);
					score += convert(temp2, score);
					if(score > 99) {
						System.out.println(score + " player");
						break;
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static int convert(int temp, int score){
		if(temp == 4) {
			temp = -10;
		} else if(temp == 9) {
			temp = 0;
		} else if(temp == 0) {
			if(score + 11 < 100) {
				temp = 11;
			} else {
				temp = 1;
			}
		}
		return temp;
	}
}