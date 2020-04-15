package hashingquestions;

import java.util.HashMap;

public class LongestSubArrayWithEqualNumberOf1and0 {

	public static void main(String[] args) {
		int input[] = {1,0,1,1,1,1,0,0};
		int arr[] = new int[input.length];
		
		for(int i =0;i<input.length;i++) {
			arr[i]= input[i]==0?-1:1;
		}
		//arr-Now are elements will be either -1 and 0
		System.out.println(findLongestSubArrayWithEqualNumberOf1and0(arr));
	}
	private static int findLongestSubArrayWithEqualNumberOf1and0(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int longestIndex= 0;
		int prefixSum = 0;
		int index = 0;
		int len = arr.length;
		for(int i =0; i<len; i++) {
			prefixSum  += arr[i];
			if(map.containsKey(0)) {
				longestIndex =i+1;
			}
			if(map.containsKey(prefixSum+len)) {
				index = map.get(prefixSum+len);
				longestIndex = Math.max(i-index, longestIndex);
			}else {
			 map.put(prefixSum+len, i);
			}
		}
		return longestIndex;
	}

}
