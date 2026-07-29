package model;

public class Piece {
	private final PieceType pieceType;
	private final boolean white;
	
	public Piece(PieceType pieceType, boolean white) {
		this.pieceType = pieceType;
		this.white = white;
	}
	
	public PieceType getPieceType() {
		return pieceType;
	}
	
	public boolean getWhite() {
		return white;
	}

}
