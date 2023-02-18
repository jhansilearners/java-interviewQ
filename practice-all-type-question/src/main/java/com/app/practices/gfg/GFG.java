package com.app.practices.gfg;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

class GFG {
	public static void main (String[] args) {
		//code
		System.out.println("-----------");
		//ArrayList<StringBuilder> sbList=new ArrayList<>();
		String revData[];
		try(Scanner s=new Scanner(System.in);){
		
		int inputs=s.nextInt();
		revData=new String[inputs];
	    
	    StringBuilder wordsToConcatAndRev=null;
	    Optional<String> str=null;
	    Optional<String> str1=null;
		for(int i=0;i<inputs;i++){
			wordsToConcatAndRev=new StringBuilder();
		    str=Optional.ofNullable(s.nextLine());
		    wordsToConcatAndRev.append(str.orElse(""));
    		str1=Optional.ofNullable(s.nextLine().trim());
    		wordsToConcatAndRev.append(str1.orElse(""));
    		// after concatenation reverse words
    		revData[i]=wordsToConcatAndRev.reverse().toString();	
		}
	}
		Stream.of(revData).parallel().forEachOrdered(System.out::println);
	}
}