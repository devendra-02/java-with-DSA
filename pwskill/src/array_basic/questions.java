package array_basic;

public class questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,0,5,8,4,9,2};
		int x = 9 ;
		for(int i=0;i<arr.length;i++) {
			boolean flag = false ;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					System.out.println("sum of "+arr[i]+" and "+arr[j]+" is 9");  
					flag = true ;
					break ;}
			 }
			if(flag == true)	break ;
		} 
	}

}
