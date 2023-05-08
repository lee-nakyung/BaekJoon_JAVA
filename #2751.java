import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt(); //갯수 받기
		int array[]=new int[n]; //갯수 만큼의 배열 할당
		
		for(int i=0; i<array.length; i++) { //배열 크기만큼 숫자 받기
			array[i]=sc.nextInt();
		}
		
		Arrays.sort(array); //오름차순으로 정렬, arrays.sort는 시간초과가 날 수 있음. collection을 사용하는 것이 시간을 줄이는데 더 좋음
		
		StringBuilder sb=new StringBuilder(); //sysout보다 빠른 sb 사용
		
		for(int i:array) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
