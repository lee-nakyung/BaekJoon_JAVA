import java.util.Scanner;

public class Main {
	
	
	public static void main(String args[]) {
		
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N=sc.nextInt();
			String word=sc.next();
			
			for(int j=0; j<word.length(); j++) {
				for(int k=0; k<N; k++) {
				System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}
		
	}
		
	
}
