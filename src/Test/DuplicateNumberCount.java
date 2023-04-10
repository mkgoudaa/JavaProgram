package Test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,7,6,100,2,5,100};
		Map<Integer,Integer> mapCount=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(mapCount.containsKey(a[i])) {
				mapCount.put(a[i],mapCount.get(a[i])+1);
			}else {
				mapCount.put(a[i], 1);
				
			}
		}
System.out.print(mapCount);
	}

}
