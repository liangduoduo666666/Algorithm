package ccf;
import java.util.Scanner;

public class CCF_201509_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int days = scan.nextInt();
		boolean isleapyear = IsLeapyear(year);
		int month=1;
		int day=0;
		if(isleapyear){
			int[] months = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
			for(int i = 0; i < 12; i++){
				if(months[i]<days){
					days = days-months[i];
					month++;
				}else{
					day=days;
					break;
				}
			}
		}else{
			int[] months = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
			for(int i = 0; i < 12; i++){
				if(months[i]<days){
					days = days-months[i];
					month++;
				}else{
					day=days;
					break;
				}
			}
		}
		System.out.println(month);
		System.out.println(day);
	}
	
	public static boolean IsLeapyear(int year){
		if((year%4==0||year%400==0)&&year%100!=0){
			return true;
		}else{
			return false;
		}
	}
}
