import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		char array[]=sc.nextLine().toCharArray(); //string 배열을 char배열로 바꿔줌
		
		Arrays.sort(array); //배열을 정렬함 2143 이면 1234
		
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
		
		
		
	}
}
