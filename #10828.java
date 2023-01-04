import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//스택 구현, FILO

public class Main {
	
	public static ArrayList<Integer> array=new ArrayList<>(); //배열 array 구현
	
	public static int a=0; //배열의 길이
	
	public static void push(int x) {
		array.add(x); //배열값에 넣음
		a++; //사이즈 증가
	}
	
	public static int pop() {
		if(a==0) //정수가 없는 경우에는
			return -1; //-1 출력
		else {
			int b=array.get(--a); //가장 위에 있는 정수
			array.remove(a); //제거
			return b; //출력
			
		}
	}
	
	public static int size() {
		return a; //사이즈 출력
	}
	
	public static int empty() {
		if(a==0) //스택이 비어있으면
			return 1; //1출력
		else //비어있지 않으면
			return 0; //0출력
	}
	
	public static int top() {
		if(a==0) //아무것도 없을 경우 -1 출력
			return -1;
		else {//그렇지 않을 경우
			int c=a-1; //스택의 top값은 사이즈 -1
			return array.get(c); //출력
		}
	}
	
public static void main(String args[])throws NumberFormatException, Exception {
		
	BufferedReader br= new BufferedReader(new InputStreamReader (System.in )); 
	
	int N=Integer.parseInt(br.readLine()); //숫자 받음
	
	for(int i=0; i<N; i++) {//N만큼 반복
		String[] arr=br.readLine().split(" ");
		
		switch(arr[0]) {
		case "push":
			push(Integer.parseInt(arr[1]));
			continue;
		case "pop":
			System.out.println(pop());
			continue;
		case "size":
			System.out.println(size());
			continue;
		case "empty":
			System.out.println(empty());
			continue;
		case "top":
			System.out.println(top());
			continue;
		}
	}
}

}

