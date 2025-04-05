package stake;
import java.util.*;
public class Reveal_cards_in_increasing_order {
	
//	***************************using simple Array******************************************************  
	
//	public static int[] deckRevealedIncreasing(int[] deck) {
//		
//		int n = deck.length;
//        int[] ans = new int[n];
//        boolean skip = false ;
//        
//        int i = 0;  // this is for deck 
//        int j = 0;  // this is for answer array
//        
//        Arrays.sort(deck);
//        
//        while(i<n) {
//        	
//        	if(ans[j]==0) {
//        		if(skip==false) {
//        			ans[j]=deck[i];
//        			i++ ;
//        		}
//        		skip = !skip;
//        	}
//        	j = (j+1)%n;
//        }
//        
//        return ans ;
//    }
	
	
//	*****************************using queue*************************************************************
	
	public static int[] deckRevealedIncreasing(int[] deck) {
		
		int n = deck.length;
        int[] ans = new int[n];
        Queue<Integer> t = new LinkedList<Integer>();
        
        for(int i=0;i<n;i++) {
        	t.add(i);
        }
        
        Arrays.sort(deck);
        int i = 0 ; // index of deck
        
        while(!t.isEmpty()) {
        	
        	int idx = t.remove();
        	
        	ans[idx] = deck[i] ;
        	i++ ;
        	
        	if(!t.isEmpty()) {
        		t.add(t.remove());
        	}
        }
        return ans ;
    }

	public static void main(String[] args) {
		int[] deck = {17,13,11,2,3,5,7};
		for(int ele : deck) {
			System.out.print(ele+" ");
		}System.out.println();
		
		// output - [2,13,3,11,5,17,7]
		
		int[] ans = deckRevealedIncreasing(deck) ;
		for(int ele : ans) {
			System.out.print(ele+" ");
		}
	}

}
