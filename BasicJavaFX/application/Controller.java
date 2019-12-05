package application;

import javafx.fxml.FXML;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.AnchorPane;
// import javafx.stage.Stage;

public class Controller {

	@FXML
	private AnchorPane mypane;

	@FXML
	public void setblur() {
		mypane.setEffect(new GaussianBlur(5));
	}

	@FXML
	public void setfocus() {
		mypane.setEffect(new GaussianBlur(0));
	}

	@FXML
	private void handleClose() {
		System.exit(0);
	}

	/*
	 * Metodo para que abra otra ventana de la vista al darle al boton close
	 * 
	 * @FXML private void openStage() {
	 * 
	 * try { FXMLLoader loader = new
	 * FXMLLoader(getClass().getResource("vista.fxml")); mypane = (AnchorPane)
	 * loader.load(); Scene scene = new Scene(mypane); Stage stage = new Stage();
	 * stage.setScene(scene); stage.show(); } catch (Exception e) {
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

}
