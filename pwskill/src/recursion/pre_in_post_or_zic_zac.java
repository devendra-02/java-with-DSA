package recursion;

public class pre_in_post_or_zic_zac {
	 public static void pip(int n) {
	        if (n == 0) return;

	        System.out.println("a"+n); // pre  ( function ke pehle kam hora h )

	        pip(n-1);

	        System.out.println("b"+n); // in  ( do function ke beech me kam hora h )

	        pip(n-1);

	        System.out.println("c"+n); // post  ( function ke bad kam hora h )
	    }

	    public static void main(String[] args) {
	    	pip(3) ;
	    }


}
