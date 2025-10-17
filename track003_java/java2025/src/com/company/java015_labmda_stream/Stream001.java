package com.company.java015_labmda_stream;

import java.util.Arrays;
import java.util.List;

public class Stream001 {

	public static void main(String[] args) {
		// 데이터 종류에 상고나없이 (Stream) 같은방식으로 처리
		
		Integer[] 	   arr = {1,2,3,4,5};	// 배열
		List<Integer> list = Arrays.asList(arr);
		
		// 	  stream (흐름)
		Arrays.stream(arr).forEach( t -> System.out.println(t));
			
		//		list.stream().forEach(null);
		
		System.out.println();
		System.out.println();
		
		//		list.stream().forEach( t -> System.out.println(t));
				list.stream().forEach(System.out::println);
			
			//void java.util.function.Consumer.accept( T t )
			// ( T t ) -> x / accept
		
		
	}

}
