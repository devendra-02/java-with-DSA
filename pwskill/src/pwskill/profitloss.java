package pwskill;
import java.util.Scanner;
public class profitloss {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
				System.out.println("enter a cost price ");
				int cp = sc.nextInt();
				System.out.println("enter a selling  price ");
				int sp = sc.nextInt();
				
				if(sp>cp) { 
					int profit = sp-cp ;
					System.out.println("profit " + profit);
				}
				
				if(cp>sp) {
					int loss = cp-sp ;
				System.out.println("loss " + loss );
				}
				
				if(cp == sp)
					{
					System.out.println("no profit no loss");
					}
	}
}

