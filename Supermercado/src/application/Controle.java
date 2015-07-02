package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controle implements Initializable{
	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	//Declarando as listas de clientes e produtos
	public List<Usuario> pessoas = new ArrayList<>();
	public List<Produto> prod = new ArrayList<>();
	
	//----------------JANELA INICIAL---------------------
	String confirmaId;
	String confirmaSenha;
	
	@FXML
	private Button btnEntra;
	@FXML
	private Button btnCadastroUsuario;
	@FXML
	private Button btnCadastroProduto;
	@FXML
	private TextField idTelaInicio;
	@FXML
	private TextField senhaTelaInicio;
	
	//ao precionar o botão entrar 
	public void entrarSistema(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/JanelaInterna.fxml"));
		Parent root = fxmlLoader.load();
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setOpacity(1);
		stage.setScene(new Scene(root));
		stage.showAndWait();
	
	}
	//ao precionar botão cadastrar usuario
	public void vaiCadastrarUsuario(ActionEvent event) {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/JanelaCadastroUsuario.fxml"));
		Parent root;
		try {
			root = fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setOpacity(1);
			stage.setScene(new Scene(root));
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    }
	//ao precionar botão cadastrar produto
	public void vaiCadastrarProduto(ActionEvent event){
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/JanelaCadastroProduto.fxml"));
		Parent root;
		try {
			root = fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setOpacity(1);
			stage.setScene(new Scene(root));
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
   }
	
	//------------------------------------------------------------------
	//--------------------------JANELA DE USUARIO------------------------
	@FXML
	private Button btnUsuario;
	@FXML
	private TextField nomeUsu;
	@FXML
	private TextField endereco;
	@FXML
	private TextField telefone;
	@FXML
	private TextField email;
	@FXML
	private TextField id;
	@FXML
	private TextField senha;
	
	//cadastrando usuarios em uma arrayList
	public void cadastraUsuario(ActionEvent event){
		Usuario usu = new Usuario();
		usu.setNomeUsuario(nomeUsu.getText());
		usu.setEnderecoUsuario(endereco.getText());
		usu.setTelefoneUsuario(telefone.getText());
		usu.setEmailUsuario(email.getText());
		usu.setIdUsuario(id.getText());
		usu.setSenhaUsuario(senha.getText());
		
		pessoas.add(usu);
		
		nomeUsu.clear();
		endereco.clear();
		telefone.clear();
		email.clear();
		id.clear();
		senha.clear();
		
		System.out.println(pessoas.size());
	}

	
	//------------------------------------------------------------------
	//-----------------------JANELA DE PRODUTO--------------------------
	String nomeProd;
	String precoProd;
	String validadeProd;
	String fornecedorProd;

	
	@FXML
	private Button btnProduto;
	@FXML
	private TextField nomeP;
	@FXML
	private TextField precoP;
	@FXML
	private TextField validadeP;
	@FXML
	private TextField fornecedorP;
	
	//cadastrando produtos em uma arrayList
	public void cadastraProduto(ActionEvent event){
		Produto p = new Produto();
		p.setNomeProduto(nomeP.getText());
		p.setPrecoProduto(precoP.getText());
		p.setValidadeProduto(validadeP.getText());
		p.setFornecedorProduto(fornecedorP.getText());
		
		prod.add(p);
		
		nomeP.clear();
		precoP.clear();
		validadeP.clear();
		fornecedorP.clear();
		
		
	}

}
