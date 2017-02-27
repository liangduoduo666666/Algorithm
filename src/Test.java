import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int index = 0 ;
		while(index<number){
			ArrayList<String>  lists = getList();
			Random r = new Random();
			for(int i = 0 ; i <5 ;i++){
				int roundIndex = r.nextInt(36);
				String temp = lists.get(roundIndex);
				lists.remove(roundIndex);
				System.out.print(Integer.parseInt(temp)+" ");
			}
			System.out.println();
			index++;
		}
	}
	public static ArrayList<String> getList(){
		ArrayList<String>  lists = new ArrayList<String> ();
		int n = 9 ;
		for(int i = 0 ; i <= 3 ; i++){		
			if(i==3){
				n =5;
			}
			for(int j = 1 ; j <= n; j++){
				lists.add(i+""+j+"");
			}
		}
		return lists;
	}
}

