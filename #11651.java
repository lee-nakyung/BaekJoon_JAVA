import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String args[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		
		int array[][]=new int[N][2];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine());
			array[i][0]=Integer.parseInt(st.nextToken());
			array[i][1]=Integer.parseInt(st.nextToken());
		
		}
		
		Arrays.sort(array,(e1,e2)->{ //람다식 활용
			if(e1[1]==e2[1]) { 
				return e1[0]-e2[0];  
			}
			else
				return e1[1]-e2[1];
				
		});
		
		for(int j=0; j<N; j++) {
			bw.write(array[j][0]+" "+array[j][1]+"\n");
		}
	
		bw.flush();
		
		
		
	}
	
}
