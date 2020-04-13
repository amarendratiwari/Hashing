package hashingquestions;

import java.util.HashSet;

public class PairWithGivenSum {

	public static void main(String[] args) {
		
		int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int x = 14;
        System.out.println(pairWithGivenSumX(arr, x));

	}

	private static int pairWithGivenSumX(int[] arr, int x) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(x-arr[i])) {
				return 1;
			}
			set.add(arr[i]);
		}
		
		return 0;
	}

}
