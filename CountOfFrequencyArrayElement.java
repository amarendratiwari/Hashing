package hashingquestions;

import java.util.HashMap;
import java.util.Map;

public class CountOfFrequencyArrayElement {

	public static void main(String[] args) {
		int arr[] = {10,20,30,10,40,10,2,3,2,2,3};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<arr.length;i++) {
			map.put(arr[i], map.containsKey(arr[i])?map.get(arr[i])+1:1);
		}
		map.entrySet().forEach(entry ->{
			System.out.println(entry.getKey()+" "+entry.getValue());
		});
	}

}
