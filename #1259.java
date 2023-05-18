import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			
			int num=Integer.parseInt(br.readLine());
			
			if(num==0) {
				break;
			}
			
			else {
				int count=0;
				String st=Integer.toString(num); //입력받은 숫자를 string 타입으로 변환함
				for(int i=0; i<st.length()/2; i++) { //문자열을 반으로 쪼개서 
					if(st.charAt(i)==st.charAt(st.length()-1-i)) {//앞으로 뒤로 한칸씩 옮기면서 수가 같으면 count 증가
						count++;
					}
				}
				if(count==st.length()/2) //카운트 수와 문자열 길이의 반이 같으면 펠린드롬 수
					System.out.println("yes");
				else
					System.out.println("no");
			}
		
		}
	}
}
