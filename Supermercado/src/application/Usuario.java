package application;

public class Usuario implements InterfaceUsuario{
	private String nomeUsuario;
	private String enderecoUsuario;
	private String telefoneUsuario;
	private String emailUsuario;
	private String idUsuario;
	private String senhaUsuario;
	
	public void setNomeUsuario(String nome){
		this.nomeUsuario = nome;
	}
	public String getNomeUsuario(){
		return nomeUsuario;
	}
	public void setEnderecoUsuario(String endereco){
		this.enderecoUsuario = endereco;
	}
	public String getEnderecoUsuario(){
		return enderecoUsuario;
	}
	public void setTelefoneUsuario(String telefone){
		this.telefoneUsuario = telefone;
	}
	public String getTelefoneUsuario(){
		return telefoneUsuario;
	}
	public void setEmailUsuario(String email){
		this.emailUsuario = email;
	}
	public String getEmailUsuario(){
		return emailUsuario;
	}
	public void setIdUsuario(String id){
		this.idUsuario = id;
	}
	public String getIdUsuario(){
		return idUsuario;
	}
	public void setSenhaUsuario(String senha){
		this.senhaUsuario = senha;
	}
	public String getSenhaUsuario(){
		return senhaUsuario;
	}
}
