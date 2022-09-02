package Backtracking;

public class RatInAMaze {

	public static boolean ratInAMaze(int[][] maze) {
		
		 int n = maze.length;
		 
		 int path[][] = new int[n][n];
		 
		 return solvePathInAMaze(maze , 0 , 0 , path);
	}
	
	public static boolean solvePathInAMaze(int[][] maze, int i, int j, int[][] path) {
		
		  int n = maze.length;
		  
		  if(i < 0 || j >= n || j < 0 || i >= n || maze[i][j] == 0 || path[i][j] == 1) {
			  
			  return false;
		  }
	
	   path[i][j] = 1;
	   
	   if( i == n - 1 && j == n - 1 ) {
		   
		   
		   return true;
	   
	   }
	   
	    if(solvePathInAMaze(maze, i - 1, j, path)) {
	    	
	    	return true;
	    }
	
	  if(solvePathInAMaze(maze, i, j + 1, path)) {
		  
		  return true;
	  }
	
	    if(solvePathInAMaze(maze, i + 1 , j, path)) {
	    	
	    	return true;
	    }
	
	  if(solvePathInAMaze(maze, i, j - 1, path)) {
		  
		  return true;
	  }
	
	      return false;
	
	}
	

	public static void main(String[] args) {
		
      int maze[][] = {{1,1,0} , {1,1,0} , {1,1,1}};
      
      boolean pathResult = ratInAMaze(maze);
      
      System.out.println(pathResult);
	   
	}

	

}
