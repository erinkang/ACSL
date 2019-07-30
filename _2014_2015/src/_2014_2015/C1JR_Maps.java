package _2014_2015;
import java.util.*;
import java.io.*;

public class C1JR_Maps {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1415c1jr.in"));
			for(int x = 0; x < 2; x++) {
				String [] temp = in.nextLine().split(" ");
				int milesPerGallon = Integer.parseInt(temp[0]);
				double gasolineCost = Double.parseDouble(temp[1]);
				int averageSpeed = Integer.parseInt(temp[2]);

				int [] findDistance = {450, 140, 120, 320, 250, 80};
				for(int i = 0; i < 5; i++) {
					int dist = 0;
					String distance = in.nextLine();
					char temp1 = distance.charAt(0);
					char temp2 = distance.charAt(2);
					int start = Character.getNumericValue(temp1) - 10;
					int end = Character.getNumericValue(temp2) - 10;
					
					//finding the actual distance
					while(start < end) {
						dist += findDistance[start];
						start++;
					}
					System.out.print(dist + " ");
					
					double tempTime = dist / averageSpeed;
					double temp1Time = 1.0 * dist / averageSpeed;
					String firstTime = String.format("%.0f", tempTime);
					double tempSecondTime = (Double.parseDouble(String.format("%.2f", temp1Time)) - tempTime) * 60;
					String secondTime = String.format("%.0f", tempSecondTime);
					String time = firstTime + ":" + secondTime;
					if(time.length() == 3) {
						time = "0" + time + "0";
					} else if(time.length() == 4) {
						time += "0";
					} else {
						//we're all good
					}
					System.out.print(time + " ");
					
					double cost = (dist / milesPerGallon) * gasolineCost;
					String modifiedCost = (String.format("%.2f", cost));
					System.out.println("$" + modifiedCost);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}