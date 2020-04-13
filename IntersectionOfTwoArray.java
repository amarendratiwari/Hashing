package hashingquestions;

import java.util.HashSet;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		int arr1[] = new int[]{15, 17, 27, 27, 28, 15};
        int arr2[] = new int[]{16, 17, 28, 17, 31, 17};
        int m = arr1.length;
        int n = arr2.length;
        
        System.out.println(intersection(arr1, m, arr2, n));

	}

	private static int intersection(int[] arr1, int m, int[] arr2, int n) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr1.length;i++)
			set.add(arr1[i]);
		int countOfDistinctIntersectionElement = 0;
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				countOfDistinctIntersectionElement++;
				set.remove(arr2[i]);
			}
		}
		
		return countOfDistinctIntersectionElement;
	}

}
