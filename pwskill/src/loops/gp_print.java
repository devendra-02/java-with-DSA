package loops;
import java.util.Scanner ;

import javax.imageio.metadata.IIOMetadataFormatImpl;
public class gp_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		int a=1 ;
//		print a GP - 1,2,4,8,16,32,....upto 'n'
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			a=a*2;
		}
	}

}
