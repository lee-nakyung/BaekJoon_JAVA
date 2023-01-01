import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
public static void main(String args[])throws IOException{
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine()+" ");
		
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		int h=Integer.parseInt(st.nextToken());
		
		int array[]=new int[] {x,y,w-x,h-y};
		int min=array[0];
		
		for(int i=1; i<4; i++) {
			min=Math.min(min, array[i]); //Math.min 을 활용해서 제일 최솟값 구함
		}
		
		bw.write(min+" ");
		
		bw.flush();
		
	}
	
}

