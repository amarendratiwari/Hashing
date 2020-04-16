package hashingquestions;

import java.util.HashMap;

public class CountDistinctElementInEachWindow {

	public static void main(String[] args) {
		
		int[] arr = {10,10,20,40,20,40,30,20,90};
		int k=4;
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<k;i++) {
			map.put(arr[i], map.containsKey(arr[i])?map.get(arr[i])+1:1);
		}
		//System.out.println(map);
		System.out.println(map.size());
		for(int i =k;i<arr.length;i++) {
			map.put(arr[i-k], map.get(arr[i-k])-1);
			map.put(arr[i], map.containsKey(arr[i])?map.get(arr[i])+1:1);
			if(map.get(arr[i-k])==0) {
				map.remove(arr[i-k]);
			}
			//System.out.println("map is "+map);
			System.out.println(map.size());
		}

	}

}
