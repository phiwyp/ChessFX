package chessgui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import model.Board;
import model.Piece;

public class BoardView {
	
	private GridPane gp = new GridPane();
	
	public BoardView(Board board) {
		// TODO Auto-generated constructor stub
		createBoard(board);
	}
	
	public void createBoard(Board board) {
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				StackPane sp = new StackPane();
				Rectangle rectangle = new Rectangle(100,100);
				if((i+j)%2!=0) {
					rectangle.setFill(Color.WHITE);
				}
				else {
					rectangle.setFill(Color.BLACK);
				}
				
				sp.getChildren().add(rectangle);
				
				
				
				Piece piece = board.getPieceAt(i, j);
				if(piece!=null) {
					ImageView imageview = new ImageView(loadPieceImage(piece));
					imageview.setFitWidth(60);
					imageview.setFitHeight(90);
					sp.getChildren().add(imageview);
				}
				
				gp.add(sp, i, j);
			
			}
		}
	}
	
	public GridPane getGridPane() {
		return gp;
	}
	
	public Image loadPieceImage(Piece piece) {
		String color = piece.getWhite() ? "white" : "black";
		String pieceType = piece.getPieceType().name().toLowerCase();
		String path = color + "-" + pieceType + ".png";
		
		return new Image(getClass().getResourceAsStream(path));
	}

}
