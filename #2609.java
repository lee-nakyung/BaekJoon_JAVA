import java.util.Scanner;

public class Main {
	
	static int gcd(int a, int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	
	static int lcm(int a, int b) {
		return (a/gcd(a,b)*b);
		
	}
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in );
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		System.out.println(gcd(A,B));
		System.out.println(lcm(A,B));
	}	
	
}

