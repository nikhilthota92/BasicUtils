package utilities;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="aabbeebfgh";
		String new1=Arrays.asList(myString.split(""))
        .stream()
        .distinct()
        .collect(Collectors.joining());
		System.out.println(new1);
	}
	

}
