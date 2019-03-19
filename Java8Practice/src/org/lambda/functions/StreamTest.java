package org.lambda.functions;

import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		Stream.of(10,20,22,12,14).reduce((x,y)->x+y).ifPresent(System.out::println);
		 
        Stream.of(10,20,22,12,14).reduce(Integer::sum).ifPresent(System.out::println);
 
        Stream.of("java", "c", "c#", "python").reduce((x,y)->x+" | "+y).ifPresent(System.out::println);

	}

}
