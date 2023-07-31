import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String args[])throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String s=br.readLine();
		StringBuilder sb=new StringBuilder(s);
		
		if(s.equals(sb.reverse().toString())) {//sb.reverse 를 통해 펠린드롬인지 확인
			System.out.println("1");
		}
		else
			System.out.println("0");
		
	}
}




