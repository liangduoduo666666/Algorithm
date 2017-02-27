package ccf;
import java.util.Scanner;

public class CCF_201512_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] inputs = input.split(" ");
		int m = Integer.parseInt(inputs[0]);
		int n = Integer.parseInt(inputs[1]);
		int P = Integer.parseInt(inputs[2]);
		char[][] result = new char[n][m];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				result[i][j]='.';
			}
		}
		int index = 0 ;
		while(index<P){
			String temp = scan.nextLine();
			if(temp.charAt(0)=='0'){
				line(result,temp);
			}else{
				String[] results = temp.split(" ");
				int y = Integer.parseInt(results[1]);
				int x = Integer.parseInt(results[2]);
				char c = results[3].charAt(0);
				filll(result,c,x,y,n,m);
			}
			index++;
		}
		
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void filll(char[][] result,char c,int x , int y,int n,int m){		
		boolean flag = true;
		while(flag){
			result[x][y]=c;
			if(x-1>=0&&result[x-1][y]!=c&&result[x-1][y]!='-'&&result[x-1][y]!='+'&&result[x-1][y]!='|'){
				filll(result,c,x-1,y,n,m);
			}else{
				flag = false;
			}
			
			if(x+1<n&&result[x+1][y]!=c&&result[x+1][y]!='-'&&result[x+1][y]!='+'&&result[x+1][y]!='|'){
				filll(result,c,x+1,y,n,m);
			}else{
				flag = false;
			}
			
			if(y-1>=0&&result[x][y-1]!=c&&result[x][y-1]!='-'&&result[x][y-1]!='+'&&result[x][y-1]!='|'){
				filll(result,c,x,y-1,n,m);
			}else{
				flag = false;
			}
			
			if(y+1<m&&result[x][y+1]!=c&&result[x][y+1]!='-'&&result[x][y+1]!='+'&&result[x][y+1]!='|'){
				filll(result,c,x,y+1,n,m);
			}else{
				flag = false;
			}
		}
	}

	public static void line(char[][] result,String temp){
		String[] results = temp.split(" ");
		int x1 = Integer.parseInt(results[1]);
		int y1 = Integer.parseInt(results[2]);
		int x2 = Integer.parseInt(results[3]);
		int y2 = Integer.parseInt(results[4]);
		if(x1==x2){
			int ymax = y1>y2?y1:y2;
			int ymin = y1>y2?y2:y1;
			for(int i = ymin ; i <= ymax ;i++){
				if(result[i][x1]=='-'){
					result[i][x1]='+';
				}else{
					result[i][x1]='|';
				}
			}
		}
		if(y1==y2){
			int xmax = x1>x2?x1:x2;
			int xmin = x1>x2?x2:x1;
			for(int i = xmin ; i <= xmax ;i++){
				if(result[y1][i]=='|'){
					result[y1][i]='+';
				}else{
					result[y1][i]='-';
				}
			}
		}
	}
}
