package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();//taking inputs 
		List<Integer> list = new ArrayList<Integer>(n);
		
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		
		//using set, foreach, lambda
		Set<Integer> set = new HashSet<Integer>(list);
		set.forEach(x->System.out.println(x+" occurred "+Collections.frequency(list, x)+" times!"));
		
		
		//using map, foreach with biConsumer and lambda.
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int x:list) {
			map.computeIfPresent(x, (k,v)->v+1);
			map.computeIfAbsent(x, v->1);
		}
		map.forEach((k,v)->System.out.println(k+" "+v));
		
		
		//using stream api with groupingBy Function
		Map<Integer, Long> map2 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map2.forEach((k,v)->System.out.println(k+" yo "+v));
	}
}
