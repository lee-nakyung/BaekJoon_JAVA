import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//피보나치 수 구하기 
//long보다 큰 자료형인 BigInteger을 이용, DP, 바텀업 방식
public class Main {
	
	public static void main(String args[])throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		BigInteger array[]=new BigInteger[10001]; //n이 10000까지 가기에 자료형 BigInteger 이용
		
		array[0]=BigInteger.ZERO; //피보나치 0번째 값 0
		array[1]=BigInteger.ONE; //피보나치 1번째 값 1
		
		for(int i=2; i<=n; i++) {
			array[i]=array[i-2].add(array[i-1]);//피보나치 수열 기본 점화식
		}
		System.out.println(array[n]);
	}	
	
}
