package project.highestcost;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestCost {

	public static void main(String arg[]) {
		String s = "aaaaabbbcdee";
		String r = "bbookkle";
		int maxFeq = 0;
		maxFeq = executeMethod(s, r);
		System.out.println(maxFeq);
	}

	public static int executeMethod(String s, String r) {
		int result = 0;
		
		
		Function<String, Integer> f = string -> {
			int cost = 0;
			String stringWithoutDuplicates = Arrays.asList(string.split(""))
													.stream()
													.distinct()
													.collect(Collectors.joining());
			
			char[] charArray=stringWithoutDuplicates.toCharArray();
			
			for (char c : charArray) {
				int i = 0;
				
				i = s.length() - s.replaceAll(Character.toString(c), "").length();
				
				if (i > 1) {
					cost = cost + (2 * i);
				}
			}
			return cost;
		};
		int sCost=0;
		int rCost=0;
		sCost=f.apply(s);
		System.out.println("Scost"+sCost);
		rCost=f.apply(r);
		System.out.println("Rcost"+rCost);
		
		if(sCost>=rCost) {
			result=sCost;
		}
		else {
			result=rCost;
		}
		return result;
	}
}
