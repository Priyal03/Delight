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
		
	//	findPair(arr, sum);
		
		List<Integer> list = new ArrayList<>(n);

		for (int x : arr) {
			list.add(x);
		}

		int index = 0;
		while (list.size() > 0) { //working in less than n passes.

			int current = list.get(index);
			int diff = sum - current;

			if (list.contains(diff)) { // but here the complexity is O(n)

				System.out.println(diff + " " + current);
				list.remove(Integer.valueOf(diff)); //use of valueOf to remove the Integer Object as list.remove works with index by default

			}
			list.remove(Integer.valueOf(current));
		}
	}
//nlogn solution
	private static void findPair(int[] arr, int sum) {
		// TODO Auto-generated method stub
		
		int low = 0, high = arr.length-1;
		Arrays.sort(arr);
		
		while(low<high) {
			
			if(arr[low]+arr[high]==sum) {
				System.out.println(arr[low] + " " + arr[high]);
				return;
			}
			else {
				if(arr[low]+arr[high]<sum) {
					low++;
				}else
					high--;
			}
		}
		
	}
}
/**
 * 6 1 2 3 4 5 6 5
 */
