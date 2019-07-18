package _2005_2006;
import java.util.*;

import org.omg.CORBA.SystemException;

import java.io.*;

public class PostOffice {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("0506c1jr.in"));
			for(int i = 0; i < 10; i++) {
				String [] temp = in.nextLine().split(" ");
				double length = Double.parseDouble(temp[0]);
				int height = Integer.parseInt(temp[1]);
				double width = Double.parseDouble(temp[2]);
				
				boolean pC = false, lPC = false, e = false, lE = false, p = false, lP = false;
				if(length < 24 && height <= 18 && width <= 0.5) {
					//postage
					if(width < 0.016 && width >= 0.007) {
						pC = true;
						lPC = true;
					} else if(width < 0.25) {
						e = true;
					} else if(width >= 0.25) {
						lE = true;
					} else {
						//not mailable for now??
					}
				} else {
					//package
					double pack = length + 2 * (height + width);
					if(pack <= 84) {
						p = true;
					} else if(pack > 84 && pack < 130) {
						lP = true;
					}
				}
				
				if(pC) {
					if(length >= 3.5 && length <= 4.25 && height >= 3.5 && height <= 6) {
						System.out.println("regular post card");
					} else if(length < 6 && height < 11.5) {
						System.out.println("large post card");
					} else {
						System.out.println("unmailable");
					}
				} else if(e){
					if(length >= 3.5 && length <= 6.125 && height >= 5 && height <= 11.5) {
						System.out.println("envelope");
					} else {
						System.out.println("unmailable");
					}
				} else if(lE) {
					if(length > 6.125 && height >= 11) {
						System.out.println("large envelope");
					} else {
						System.out.println("unmailable");
					}
				} else if(p){
					System.out.println("package");
				} else if(lP) {
					System.out.println("large package");
				} else {
					System.out.println("unmailable");
				}
			} 
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}