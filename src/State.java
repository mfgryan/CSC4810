import java.util.ArrayList;
import java.util.Collections;


public class State extends StateOperations{
	
	private ArrayList<State> childNodes;
	private State parentNode;
	
	private ArrayList<Integer> numbers;
	private String[][] puzzle;
	
	private int rowSpace;	//these two values record where the space is in the table
	private int colSpace; 
	
	private int   index;              //index for all of the int arrays
	private int[] possibleMoves;	  //records each move possible in a given state
	private int[] moveRow;
	private int[] moveCol;
	private int[] moveCosts;          //cost of each move possible
	
	public State(){
		puzzle = new String[3][3];
		numbers = new ArrayList<Integer>();
		
		for(int i = 0; i < 9; i++)
			numbers.add(i);
		
		Collections.shuffle(numbers);
		setState();
		
		possibleMoves = new int[8];
		moveRow = new int[8];
		moveCol = new int[8];
		moveCosts = new int[8];
	}
	
	public State(ArrayList<Integer> numbers){
		puzzle = new String[3][3];
		this.numbers = numbers;
		setState();
		this.index = 0;
		
		possibleMoves = new int[8];
		moveRow = new int[8];
		moveCol = new int[8];
		moveCosts = new int[8];
	}
	
	private void setState(){
		int i = 0;
		
		for(int row = 0;row < puzzle.length; row ++){
			for(int col = 0;col < puzzle[row].length;col++){
				if(numbers.get(i) == 0){
					rowSpace = row;
					colSpace = col;
				}	
				puzzle[row][col] = numbers.get(i++) + "";
			}
		}
		this.index = 0;
	}
	
	public ArrayList<Integer> getState(int returnType){
		
		if(returnType == 0){
			int i =0;
			
			for(int row = 0;row < puzzle.length; row ++){
				for(int col = 0;col < puzzle[row].length;col++){
					System.out.print(puzzle[row][col] + " ");
				}
				System.out.println();
			}
			
			return null;	
		}else if (returnType ==1){
			return numbers;
		}
		
		System.out.println("invalid input");
		return null;
		
	}

	public int getRowSpace() {
		return rowSpace;
	}

	public void setRowSpace(int rowSpace) {
		this.rowSpace = rowSpace;
	}

	public int getColSpace() {
		return colSpace;
	}

	public void setColSpace(int colSpace) {
		this.colSpace = colSpace;
	}

	public int getPossibleMoves(int i) {
		return possibleMoves[i];
	}

	public int getMoveRow(int i) {
		return moveRow[i];
	}

	public int getMoveCol(int i) {
		return moveCol[i];
	}
	
	public int getMoveCosts(int i){
		return moveCosts[i];
	}
}
