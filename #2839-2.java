import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		if(N==4 || N==7) {//정확하지 않은 경우 -1
			System.out.println(-1);
		}
		
		else if(N%5==0) {//5로 나누어떨어지면 5로 나눈 값의 봉지수만큼
			System.out.println(N/5);
		}
		
		else if(N%5==1 || N%5==3) {
			System.out.println(N/5+1);
		}
		
		else if(N%5==2 || N%5==4) {
			System.out.println(N/5+2);
		}
		
	
	}
}
