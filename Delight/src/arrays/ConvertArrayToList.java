package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.zip.InflaterInputStream;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//stream API, with collectors.
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.forEach(x->System.out.print(x+" "));
		
		list = new ArrayList<Integer>(n); //old style.
		for(int x:arr) {
			list.add(x);
		}
		System.out.println(list);
		
		
		//stream API, with Intstream and collectors.
		list = IntStream.of(arr).boxed().collect(Collectors.toList());
		list.forEach(x->System.out.print(x+" "));
		
		
		//boxedArray conversion 
		Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Collections.addAll(list, boxedArray);
		list.forEach(x->System.out.print(x+" "));
	}
}