import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String args[])throws IOException{
		
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int M=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		boolean array[]=new boolean[N+1];
		
		array[1]=true;
		
		for(int i=2; i<=Math.sqrt(N); i++) {
			for(int j=i*i; j<=N; j+=i) {
				array[j]=true;
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(array[i]==false)
				bw.write(i+"\n");
		}
		bw.flush();
	}	
	
}

