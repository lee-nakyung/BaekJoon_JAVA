import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//피보나치 함수, DP
public class Main {
	
	public static void main(String args[])throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int array[][]=new int[41][2];//n이 최대 40이기에 41까지의 배열 생성
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int a=Integer.parseInt(br.readLine());
			array[0][0]=1;//0일때 0의 갯수 1
			array[0][1]=0;//0일때 1의 갯수 0
			array[1][0]=0;//1일때 0의 갯수 0
			array[1][1]=1;//1일때 1의 갯수 1
			
			for(int j=2; j<=a; j++) {//피보나치 수 점화식 작성
				array[j][0]=array[j-1][0]+array[j-2][0];
				array[j][1]=array[j-1][1]+array[j-2][1];
			}
			System.out.println(array[a][0]+" "+array[a][1]);
		}
	}	
	
	
	
}
