import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
public static void main(String args[])throws IOException{
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int count=0;
		
		while(true) {
			if(N==4 || N==7) {//4랑 7 제외
				System.out.println(-1);
				break;
			}
			if(N%5==0) {//5의 배수인 경우 
				count+=N/5;
				System.out.println(count);
				break;
			}
			if(N<=0) {
				System.out.println(-1);
				break;
			}
			else {
				N=N-3;//5의 배수로 만들기 
				count++;
			}
		}
		
		
	}
	
}

