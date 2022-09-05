//)First non repeating number in an array

import java.util.*;

public class FirstNonRepeating{
public static void main(String[] args){
	int[] arr1 = {1,1,1,1};
	System.out.println(nonRepeating(arr1));
}

static int nonRepeating(int[] arr){
	HashMap<Integer,Integer> map = new HashMap<>();
	for(int i=0;i<arr.length;i++){
		if(!map.containsKey(arr[i])){			//if map doesnot contains the current element then insert it to Map as key with value 0
			map.put(arr[i],1);
		}else{
			map.put(arr[i],map.get(arr[i]) + 1);	//else increment the value of current element by 1
		}	
	}
	for(int i=0;i<arr.length;i++){
		if(map.get(arr[i])==1){
			return arr[i];
		}
	}
	return -1;			
}
}
