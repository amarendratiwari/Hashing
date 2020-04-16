package hashingquestions;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		
		int arr[] = {1,5,3,4,2,20,21,22,23,24,25,26,7,6,8};
		int l =arr.length;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i =0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int start =0;
		int maxlength=0;
		for(int i=0;i<l;i++) {
			if(set.contains(arr[i]-1)) {
				start =0;
				continue;
			}else {
				while(set.contains(arr[i]+start)) {
					start++;
				}
				maxlength = Math.max(start, maxlength);
			
			}
		}
		System.out.println(maxlength);
	}

}
