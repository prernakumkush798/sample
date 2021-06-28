package lecture_27;

public class comb_wrt_queen {
public static void main(String[] args) {
	Queen_comb_wrt_Q(new boolean[4], 0, -1, 2, "");
	
}
public static void Queen_comb_wrt_Q(boolean[] board, int curr_Q, int prev_box, int total_Q, String ans) {
	if (total_Q == curr_Q) { // +ve
		System.out.println( ans);
		return;
	}
	for (int i = prev_box+1; i < board.length; i++) {
//		if (board[i] == false) {
//			board[i] = true;// bad phed gayi Queen Q0 .. work for the next queen
		
		Queen_comb_wrt_Q(board, curr_Q + 1, i , total_Q, ans +"q"+curr_Q+ "b" + i);
//			board[i] = false; // Queen uda.. Undo work ??!?!
		}
	}
}

//q0b0q1b1
//q0b0q1b2
//q0b0q1b3
//q0b1q1b2
//q0b1q1b3
//q0b2q1b3

