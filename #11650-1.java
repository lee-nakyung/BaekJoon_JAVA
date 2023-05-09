import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Point implements Comparable<Point>{
	public int x,y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point o) {//sort하는 조건 생성
		if(this.x==o.x) //x값이 같으면 y좌표가 오름차순으로
			return this.y-o.y;
		else //같지 않으면 x가 큰 순서대로 
			return this.x - o.x;
	}
}
public class Main {
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		ArrayList<Point> array=new ArrayList<>();
		for(int i=0; i<a; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			array.add(new Point(x,y));
		}
		Collections.sort(array);
		for(Point o:array)
			System.out.println(o.x+" "+o.y);
	}
}
