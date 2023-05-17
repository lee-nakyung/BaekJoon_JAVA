import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		
		Stack<Integer> stack=new Stack<>(); //정수형으로 이루어진 스택 생성, 스택 라이브러리 사용 

		for(int i=0; i<N; i++) {
			String str=br.readLine();//equals 말고 contains를 사용해야함, 첨에 equals로 써서 틀렸음 
			if(str.contains("push")) {
				String a=str.substring(5); //5번째 글자부터 끝까지 가져옴 => 숫자만 추출
				int num=Integer.parseInt(a); //a를 int 형으로 변환함
				stack.push(num);
			}
			
			else if(str.contains("pop")) {
				if(stack.isEmpty()==true) { //만약 스택이 비어있다면 
					System.out.println(-1);
				}
				else
					System.out.println(stack.pop());
			}
			
			else if(str.contains("size")) {
				System.out.println(stack.size());
			}
			
			else if(str.contains("empty")) {
				if(stack.isEmpty()==true) {
					System.out.println(1);
				}
				else
					System.out.println(0);
			}
			
			else if(str.contains("top")) {
				if(stack.isEmpty()==true) {
					System.out.println(-1);
				}
				else
					System.out.println(stack.peek()); //peek()를 사용해 가장 위에 있는 정수 값 반환 
			}
		}
		
	
	}
}
