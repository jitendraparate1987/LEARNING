package stringprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CumulativeProgram {
	
	public void reveseAnArray() {
		
		String [] Original = {"A","Z","K","R","P","S","H","10","W","L"};
		int num = Original.length -1;
		List<String> Reverse = new ArrayList<>();
		
		
		for(int i=Original.length-1;i>=0;i--) {
			
			Reverse.add(Original[i]);
			
		}
		
		String ReverseArray [] = Reverse.toArray(new String[0]);
		Object ReverseArray1 [] = Reverse.toArray();
		
		Reverse.stream().forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		for(Object s : ReverseArray1) {
			System.out.print(s + " ");
		}
		
		
	}
	
	public void reverseAString() {
		
		String s = "Today is a beautiful day";
		StringBuilder sb = new StringBuilder();
		
		for(int i = s.length()-1;i>=0;i--) {
			
			sb.append(s.charAt(i));
			
			
		}
		
		System.out.print(sb);
				
	}
	
	public void reverseAWord() {
		
		String s = "Hello";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse().toString());
		
	}
	
	public void showAlternateCharsFromTwoStrings() {
		
		String s1 = "abcdef";
		String s2 = "pqrs";
		
		int S1Length =s1.length() ;
		int S2Length =s2.length() ;
		
		int max = Math.max(S1Length, S2Length);
		
		
		for(int i=0;i<max;i++) {
			
			if(i<s1.length()) {
				
				System.out.print(s1.charAt(i));				
			}
			if(i<s2.length()) {
				
				System.out.print(s2.charAt(i));				
			}
			
		}
		
	}
	
	void StringPalindrome() {
		
		String s1 = "malayalam";
		int num = s1.length();
		int j = num-1;
		boolean flag=false;
		for(int i=0;i<num;i++) {
			
			if(s1.charAt(i) == s1.charAt(j)) {
				
				j--;
				flag=true;
				continue;
								
			}else {
				
				flag=true;
				break;
			}
			
		}
		
		
		
	}
	
	public void TwoStringAnagram(){
		
		String s1 = "rescue";
		String s2 = "secure";
		
		List<Character> a1=new ArrayList<Character>();
		List<Character> a2=new ArrayList<Character>();
		
		if(s1.length() == s2.length()) {
			
			for(int i=0;i<s1.length();i++) {
				
				a1.add(s1.charAt(i));
				a2.add(s2.charAt(i));
						
			}
			
			Collections.sort(a1);
			Collections.sort(a2);
			
			
			
			if(a1.equals(a2)) {
				
				System.out.println("Anagram");
				
			}else {
				System.out.println("Not an Anagram as characters are note matching");
			}
			
		}else {
			System.out.println("Not an anagram as length are not equal");
		}
		
				
	}
	
	
	public void CountWordsInAString() {
		
		String s1 ="Hello It's a lovely day";
		String[] s2 = s1.split("\\s+");		
		System.out.println(s2.length);
		
		
	}
	
	public void Fizzbuzz(int num){
		
		
		
		if(num%3==0 && num%5==0) {
			System.out.println("FizzBuzz");
		}else if(num%3==0) {
			System.out.println("Fizz");
		}else if(num%5==0) {
			System.out.println("Buzz");
		}else {
			System.out.println(num);
		}
		
	}
	
	
	public void LargestWordOfTheString() {
		
		String s1 = "I love Nagpur";
		String [] s2 = s1.split("\\s+");
		String largestWord = "";
		
		for(String word : s2) {
			
			if(word.length()> largestWord.length()) {
				
				largestWord = word;
			}
			
		}
		
		System.out.println("Largest Word : " + largestWord);
		
	}
	
	public void uniqueCharactersAndItsCount() {
		
		String s1 = "Hello how are you guys";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		int length = s1.length();
		int temp=0;
		
		for(int i=0;i<length;i++) {
			
			if(map.containsKey(s1.charAt(i))) {
				
				temp = map.get(s1.charAt(i));
				temp++;
				map.put(s1.charAt(i),temp);
				
			}else {
				
				map.put(s1.charAt(i),1);
				
			}
			
		}
		
		System.out.println(map);
		
		
		
	}
	
	public void RemoveDuplicateFromTheString() {
		
		String s1 = "Hello Its a wonderful wonderful day";
		String [] s2 = s1.split("\\s+");
		List<String> Duplicates = new ArrayList<String>();
		
		Duplicates = Arrays.asList(s2);
		
		System.out.println(Duplicates);
		
		Set<String> set = new LinkedHashSet<>(Duplicates);
		
		String s3 = set.toString();
		
		System.out.println(s3);
		
	}
	
	public void replaceFirstWithTheLastCharactersOfTheString() {
		
		String s1 = "Hello I am Jitendra Parate";
		StringBuilder sb = new StringBuilder();
		String middle = s1.substring(1, s1.length());
		sb.append(s1.charAt(s1.length()-1));
		sb.append(middle);
		sb.append(s1.charAt(0));
		
		System.out.println(sb);
		
		
		
	}
	
	public void removeTheDigitsFromTheString() {
		
		String s1 = "I have 10 apples";
		String s2 = s1.replaceAll("[0-9]", "");
		System.out.println(s2);
		
	}
	
	public void createDifferentArraysfromChars() {
		
		String [] inputArray = {"a", "1", "@", "b", "2", "#", "c", "3", "$"};
		
		List<String> CharArray = new ArrayList<>();
		List<String> DigitArray = new ArrayList<>();
		List<String> SpecialCharArray = new ArrayList<>();
		
		int length = inputArray.length;
		
		for(int i=0;i<length;i++) {
			
			if(inputArray[i].matches("[A-Za-z]")) {
				CharArray.add(inputArray[i]);
				
			}else if(inputArray[i].matches("[^A-Za-z0-9]")) {
				SpecialCharArray.add(inputArray[i]);
				
			}else {
				DigitArray.add(inputArray[i]);
			}
			
		}
		
		String [] a1 = CharArray.toArray(new String [0]);
		Object a2 = SpecialCharArray.toArray();
		Object a3 = DigitArray.toArray();
		
		System.out.println(CharArray);
		System.out.println(SpecialCharArray);
		System.out.println(DigitArray);
		
	}
	
	public void FindTheFirstNonRepeatedCharacterInAString() {
		
		String s1 = "Hello its a wonderful day";
		Map<Character,Integer> map = new LinkedHashMap<>();
		int temp=0;
		
		
		for(int i=0;i<s1.length();i++) {
			
			if(map.containsKey(s1.charAt(i))) {
				
				temp = map.get(s1.charAt(i));
				temp++;
				map.put(s1.charAt(i), temp);
				
			}else {
				map.put(s1.charAt(i), 1);
				
			}
			
		}
		
		
		for(char k : map.keySet()) {
			
			if(map.get(k)==1) {
				
				System.out.println(k + " : occurrence : " + map.get(k));
				break;
				
			}
			
		}
		
		
		
	}
	
	public void CountVowelsAndConsonantsInAString() {
		
		String s1 = "Hello its a wonderful day my friend";
		Map<String,Integer> map = new HashMap<>();
		int vowels =0;
		int consonants=0;
		
		for(int i=0;i<s1.length();i++) {
			
			if(s1.charAt(i)=='a' ||s1.charAt(i)=='e'|| s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u' || s1.charAt(i)=='A'|| 
					s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U') {
				
				vowels++;
			} else {
				consonants++;
			}
			
			
		}
		
		map.put("Vowels", vowels);
		map.put("Consonants", consonants);
		
		System.out.println(map);
		
	}
	
	public void ReversetheStringwithWordsIntact() {
		
		String str = "Welcome to Bangalore Buddy";  // O/P : Bangalore to Welcome 
		String [] s1 = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=s1.length-1;i>=0;i--) {
			
			sb.append(s1[i]);
			sb.append(" ");
			
		}
		
		System.out.println(sb.toString());
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		CumulativeProgram CP = new CumulativeProgram();
		CP.reveseAnArray();
		CP.reverseAString();
		CP.reverseAWord();
		CP.showAlternateCharsFromTwoStrings();
		CP.TwoStringAnagram();
		CP.CountWordsInAString();
		CP.Fizzbuzz(80);
		CP.LargestWordOfTheString();
		CP.uniqueCharactersAndItsCount();
		CP.RemoveDuplicateFromTheString();
		CP.replaceFirstWithTheLastCharactersOfTheString();
		CP.removeTheDigitsFromTheString();
		CP.createDifferentArraysfromChars();
		CP.FindTheFirstNonRepeatedCharacterInAString();
		CP.CountVowelsAndConsonantsInAString();
		CP.LargestWordOfTheString();
		CP.ReversetheStringwithWordsIntact();
		
	}

}
