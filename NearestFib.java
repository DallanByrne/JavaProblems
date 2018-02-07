import java.util.*;

public class NearestFib {

	private static Scanner sc;

	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inset your number");
		
		int x = sc.nextInt();
		sc.close();
		//System.out.println(fibNum(x));
		
		System.out.println("The closest fibonnaci number to "+x + " is "+ nearest(x));
				
	}
	
	public static int nearest(int X){
		ArrayList<Integer> Fibonachi = new ArrayList<Integer>();
		
		int i =0;	//Counter and Input
		
		while(true){
			//Add i'th fibonnacci to ArrayList
			Fibonachi.add(fibNum(i));
			i++;
			
			if(Fibonachi.get(i-1) == X){	
				return X;	//X is a Fibonnaci number
			}
			else if( Fibonachi.get(i-1) > X ){
				//Compare last and Second last
				return closest(Fibonachi.get(i-1) , (Fibonachi.get(i-2)), X);
				
			}
			
		}
	}
	
	//Returns the n'th Fib number
	public static int fibNum(int n){
		if(n < 1)
			return 0;
		else if ( n == 1){
			return 1;
		}
		else{
			return fibNum(n-1) + fibNum(n-2); 
		}
	}
	
	public static int closest(int x, int y, int n){
		//x is highest, y is lowest, n is base number
		
		int a = Math.abs(x-n);
		int b = Math.abs(y-n);
		
		if(a < b){
			return x;
		}
		else
			return y;
		
	}
	
}
