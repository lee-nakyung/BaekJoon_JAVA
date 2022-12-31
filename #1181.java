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
		
		
		String array[]=new String[N];
		
		for(int i=0; i<N; i++) {
			array[i]=br.readLine();
		}
		
		Arrays.sort(array, new Comparator <String>() {//람다식 활용, comparator 인터페이스 활용
			public int compare(String a1, String a2) { 
				if(a1.length()==a2.length()) { //만약 단어의 길이가 같을 때 
					return a1.compareTo(a2);  // 사전순으로 비교함
				}
				else { //길이가 같지 않을 경우 
					return a1.length()-a2.length(); //오름차순 정리
				}
			} 
		});
			
		
		for(int j=0; j<N; j++) {
			if(j>0 && array[j].equals(array[j-1])) { //중복된 문자열 하나만 출력하게, j가 0보다 크고 전의 문자열과 같은지 비교
			continue;
			}
			else
				bw.write(array[j]+"\n");
		}
	
		bw.flush();
		
		
		
	}
	
}

