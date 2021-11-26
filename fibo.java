
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prev=0;
		int next=1;
		int sum;
		for(int i=0;i<=11;i++){
			System.out.print(prev+ " ");
			sum = prev+next;
			prev=next;
			next=sum;
		}

	}

}
