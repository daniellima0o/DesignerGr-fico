package daniellima.login;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Hyperlink;

public class TelaLoginController {

    @FXML
    private Button entrarButton;

    @FXML
    private Label msgLogarLabel;

    @FXML
    private PasswordField senhaField;

    @FXML
    private Label senhaLabel;

    @FXML
    private Label usuarioLabel;

    @FXML
    private TextField usuarioTextField;
    
    @FXML
    private Hyperlink cadastrarLink;

    @FXML
    public void login(ActionEvent event) {
        if(usuarioTextField.getText().equals("daniellima") && senhaField.getText().equals("123456")){
            msgLogarLabel.setText("Login realizado com sucesso");
        }else{
            msgLogarLabel.setText("Login não realizado com sucesso");
        }
        

    }
    @FXML
    void cadastrar(ActionEvent event) throws IOException {
        App.setRoot("telaCadastro1");

    }
}
