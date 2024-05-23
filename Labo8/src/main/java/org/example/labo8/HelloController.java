package org.example.labo8;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

public class HelloController {

    @FXML
    RadioButton rbEstudiante, rbEmpleado, rbEfectivo, rbTarjeta;

    @FXML
    private TextField tfNombre;

    @FXML
    private KeyEvent event;




    /*@FXML
    void initialize() {
        ToggleGroup tipoClienteGroup = new ToggleGroup();
        rbEstudiante.setToggleGroup(tipoClienteGroup);
        rbEmpleado.setToggleGroup(tipoClienteGroup);

        ToggleGroup formaDePagoGroup = new ToggleGroup();
        rbTarjeta.setToggleGroup(formaDePagoGroup);
        rbEfectivo.setToggleGroup(formaDePagoGroup);
    }*/


    @FXML
    protected void onKeyTyped(KeyEvent event) {
        System.out.println(event.getCharacter());
    }

    @FXML
    void onLimpiarButtonClick() {
        rbEmpleado.setSelected(false);
        rbEfectivo.setSelected(false);
        rbEstudiante.setSelected(false);
        rbTarjeta.setSelected(false);
        tfNombre.setText("");
    }

    @FXML
    void comprar(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmacion de Compra");
        alert.setHeaderText(null);
        alert.setContentText("Bienvenido " + tfNombre.getText());
        alert.setContentText("Forma de pago: ");
        alert.setContentText("Tipo de Cliente: ");
    }
}