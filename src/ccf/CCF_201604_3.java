package ccf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCF_201604_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N  = Integer.parseInt(scan.nextLine());
		String current = scan.nextLine();
		if(current.charAt(0)!='/'){
			current = "/"+current;
		}
		int index=0;
		List<String> result = new ArrayList<String>();
		while(index<N){
			String s = scan.nextLine();
			if(s.length()==0){
				s=current;
			}
			if(!current.equals("/")&&s.charAt(0)!='/'){
				s=current+"/"+s;
			}else if(current.equals("/")&&s.charAt(0)!='/'){
				s=current+s;
			}

			
			StringBuffer temp =  new StringBuffer(s);
			int pos = 0;		
			while((pos=temp.indexOf("///"))!=-1){
				temp.delete(pos+1, pos+3);
			}
			
			while((pos=temp.indexOf("/./"))!=-1){
				temp.delete(pos+1, pos+3);
			}			
			
			while((pos=temp.indexOf("/../"))!=-1){
				if(pos==0){
					temp.delete(pos+1, pos+4);
				}else{
					temp.delete(pos+1, pos+4);
					int poss = temp.substring(0, pos-1).lastIndexOf("/");
					temp.delete(poss, pos);
				}
			}
			if(temp.length()!=1&&temp.charAt(temp.length()-1)=='/'){
				temp.delete(temp.length()-1, temp.length());
			}
			if(temp.length()==0){
				temp.append("/");
			}
			result.add(temp.toString());
			index++;
		}
		
		for (String string : result) {
			System.out.println(string);
		}
	}

	
}
