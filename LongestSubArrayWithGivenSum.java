package hashingquestions;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		
		int arr[]= new int[]{8,3,1,5,-6,6,2,2};
		int sum=4;
		
		System.out.println(findLongestSubArrayWithGivenSum(arr,sum));

	}

	/*Initialize prefixSum = 0 and sizeOfLongestArray = 0.
			Create a hashmap  having (prefixSum, index).
			For i = 0 to n-1, perform the following steps:
			Calculate prefixsum.
			If sum == prefixsum, update sizeOfLongestArray = i+1.
			Check whether prefixsum is present in the hashmap or not. If not present, then add it to the hashmap as (prefixsum, i) pair.
			Check if (prefixsum-sum) is present in the hashmap or not. If present, then obtain index of (prefixsum-sum) from the 
			hashmap as index. Now check if sizeOfLongestArray < (i-index), then update sizeOfLongestArray = (i-index).
			Return sizeOfLongestArray.*/
	private static int findLongestSubArrayWithGivenSum(int[] arr,int sum) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int prefixSum = 0;
		int sizeOfLongestArray = 0; 
		int indexOfElement =-1;
		for(int i =0; i<arr.length; i++) {
			prefixSum += arr[i];
			if(prefixSum == sum) {
				sizeOfLongestArray = i+1;
			}
			if(!map.containsKey(prefixSum)) {
				map.put(prefixSum, i);
			}
			if(map.containsKey(prefixSum- sum)) {
				indexOfElement = map.get(prefixSum- sum);
				sizeOfLongestArray = Math.max(sizeOfLongestArray, i-indexOfElement);
			}
			
		}
		return sizeOfLongestArray;
	}
}
