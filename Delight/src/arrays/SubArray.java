package arrays;

import java.util.Scanner;
// need to solve for this case
// 6
//98 -7 3 1 3 99
public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// pass array here
		int arr[] = new int[n];
		int t = 0;
		boolean flag = false;

		while (t < n) {
			arr[t] = sc.nextInt();
			t++;
		}
		
		int sum = arr[0];
		for(int i=1;i<n;i++) {
			
			sum+=arr[i];
			
			if(sum==0) {
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("Subarray Exists");
		else
			System.out.println("Subarray does not Exists");
	}

}
