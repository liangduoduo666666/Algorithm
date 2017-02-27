package ccf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CCF_201509_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int index = 0 ;
		List<String> result = new ArrayList<String>();
		int[][] flags = new int[N][4];
		Map<String,Integer> connect = new HashMap<String,Integer>();
		while(index<M){
			String m = scan.nextLine();
			while(m.indexOf("{{")>0){
				biaoji(m,index ,flags,connect);
			}
			index++;
		}
		Map<String,String> connects = new HashMap<String,String>();
		int index1 = 0;
		while(index1<N){
			String temp = scan.nextLine();
			String[] temps = temp.split(" ");
			connects.put(temps[0], temps[1].substring(2,temps[1].length()-2));
			index1++;
		}
		replace(result,flags,connect,connects);
		for(int i = 0 ; i < M ; i++){
			System.out.println(result.get(i));
		}
		scan.close();
	}
	public static int flagn = 0;
	public static void replace(List<String> result,int[][] flags,Map<String,Integer> connect,Map<String,String> connects){
		Set<String> keys = connect.keySet();
		Iterator iterator = keys.iterator();
		List<String> strings = new ArrayList<String>();
		while(iterator.hasNext()){
			Entry entry = (Entry)iterator.next();
			strings.add((String)entry.getKey());
		}
		List<Integer> values = (List<Integer>) connect.values();
		for(int i = 0 ; i < flagn ; i++){
			int yinshe = values.get(flags[i][0]);
			String replaceStr =connects.get(strings.get(yinshe));
			String oldStr = result.get(flags[i][1]);
			String newStr = null; 			
			newStr+=oldStr.substring(0, flags[i][2]-1);
			newStr+=replaceStr;
			newStr+=oldStr.substring(flags[i][3]+1, oldStr.length()-1);
			result.set(flags[i][1], newStr);
		}
	}
	public static void biaoji(String s ,int m , int[][] flags ,Map<String,Integer> connect){
		while(s.indexOf("{{")>=0){
			int left = s.indexOf("{{");
			int rigth = s.indexOf("}}");
			String variable = s.substring(left+1, rigth-1);
			if(connect.containsKey(variable)){
				flags[flagn][0]=(int)connect.get(variable);
			}else{
				connect.put(variable, connect.size()+1);
				flags[flagn][0]=connect.size()+1;
			}
			flags[flagn][1]=m;
			flags[flagn][2]=left;
			flags[flagn][3]=rigth;
			flagn++;
		}
	}
}
