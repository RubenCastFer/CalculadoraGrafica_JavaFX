package gui.viewsandcontrollers.main;

import java.io.IOException;

import contenido.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class CalculadoraVistaController {
	@FXML
	private Button masButton;
	@FXML
	private Button entreButton;
	@FXML
	private Button porButton;
	@FXML
	private Button menosButton;
	@FXML
	private TextField txtNum1;
	@FXML
	private TextField txtNum2;
	@FXML
	private TextField txtResultado;

	Parent root = null;

	// Event Listener on Button[#masButton].onAction
	@FXML
	public void sumar(ActionEvent event) throws IOException {

		try {
			int num1 = Integer.parseInt(this.txtNum1.getText());
			int num2 = Integer.parseInt(this.txtNum2.getText());
			Calculadora sumar = new Calculadora();
			int resultado = sumar.suma(num1, num2);
			this.txtResultado.setText(String.valueOf(resultado));

		} catch (NumberFormatException e) {
			root = FXMLLoader.load(getClass().getResource("error.fxml"));
			Scene scene = new Scene(root);
			Stage dialog = new Stage();
			dialog.setScene(scene);
			dialog.showAndWait();
		}

	}

	// Event Listener on Button[#entreButton].onAction
	@FXML
	public void division(ActionEvent event) throws IOException {
		try {
			int num1 = Integer.parseInt(this.txtNum1.getText());
			int num2 = Integer.parseInt(this.txtNum2.getText());

			Calculadora div = new Calculadora();
			int resultado = div.dividir(num1, num2);
			this.txtResultado.setText(String.valueOf(resultado));

		} catch (NumberFormatException e) {
			root = FXMLLoader.load(getClass().getResource("error.fxml"));
			Scene scene = new Scene(root);
			Stage dialog = new Stage();
			dialog.setScene(scene);
			dialog.showAndWait();
		}
	}

	// Event Listener on Button[#porButton].onAction
	@FXML
	public void multiplicar(ActionEvent event) throws IOException {
		try {
			int num1 = Integer.parseInt(this.txtNum1.getText());
			int num2 = Integer.parseInt(this.txtNum2.getText());

			Calculadora mult = new Calculadora();
			int resultado = mult.multiplicar(num1, num2);
			this.txtResultado.setText(String.valueOf(resultado));

		} catch (NumberFormatException e) {
			root = FXMLLoader.load(getClass().getResource("error.fxml"));
			Scene scene = new Scene(root);
			Stage dialog = new Stage();
			dialog.setScene(scene);
			dialog.showAndWait();
		}
	}

	// Event Listener on Button[#menosButton].onAction
	@FXML
	public void restar(ActionEvent event) throws IOException {
		try {
			int num1 = Integer.parseInt(this.txtNum1.getText());
			int num2 = Integer.parseInt(this.txtNum2.getText());

			Calculadora restar = new Calculadora();
			int resultado = restar.restar(num1, num2);
			this.txtResultado.setText(String.valueOf(resultado));

		} catch (NumberFormatException e) {
			root = FXMLLoader.load(getClass().getResource("error.fxml"));
			Scene scene = new Scene(root);
			Stage dialog = new Stage();
			dialog.setScene(scene);
			dialog.showAndWait();
		}
	}
}
