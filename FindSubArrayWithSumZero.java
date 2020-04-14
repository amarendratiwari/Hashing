package hashingquestions;

import java.util.HashSet;

public class FindSubArrayWithSumZero {

	public static void main(String[] args) {


		int[] arr = new int[]{-3,1,2,4};
		
		System.out.println(findSubArrayWithZeroSum(arr));
		
		
	}
	private static int findSubArrayWithZeroSum(int []arr) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		int prefixSum= 0;
		
		for(int i =0; i<arr.length; i++) {
			prefixSum += arr[i];
			if(prefixSum==0)// example arr={-4,2,1,1,5}, here subarray is -4,2,1,1
				return 1;
			if(set.contains(prefixSum))
				return 1;
		}
		return 0;
	}
}
