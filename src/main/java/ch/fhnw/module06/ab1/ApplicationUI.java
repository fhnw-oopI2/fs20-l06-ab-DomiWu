package ch.fhnw.module06.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
	private Button button;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button = new Button("Hello World");
	}

	private void layoutControls() {
		this.getChildren().add(button);
	}
}