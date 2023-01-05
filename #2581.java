import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		
		
		Scanner sc=new Scanner(System.in);
		
		int M=sc.nextInt();
		int N=sc.nextInt();
		
		int sum=0;
		int min=N;
		
		
		boolean array[]=new boolean[N+1];
		
		array[0]=true; //0이랑 1은 소수가 아니기에 제외 
		array[1]=true;
		
		for(int i=2; i<=Math.sqrt(N); i++) {
			for(int j=i*i; j<=N; j+=i) {//에라토스테네스의 체 활용
				array[j]=true; //소수가 아닌것들
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(array[i]==false) { //소수이면 
				sum+=i;
				if(min>i)
				min=i;
				}
			}
	
		
		
		if(sum==0)
			System.out.println(-1);
		else
			System.out.println(sum+"\n"+min);
	}	
	
}
