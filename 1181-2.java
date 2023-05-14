import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		String array[]=new String[N];
		
		for(int i=0; i<N; i++) {
			array[i]=sc.next();
		}
		
		Arrays.sort(array,new Comparator<String>(){//우선순위를 판단해주는 comparator 메소드
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length())//만약 s1과 s2의 길이가 같은 경우 사전순으로 정렬
					return s1.compareTo(s2);
				else //그렇지 않은 경우에 짧은 순으로 정렬 
					return s1.length()-s2.length();
			}
		});
		
		System.out.println(array[0]);
		
		for(int i=1; i<array.length; i++) {
			if(!array[i].equals(array[i-1])) { //중복 단어 제외 출력 
				System.out.println(array[i]);
			}
		}
		
		
		
	}
}
