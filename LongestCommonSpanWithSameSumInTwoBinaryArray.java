package hashingquestions;

import java.util.HashMap;

public class LongestCommonSpanWithSameSumInTwoBinaryArray {

	public static void main(String[] args) {
		
		int[] arr1= {0,1,0,0,0,0,1,0};
		int[] arr2= {1,0,1,0,0,1,0,0};//both are given 2 binary arrays
		
		int[] arr =new int [arr1.length];
		
		for(int i =0; i<arr.length;i++)
			arr[i] = arr1[i]-arr2[i];
		System.out.println(findLongestCommonSpanWithSameSumInTwoBinaryArray(arr));

	}
	private static int findLongestCommonSpanWithSameSumInTwoBinaryArray(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int prefixSum=0;
		int maxlen =0;
		int index=0;
		for(int i =0;i <arr.length;i++) {
			prefixSum += arr[i];
			if(prefixSum==0) {
				maxlen = i+1;
			}
			if(map.containsKey(prefixSum)) {
				index = map.get(prefixSum);
				maxlen = Math.max(i-index, maxlen);
			}else {
				map.put(prefixSum, i);
			}
		}
		return maxlen;
	}

}
