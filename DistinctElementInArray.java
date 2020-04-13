package hashingquestions;

import java.util.HashSet;

public class DistinctElementInArray {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,10,40,10,2,3,2,2,3};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i =0; i<arr.length; i++)
			set.add(arr[i]);
		
		System.out.println(set.size());

	}

}
