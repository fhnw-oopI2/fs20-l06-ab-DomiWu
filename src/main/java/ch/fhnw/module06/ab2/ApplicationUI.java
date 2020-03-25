package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
	private Label label;
	private TextField textField;
	private TextArea textArea;
	private Button button;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		label = new Label("ein Label");
		textField = new TextField("text field");
		textArea = new TextArea("text area");
		button = new Button("ein Button");
	}

	private void layoutControls() {
		this.setPadding(new Insets(10));
		this.getChildren().add(label);
		this.getChildren().add(textField);
		this.getChildren().add(textArea);
		this.getChildren().add(button);
	}
}