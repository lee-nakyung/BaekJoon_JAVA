import java.util.Scanner;

public class Main {
	
	static int isPrime(int n) { //소수구하기 
		if(n==1)
			return 0;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
				return 0;
		}
		return 1;
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=a; i++) {
			int num=sc.nextInt();
			count+=isPrime(num);
		}
		
		System.out.println(count);
		
	}
}
