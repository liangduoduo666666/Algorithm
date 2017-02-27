package ccf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CCF_201312_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int index = 0 ;
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		while(index<N){
			int temp = scan.nextInt();
			if(map.containsKey(temp)){
				int value = map.get(temp);
				map.put(temp, value+1);
			}else{
				map.put(temp, 1);
			}
			index++;
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());  
		  
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {  
		    @Override  
		    public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {  
		    	if(o1.getValue()==o2.getValue()){
		    		return (o2.getKey()-o1.getKey());
		    	}else{
		    		return o1.getValue()-o2.getValue();
		    	}
		    }  
		});  
		Entry<Integer, Integer> result = list.get(list.size()-1);
		System.out.println(result.getKey());
	}
}
