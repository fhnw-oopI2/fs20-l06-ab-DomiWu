package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane {
	private Button buttonTop;
	private Button buttonRight;
	private Button buttonBottom;
	private Button buttonLeft;
	private TextArea textArea;
	private Insets marginInsets;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		buttonTop = new Button("top");
		buttonRight = new Button("right");
		buttonBottom = new Button("bottom");
		buttonLeft = new Button("left");
		textArea = new TextArea();
		marginInsets = new Insets(2);
	}

	private void layoutControls() {
		this.setPadding(new Insets(5));

		this.setTop(buttonTop);
		this.setRight(buttonRight);
		this.setBottom(buttonBottom);
		this.setLeft(buttonLeft);
		this.setCenter(textArea);

		buttonTop.setMaxWidth(Double.MAX_VALUE);
		buttonBottom.setMaxWidth(Double.MAX_VALUE);

		getChildren().stream().forEach(button -> setMargin(button, marginInsets));
	}
}