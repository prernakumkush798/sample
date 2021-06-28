package lecture_27;

import java.util.ArrayList;



public class perm_wrt_queen {
public static void main(String[] args) {
	boolean board[]=new boolean[4];
	
	perm(board, 2, 0, "");
	
	
	
}
public static void perm(boolean board[],int total_queen,int curr_q,String ans) {
	if(curr_q==total_queen) {
		System.out.println(ans);
		
	return;}
	for(int i=0;i<board.length;i++) {
	if(board[i]==false) {
		board[i]=true;
		perm(board, total_queen, curr_q+1,ans+"q"+curr_q+"b"+i+",");
		board[i]=false;
	}
	
}}
}
