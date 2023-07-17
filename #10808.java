import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String args[])throws IOException {
		
		Scanner sc=new Scanner(System.in);
		
		int array[]=new int[26];
		
		String num=sc.nextLine();
		
		for(int i=0; i<num.length(); i++) {
			array[num.charAt(i)-97]++; //아스키코드값으로 알파벳 몇개인지 구함
		}
		
		for(int j=0; j<26; j++) {//알파벳이 각 몇개인지 구함 
			System.out.print(array[j]+" ");
		}
	}
}
