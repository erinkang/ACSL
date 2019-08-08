package _2003_2004;
import java.io.File;
import java.util.Scanner;

public class C1JR_Digits {
	public static void main(String [] args){
		try {
			Scanner in = new Scanner(new File("0304c1jr.in"));
			// 1. giant for-loop
			for(int x = 0; x < 10; x++) {
				
				// 2. organize data
				String temp = in.nextLine();
				int [] num = new int[temp.length()];
				for(int i = 0; i < num.length; i++) {
					num[i] = Character.getNumericValue(temp.charAt(i));
				}
				
				// 3. find largest digit
				int indexL = 0;
				for(int i = 0; i < num.length; i++) {
					if(num[indexL] < num[i]) {
						indexL = i;
					}
				}
				
				// 4. process and replace digit
				if(num[indexL] % 2 == 1) {
					num[indexL] = 0;
				} else {
					num[indexL] += 4;
					if(num[indexL] >= 10) {
						num[indexL] = num[indexL] % 10;
					}
				}
				
				// 5. clean new value
				String str = "";
				for(int i = 0; i < num.length; i++) {
					str += num[i];
				}
				if(str.charAt(0) == '0') {
					str = str.substring(1);
				}
				
				// 6. output
				System.out.println(str);			
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}