package model;

public class Board {
	private final Piece[][] field = new Piece[8][8];

	public Board() {
		// TODO Auto-generated constructor stub
		setUpBoard();
	}
	
	public void setUpBoard() {
		field[0][4] = new Piece(PieceType.King, true);
		field[7][4] = new Piece(PieceType.King, false);
		
		field[0][3] = new Piece(PieceType.Queen, true);
		field[7][3] = new Piece(PieceType.Queen, false);
		
		field[0][2] = new Piece(PieceType.Bishop, true);
		field[0][5] = new Piece(PieceType.Bishop, true);
		field[7][2] = new Piece(PieceType.Bishop, false);
		field[7][5] = new Piece(PieceType.Bishop, false);
		
		field[0][1] = new Piece(PieceType.Knight, true);
		field[0][6] = new Piece(PieceType.Knight, true);
		field[7][1] = new Piece(PieceType.Knight, false);
		field[7][6] = new Piece(PieceType.Knight, false);

		field[0][0] = new Piece(PieceType.Rook, true);
		field[0][7] = new Piece(PieceType.Rook, true);
		field[7][0] = new Piece(PieceType.Rook, false);
		field[7][7] = new Piece(PieceType.Rook, false);
		
		for(int i=0; i<8; i++) {
			field[1][i] = new Piece(PieceType.Pawn, true);
			field[6][i] = new Piece(PieceType.Pawn, false);
		}

	}
	
	public Piece getPieceAt(int row, int col) {
		return field[row][col];
	}
}
