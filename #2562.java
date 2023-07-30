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
		StringTokenizer st;
		
		int max=0;
		int line=0;
		
		int array[]=new int[9];
		
		for(int i=0; i<9; i++) {
			array[i]=Integer.parseInt(br.readLine());
			
			if(max<array[i]) {
				max=array[i];
				line=i+1;
			}
		}
		bw.write(max+"\n");
		bw.write(line+"\n");
		bw.flush();
	}
}
