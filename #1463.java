import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//다이나믹 프로그래밍 , DP , 바텀업 방식
public class Main {
	
	public static void main(String args[])throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int array[]=new int[n+1];
		
		for(int i=2; i<n+1; i++) {
			array[i]=array[i-1]+1;
			
			if(i%2==0) {
				array[i]=Math.min(array[i], array[i/2]+1);
			}
			
			if(i%3==0) {
				array[i]=Math.min(array[i],array[i/3]+1);
			}
		}
		
		System.out.println(array[n]);
	}	
	
}
