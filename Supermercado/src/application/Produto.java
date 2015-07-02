package application;

public class Produto{
	
	private String nomeProduto;
	private String precoProduto;
	private String validadeProduto;
	private String fornecedorProduto;
	private String statusProduto = "Disponivel";
	
	
	public void setNomeProduto(String nomeProduto){
		this.nomeProduto = nomeProduto;
	}
	public String getNomeProduto(){
		return nomeProduto;
	}
	public void setPrecoProduto(String precoProduto){
		this.precoProduto = precoProduto;
	}
	public String getPrecoProduto(){
		return precoProduto;
	}
	public void setValidadeProduto(String validadeProduto){
		this.validadeProduto = validadeProduto;
	}
	public String getValidadeProduto(){
		return validadeProduto;
	}
	public void setFornecedorProduto(String fornecedorProduto){
		this.fornecedorProduto = fornecedorProduto;
	}
	public String getFornecedorProduto(){
		return fornecedorProduto;
	}
	public void setStatusProduto(String statusProduto){
		this.statusProduto = statusProduto;
	}
	public String getStatusProduto(){
		return statusProduto;
	}
}
