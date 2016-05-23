package it.polito.tdp.sudoku.model;

public abstract class Test {

	public static void main(String[] args) {
		SudokuGenerator sg = new SudokuGenerator();
		SudokuSolver ss = new SudokuSolver();
		
        int [][] matrice = sg.nextBoard(55);
        for(int i =0; i<9; i++){
        	System.out.print("\n");
        	for(int j=0; j<9; j++){
       System.out.print( matrice [i][j]);
        	}}
        
	ss.risolvi(matrice);
	
	for(int i =0; i<9; i++){
    	System.out.print("\n");
    	for(int j=0; j<9; j++){
   System.out.print( matrice [i][j]);
   
    	}}
	}
	
	

}
