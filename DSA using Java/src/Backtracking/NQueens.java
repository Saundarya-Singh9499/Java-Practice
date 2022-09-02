package Backtracking;

public class NQueens {

	public static void placeNQueens(int n) {
		
	    int board[][] = new int[n][n];
	    
	    placeQueens( n , 0 , 0 , board);
	
	}
	
	public static void placeQueens(int n, int row, int col, int[][] board) {
		
		if( row == n ) {
			
			for(int i = 0 ; i < board.length ; i++) {
				
				for(int j = 0 ; j < board.length ; j++) {
					
				    System.out.println(board[i][j] + " ");
				}
			
			        System.out.println();
			}
			 
		        board[row][col] = 0;
		        
		        return;
		}
		
	        if(board[row][col] == 0) {
	        	
	        	board[row][col] = 1;
	        }
	        
	        if(board[row][col] == 1) {
	        	
	        	return;
	        }
	
	      placeQueens(n, row, col + 1, board);
	      
	      placeQueens(n, row + 1, col, board);
	      
	      placeQueens(n, row + 1, col + 1, board);
	      
	      board[row][col] = 0;
	}

	public static void main(String[] args) {
		
		int n = 4;
		
        placeNQueens(n);
	
	}

}
