package _2D_Array;

import java.util.ArrayList;

public class extra {
	
	    public ArrayList<Integer> spiralOrder(int[][] arr) {
	    	
	    	ArrayList<Integer> ans = new ArrayList<Integer>();
	    	
	    	int r = arr.length , c = arr[0].length ;
			
			int minr = 0 ,maxr = r-1 ,minc = 0 , maxc = c-1 ;
			
			while(minr<=maxr && minc<=maxc) {
				
				//left to right 
				for(int j=minc;j<=maxc;j++) {
					ans.add(arr[minr][j]);
				}
				minr++ ;
				//top to bottom
				if(minr>maxr || minc>maxc) break ;
				for(int i=minr;i<=maxr;i++) {
					ans.add(arr[i][maxc]);
				}
				maxc-- ;
				// right to left 
				if(minr>maxr || minc>maxc) break ;
				for(int j=maxc;j>=minc;j--) {
					ans.add(arr[maxr][j]);
				}
				maxr-- ;
				// bottomo to top 
				if(minr>maxr || minc>maxc) break ;
				for(int i=maxr;i>=minr;i--) {
					ans.add(arr[i][minc]);
				}
				minc++ ;
				
			}
			return ans ;
	    
	}
}
