import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		String [][] str=new String[N][2];//나이와 이름 저장할 2차워 배열 생성
		
		for(int i=0; i<N; i++) {
			str[i][0]=sc.next(); //나이
			str[i][1]=sc.next(); //이름
		}
		
		Arrays.sort(str, new Comparator<String[]>() {//comparator 메소드 이용
			public int compare(String[]s1, String[]s2) {
				return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);//나이 적은순으로 출력
			}
		});
		
		for(int i=0; i<N; i++) {
			System.out.println(str[i][0]+" "+str[i][1]);
		}
		
		
	}
}
