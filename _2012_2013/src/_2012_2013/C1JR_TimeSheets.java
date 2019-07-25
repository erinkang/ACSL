package _2012_2013;
import java.util.*;
import java.io.*;

public class C1JR_TimeSheets {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1213c1jr.in"));
			for(int x = 0; x < 2; x++) {
				double totalPay = 0;
				for(int y = 0; y < 4; y++) {
					String [] temp = in.nextLine().split(" ");
					int location = Integer.parseInt(temp[0]);
					char temp2 = temp[1].charAt(0);
					int start = Character.getNumericValue(temp2);
					char temp3 = temp[2].charAt(0);
					int end = Character.getNumericValue(temp3);
					
					double fullTime = end - start;
					
					if(location >= 1 && location <= 9) {
						fullTime *= 5;
					} else if(location <= 19) {
						if(fullTime <= 8) {
							fullTime *= 4;
						} else {
							fullTime = 32 + (fullTime - 8) * 6;
						}
					} else {
						if(fullTime <= 8) {
							fullTime *= 6;
						} else {
							fullTime = 48 + (fullTime - 8) * 12;
						}
					}
					totalPay += fullTime;
					System.out.println("$" + String.format("%.2f", fullTime));
				}
				System.out.println("$" + String.format("%.2f", totalPay));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}