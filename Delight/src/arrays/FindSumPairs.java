/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * @author coder
 *
 */
public class FindSumPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// pass array here
		int arr[] = new int[n];
		int t = 0;

		while (t < n) {
			arr[t] = sc.nextInt();
			t++;
		}

		int sum = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int x : arr) {
			list.add(x);
		}

		int index = 0;
		while (list.size() > 0) {

			int current = list.get(index);
			int diff = sum - current;

			if (list.contains(diff)) {

				System.out.println(diff + " " + current);
				list.remove(Integer.valueOf(diff));

			}
			list.remove(Integer.valueOf(current));
		}
	}
}
/**
 * 6 1 2 3 4 5 6 5
 */
