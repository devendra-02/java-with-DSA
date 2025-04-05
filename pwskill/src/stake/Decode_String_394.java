package stake;

import java.util.Stack;
import java.util.Arrays;

public class Decode_String_394 {

	public static String decodeString(String s) {
		Stack<Integer> num = new Stack<Integer>();
		Stack<String> str = new Stack<String>();
		int count = 0 ;
        String currstr = "";
        
        for(char c : s.toCharArray()) {
        	if(Character.isDigit(c)) {  // check the the char is no or not 
        		count = count * 10 + (c - '0') ;  // convert char to integer by subtracting ASCII valve of 0 from c
        	}
        	else if(c == '[') {
        		str.push(currstr);
        		num.push(count) ;
        		count = 0 ;
                currstr = "";
        	}
        	else if(c == ']') {
        		int repeattime = num.pop();
        		String repeatstrint = currstr.repeat(repeattime); 
        		currstr = str.pop()+repeatstrint ;
        	}
        	else {
        		currstr = currstr+c ; 
        	}
        }
        return currstr ;
    }
	public static void main(String[] args) {
		String s = "5[a]2[bc]" ;
		System.out.println("Before decoding : "+s);
		String ans = decodeString(s);
		System.out.println("decoded String : "+ans);
	}
}
