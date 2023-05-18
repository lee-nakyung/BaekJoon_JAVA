import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//브루트포스 이용
		
		int N=Integer.parseInt(br.readLine());
		int num=666;
		
		int a=1;
		
		while(a!=N) {
			num++;
			String str=String.valueOf(num);
			if(str.contains("666")) //666이 포함된 숫자가 나오면 카운팅 늘림
				a++;
		}
		
		System.out.println(num);
	}
}
