package linked_list;

public class error_throw {
	public static void main(String[] args) {
		int n = 7 ;
		if(n>0 && n<6) 
			System.out.println("no in range ");
		
		if(n<0 || n>6)  // hear it throws the error **************************
			throw new Error("bhai range ke bahar h");
	}
}
