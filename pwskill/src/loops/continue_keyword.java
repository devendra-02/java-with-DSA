package loops;

public class continue_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//   print all the odd no upto 100
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				continue ;
			System.out.print(" "+i);
		}

	}

}
