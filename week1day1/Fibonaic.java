package week1day1;

public class Fibonaic {
	public static void main(String[] args) {
		int x = -1;
		int y = 1;
		short n=10;		
		for(int i =0; i <n ; i++)
		{
			int fib = x + y;
			System.out.println(fib);
			x=y;
			y=fib;	

	}
}
}
