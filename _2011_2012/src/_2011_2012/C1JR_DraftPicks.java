package _2011_2012;
import java.util.*;
import java.io.*;

public class C1JR_DraftPicks {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1112c1jr.in"));
			for(int x = 0; x < 2; x++) {
				int overTenMil = 0;
				double averageSalary = 0;
				double [] smallSalary = new double[5];
				double [] bigSalary = new double[5];
				double smallAverage = 0;
				double bigAverage = 0;
				for(int y = 0; y < 5; y++) {
					String [] temp = in.nextLine().split(" ");
					double years = Double.parseDouble(temp[0]);
					double fullContract = Double.parseDouble(temp[1]);
					double annualSalary = fullContract / years;
					
					smallSalary[y] = annualSalary / 16;
					bigSalary[y] = annualSalary / 18;
					
					if(annualSalary > 10) {
						overTenMil++;
					} else {
						//do nothing
					}
					
					averageSalary += annualSalary;
					
					smallAverage += smallSalary[y];
					bigAverage += bigSalary[y];
				}
				
				System.out.println(overTenMil);
				
				averageSalary = (averageSalary / 5) * 1000000;
				System.out.println(String.format("%.0f", averageSalary));
				
				Arrays.sort(smallSalary);
				smallSalary[0] *= 1000000;
				System.out.println(String.format("%.0f", smallSalary[0]));
				
				Arrays.sort(bigSalary);
				bigSalary[4] *= 1000000;
				System.out.println(String.format("%.0f", bigSalary[4]));
				
				smallAverage /= 5;
				bigAverage /= 5;
				double difference = (Math.abs(smallAverage - bigAverage)) * 1000000;
				System.out.println(String.format("%.0f", difference));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}