package hashingquestions;

import java.util.HashSet;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		
		int arr[] = {2,9,5,7,12,3};
		//int arr[]= {5,8,6,13,3,-1};		
		int sum = 16; //or 22 
		
		System.out.println(findSubArrayWithGivenSum(arr,sum));

	}
	
	private static int findSubArrayWithGivenSum(int arr[], int sum) {
		
		int preFixSum=0;
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i =0; i <arr.length; i++) {
			preFixSum = preFixSum+arr[i];
			if(preFixSum==sum)
				return 1;
			if(set.contains(preFixSum-sum))
				return 1;
			set.add(preFixSum);
		}
		
		return 0;
	}

}
