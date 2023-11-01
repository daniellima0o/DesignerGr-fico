package daniellima.login;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TelaCadastro1Controller {

    @FXML
    private Button cadastrarButton;

    @FXML
    private PasswordField confirmarSenhaField;

    @FXML
    private Label confirmarSenhaLabel;

    @FXML
    private Hyperlink loginLink;

    @FXML
    private Label msgCadastrarLabel;

    @FXML
    private PasswordField senhaField;

    @FXML
    private Label senhaLabel;

    @FXML
    private Label usuarioLabel;

    @FXML
    private TextField usuarioTextField;

    @FXML
    void cadastrar(ActionEvent event) {

    }

    @FXML
    void logarLink(ActionEvent event) throws IOException {
        App.setRoot("telaLogin");

    }

}
