package _2013_2014;
import java.util.*;
import java.io.*;

public class C1JR_Scrabble {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1314c1jr.in"));
			for(int x = 0; x < 2; x++) {
				String [] word = in.nextLine().split(" ");
				int [] worth = new int[4];
				for(int y = 0; y < word.length; y++) {
					if(word[y].equals("A") || word[y].equals("E")) {
						worth[y] = 1;
					} else if(word[y].equals("D") || word[y].equals("R")) {
						worth[y] = 2;
					} else if(word[y].equals("B") || word[y].equals("M")) {
						worth[y] = 3;
					} else if(word[y].equals("V") || word[y].equals("Y")) {
						worth[y] = 4;
					} else {
						worth[y] = 8;
					}
				}
				
				for(int q = 0; q < 5; q++) {
					int sum = 0;
					int [] position = new int[4], worthy = worth.clone();
					position[0] = Integer.parseInt(in.nextLine());
					position[1] = position[0] + 1;
					position[2] = position[0] + 2;
					position[3] = position[0] + 3;
					
					
					boolean seven = false;
					boolean eight = false;
					for(int i = 0; i < 4; i++) {
						if(position[i] % 3 == 0 && position[i] % 6 != 0) {
							worthy[i] *= 2;
						} else if(position[i] % 5 == 0) {
							worthy[i] *= 3;
						} else if(position[i] % 7 == 0){
							seven = true;
						} else if(position[i] % 8 == 0) {
							eight = true;
						} else {
							//do nothing
						}
					}
					for(int j : worthy) {
						sum += j;
					}
					if(seven) {
						sum *= 2;
					}
					if(eight) {
						sum *= 3;
					}
					System.out.println(sum);
				}
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}