package _2006_2007;
import java.util.*;
import java.io.*;

public class C1JR_Probability {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("0607c1jr.in"));
			for(int x = 0; x < 8; x++) {
				String [] temp = in.nextLine().split(" ");
				int pick = Integer.parseInt(temp[0]);
				int numRed = Integer.parseInt(temp[1]);
				int numBlue = Integer.parseInt(temp[2]);
				int total = numRed + numBlue;
				int fraction;
				int yTotal = total * total;
				int nTotal = total * (total - 1);
				if(pick == 1) {
					if(temp[3].contains("R")) {
						System.out.println(numRed + "/" + total);
					} else {
						System.out.println(numBlue + "/" + total);
					}
				} else {
					if(temp[3].contains("Y")) {
						if(temp[4].equals(temp[5])) {
							if(temp[4].contains("R")) {
								fraction = numRed * numRed;
							} else {
								fraction = numBlue * numBlue;
							}
						} else {
							fraction = numRed * numBlue;
						}
						System.out.println(fraction + "/" + yTotal);
					} else {
						if(temp[4].equals(temp[5])) {
							if(temp[4].contains("R")) {
								fraction = numRed * (numRed - 1);
							} else {
								fraction = numBlue * (numBlue - 1);
							}
						} else {
							fraction = numRed * numBlue;
						}
						System.out.println(fraction + "/" + nTotal);
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}