package _2007_2008;
import java.util.*;
import java.io.*;

public class C1JR_Triangles {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("0708c1jr.in"));
			for(int x = 0; x < 10; x++) {
				String [] temp = in.nextLine().split(" ");
				int count = 0;
				for(int i = 0; i < 3; i++) {
					for(int j = 3; j < 6; j++) {
						if(temp[i].equals(temp[j])) {
							count++;
							temp[j] = "0";
							break;
						}
					}
				}
				System.out.println(count);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}