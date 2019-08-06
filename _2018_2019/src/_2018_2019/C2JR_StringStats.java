package _2018_2019;
import java.util.*;
import java.io.*;

public class C2JR_StringStats {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1819c2jr.in"));
			for(int x = 0; x < 1; x++) {
				String temp = in.nextLine();
				//1
				String one = temp.toLowerCase().replaceAll("[^a-z]", "");
				String [] first = one.split("");
				Set<String> numDifferentLetters = new HashSet<String>();
				for(int i = 0; i < first.length; i++) {
					numDifferentLetters.add(first[i]);
				}
				int numberOne = numDifferentLetters.size();
				System.out.println(numberOne);
				
				//2
				String two = temp.toLowerCase().replaceAll("[^aeiou]", "");
				int numberTwo = two.length();
				System.out.println(numberTwo);
				
				//3
				String three = temp.replaceAll("[^A-Z]", "");
				int numberThree = three.length();
				System.out.println(numberThree);
				
				//4
				String four = temp.toLowerCase().replaceAll("[^a-z]", "");
				Map<Character, Integer> m = new HashMap<Character, Integer>();
				for(int i = 0; i < four.length(); i++) {
					char key = four.charAt(i);
					if(m.containsKey(key)) {
						m.put(key, m.get(key) + 1);
					} else {
						m.put(key, 1);
					}
				}
				int max = 0;
				for(char key : m.keySet()) {
					max = Math.max(max, m.get(key));
				}
				System.out.println(max);
				
				//5
				String five = temp.toLowerCase().replaceAll("[^a-z ]", "");
				String [] split = five.split(" ");
				String [] split2 = five.split(" ");
				for(int i = 0; i < split.length; i++) {
					split[i] = "" + split[i].length();
				}
				int original = 0;
				for(String i : split) {
					original = Math.max(original, Integer.parseInt(i));
				}
				ArrayList<String> alphabet = new ArrayList<String>();
				for(int i = 0; i < split.length; i++) {
					if(split[i].contains("" + original)) {
						alphabet.add(split2[i]);
					}
				}
				Collections.sort(alphabet);
				System.out.println(alphabet.get(0));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}