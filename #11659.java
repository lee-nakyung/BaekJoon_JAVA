import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String args[])throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		int array[]=new int[a+1];
		
		 st= new StringTokenizer(br.readLine());
		 
	
		for(int i=1; i<=a; i++) {
			array[i]=array[i-1]+Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<b; i++) {
			st= new StringTokenizer(br.readLine());
			int c=Integer.parseInt(st.nextToken());//2
			int d=Integer.parseInt(st.nextToken());//4
			bw.write(array[d]-array[c-1]+"\n");
		}
		bw.flush();
		bw.close();
		
		
	}
}
