package _2016_2017;
import java.util.*;
import java.io.*;

public class C1JR_AGRAM {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1617c1jr.in"));
			for(int x = 0; x < 10; x++) {
				int [] value = new int[6];
				String [] suit = new String[6];
				
				String [] temp = in.nextLine().split(" ");
				int j = 0;
				int k = 0;
				for(int i = 0; i < temp.length; i++) {
					if(i % 2 == 0) {
						value[j] = Integer.parseInt(temp[i]);
						j++;
					} else {
						suit[k] = temp[i];
						k++;
					}
				}
				int opponentValue = value[0];
				ArrayList<Integer> foundValue = new ArrayList<Integer>();
				String opponentSuit = suit[0];
				ArrayList<Integer> foundSuit = new ArrayList<Integer>();
				
				for(int i = 1; i < suit.length; i++) {
					if(opponentSuit.equals(suit[i])) {
						foundSuit.add(i);
					}
				}
				for(int l : foundSuit) {
					foundValue.add(value[l]);
				}
				Collections.sort(foundValue);
				int finalValue = 0;
				for(int i = 0; i < foundValue.size(); i++) {
					if(foundValue.get(i) <= opponentValue) {
						finalValue = Collections.min(foundValue);
					} else {
						finalValue = foundValue.get(i);
						break;
					}
				}
				if(finalValue == 0) {
					System.out.println("NONE");
				} else {
					System.out.println(finalValue + " " + opponentSuit);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}