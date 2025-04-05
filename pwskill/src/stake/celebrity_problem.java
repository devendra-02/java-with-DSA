package stake;
import java.util.Stack;

import loops.continue_keyword;
public class celebrity_problem {

	public static void main(String[] args) {
		int[][] m = {{1, 1, 0},{0, 1, 0},{0, 1, 1}} ;
		int n = m.length ;
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<n;i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int v1 = st.pop() ;
			int v2 = st.pop();
			if(m[v1][v2]==0) {   // it mean v1 v2 ko ni janta to ho skta h v1 celebrity ho 
				st.push(v1);      // or yha v2 to celebrity hoi ni skta
			}
			else if(m[v2][v1]==0) {   // it mean v2 v1 ko ni janta to ho skta h v2 celebrity ho 
				st.push(v2);          // or yha v1 to celebrity hoi ni skta
			}
		}
		if(st.size()==0) {
			System.out.println("no one is celebrity ");
			return ;
		}
		int potential = st.pop();
		for(int i=0;i<n;i++) {
			if(i==potential) continue ;
			if(m[potential][i]==1) {
				System.out.println("no one is celebrity ");
				return ;
			}
		}
		for(int i=0;i<n;i++) {
			if(i==potential) continue ;
			if(m[i][potential]==0){
				System.out.println("no one is celebrity ");
				return ;
			}
		}
		System.out.println(potential+" is celebrity ");
	}

}
