package com.app.kk.kk.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMoreExample {
	
	public static void main(String[] args) throws Exception {
		//example to print integer 1 to 9 using stream
		
        IntStream.range(1,10).forEach(System.out::print);
        
        IntStream.range(1, 10).skip(5).forEach(i->System.out.println(i));
        
        IntStream.range(1, 50).sum();
        
       long count= Arrays.asList("anil","pal","ajay","Pal").stream().count();
       System.out.println("count :"+count);
       List<String> aName=Stream.of("anil","pal","ajay","Pal").filter(s->s.startsWith("a")).collect(Collectors.toList());
       System.out.println(aName);
       String[] arr= {"ram","shayam","kam"};
       Arrays.stream(arr).map(n->n.toUpperCase()).forEach(System.out::println);
       // read file data to stream 
       
      // Stream<String> fileLines=Files.lines(Paths.get("D:\\java\\hibernate\\hibernate program\\Firstapp\\hibernate.cfg.xml"));
       Supplier<Stream<String>> fileLines=()->{
		try {
			return Files.lines(Paths.get("C:\\Users\\Anil\\eclipse-workspace\\kk\\src\\main\\resources\\test.prop"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	};
	    
       //fileLines.filter(line->line.length()>15).sorted().forEach(System.out::println);
       Map<String,String> keyValue=fileLines.get().map(s->s.split(",")).filter(x->x.length>3).collect(Collectors.toMap(x->x[0], x->x[1])); 
       System.out.println("---------------");
       fileLines.get().map(s->s.split(",")).filter(a->a.length>3&&Integer.parseInt(a[1])>10).forEach(s->System.out.println(Arrays.toString(s)));
       System.out.println(keyValue);
       
       // use of reduce method 
       System.out.println( IntStream.range(1, 6).reduce(0,(i1,i2)->i1+i2));
       System.out.println( fileLines.get().reduce((i1,i2)->i1+i2).get());
       
       String data="My Name is Anil Pal";
       Map<Character,Integer> map=new HashMap<>();
       
		data.codePoints().filter(c -> ' ' != (char) c).forEach(ch -> {
			char dc = (char) ch;
			if (map.containsKey(dc)) {
				map.put(dc, map.get(dc) + 1);
			} else {
				map.put(dc, 1);
			}
		});
       System.out.println(map);
       
       toWorkWithSameStreamObj();
        
       System.out.println(data.codePoints().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
       
       
	}
	
	public static void toWorkWithSameStreamObj() {
		//Need to use same stream two time for that 
		Supplier<Stream<String>> listNames=()->Stream.of("1","2","3");
		listNames.get().forEach(System.out::println);
		listNames.get().map(x->x.concat("1")).forEach(System.out::println);
		
		
		
	}
}
