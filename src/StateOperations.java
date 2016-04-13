
public class StateOperations {
	
	public static void calculatePossibleMoves(){
		for(int row = 0;row < puzzle.length; row++ ){
			for(int col = 0;col < puzzle[row].length;col++){
				
				if( Math.abs(row-rowSpace) < 2 && Math.abs(col-colSpace) < 2  && Integer.parseInt(puzzle[row][col]) != 0){
					possibleMoves[index] = Integer.parseInt(puzzle[row][col]);
					moveRow[index] = row;
					moveCol[index] = col;
					moveCosts[index] = findDistance(row,col,Integer.parseInt(puzzle[row][col]));
					//moveDistance[index] = findDistance(row,col,Integer.parseInt(puzzle[row][col]));
					index++;
				}
				
			}
		}	
	}
	
	public int findDistance(int row, int col, int value){
		int cost = 5;
		
		switch(value){
		
		case 1:
			cost = Math.abs(row-0) + Math.abs(col-0);
			break;
		case 2:
			cost = Math.abs(row-0) + Math.abs(col-1);
			break;
		case 3:
			cost = Math.abs(row-0) + Math.abs(col-2);
			break;
		case 4:
			cost = Math.abs(row-1) + Math.abs(col-2);
			break;
		case 5:
			cost = Math.abs(row-2) + Math.abs(col-2);
			break;
		case 6:
			cost = Math.abs(row-2) + Math.abs(col-1);
			break;
		case 7:
			cost = Math.abs(row-2) + Math.abs(col-0);
			break;
		case 8:
			cost = Math.abs(row-1) + Math.abs(col-0);
			break;
		}
		return cost;
	}
	
	public static void printPossibleMoves(State s1){
		System.out.println("\n"+s1.getRowSpace()+","+s1.getColSpace()+"\n");
		for(int i = 0; i < 8;i++){
			if(s1.getPossibleMoves(i)!= 0)
				System.out.println(s1.getPossibleMoves(i) + ": " + s1.getMoveRow(i)+","+s1.getMoveCol(i)+" COST:"+ s1.getMoveCosts(i));
		}
	}
}
