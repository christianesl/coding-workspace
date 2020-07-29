package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void findDuplicateWord(String phrase) {
		String duplicatePattern = "\\b(\\w+)\\s[\\w\\W]*\\s\\1\\b";
		int counter = 0;
		Pattern p = Pattern.compile(duplicatePattern, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(phrase);

		System.out.println("Input= " + phrase);
		while (m.find()) {
			counter++;
			System.out.println("Substring: " + m.group(0));
			System.out.println("word: " + m.group(1));

		}
		System.out.println("Word counter: " + counter + "\n");
	}

	public static void processRegex(String regex, String input) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		int count = 0;
		while (m.find()) {
			count++;
			System.out.println("group(): " + m.group());			
			System.out.println("group(1): " + m.group(1));
			System.out.println("group(2): " + m.group(2));
		}

		System.out.println("count: " + count);
	}

	public static void main(String[] args) {
		String temp = "$%@cvm,82htdh&(&%*%";
		System.out.println("Remove non-numerica characters of " + temp);
		System.out.println("Numeric string " + temp.replaceAll("[^0-9]", ""));
		System.out.println("Numeric string " + temp.replaceAll("\\D", ""));
		String abc = ".a.b.c.d.e";
		abc = abc.replace(".", ""); // plain text
		System.out.println("abc text: " + abc);

		String Str = new String("Welcome to Tutorialspoint.com");

		System.out.print("Return Value 1:");
		System.out.println(Str.matches(".*Tutorials(.*)"));

		System.out.print("Return Value 2:");
		System.out.println(Str.matches("Tutorials"));

		System.out.print("Return Value 3:");
		System.out.println(Str.matches("Welcome(.*)"));

		String[] words = { "{apf", "hum_", "dkoe", "12f" };
		for (String s : words) {
			if (s.matches("[a-z]+")) {
				System.out.println(s);
			}

		}

		findDuplicateWord("word by one two word");
		findDuplicateWord("this is#$375891 is home alone is it");
		findDuplicateWord("this #$is;%@;<>?|\\` p is a is Test of duplicate test");

		String input = "As a describer of abb ccd life and manners, he must be allowed to stand perhaps the first of the first rank. His humour, which, as Steele observes, is peculiar to himself, is so happily diffused as to give the grace of novelty to domestic scenes and daily occurrences. He never \"o'ersteps BBBBB the modesty of nature,\" nor raises merriment or wonder by the violation of truth. His figures 1662 neither divert by distortion nor amaze by aggravation. He copies life with so much fidelity that he can be hardly said to invent; yet his exhibitions have an air so much original, that it is difficult to suppose them not merely the product of imagination.c 1982 BRE";
		String regex = "\\b[a-zA-Z]{3}\\b";
//		processRegex(regex, input);
		System.out.println("-----");
		String regex2 = "\\s(\\w{3})\\s(\\w{3})\\s";
		processRegex(regex2, input);

	}

}
