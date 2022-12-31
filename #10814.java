import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
public static void main(String args[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		
		
		String array[][]=new String[N][2];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine(), " ");
			array[i][0]=st.nextToken();
			array[i][1]=st.nextToken();
		
		}
		
		Arrays.sort(array, new Comparator<String[]>() {
			public int compare(String[] a1, String[] a2) {
				return Integer.parseInt(a1[0])-Integer.parseInt(a2[0]);
			}
		});
			
			
		
		for(int j=0; j<N; j++) {
			bw.write(array[j][0]+" "+array[j][1]+"\n");
		}
	
		bw.flush();
		
		
		
	}
	
}

