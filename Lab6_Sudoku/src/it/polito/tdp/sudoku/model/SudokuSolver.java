package it.polito.tdp.sudoku.model;


public class SudokuSolver {

	public int [][] risolvi (int[][] board){	
		
		return ric(0,board);
	}
	
	public int[][] ric(int passo, int[][] board){
		if(passo == 81){
//			soluzione trovata
			return board;
		}
	if(board[passo / 9][passo % 9] == 0){
			for(int i=1; i<=9; i++){
					board[passo / 9][passo % 9]=i;
					if(Utils.check(board,true)){
						int[][] retBoard = ric(passo+1,board);
						if(retBoard!=null) return retBoard;
					}
//					backtrack
					board[passo / 9][passo % 9]=0;
					
			}
			
	}
	else {
		int[][]retBoard = ric(passo+1,board);
		if(retBoard != null) return retBoard;
	}
	return null;
}}

