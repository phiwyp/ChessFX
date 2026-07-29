package chessgui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Board;

public class ChessApp extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BoardView boardView= new BoardView(new Board());
		GridPane gridpane = boardView.getGridPane();
		Scene scene = new Scene(gridpane);
		stage.setScene(scene);
		stage.show();
	}

}
