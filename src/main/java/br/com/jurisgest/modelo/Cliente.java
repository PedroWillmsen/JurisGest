package br.com.jurisgest.modelo;

public class Cliente {

	    private String nome;
	    private String cpf;
	    private String telefone;
	    private String funcao;
	    private String unidadeAg;
	    
	    public Cliente(String nome, String cpf, String telefone, String funcao, String unidadeAg) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.telefone = telefone;
	        this.funcao = funcao;
	        this.unidadeAg = unidadeAg;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public String getFuncao() {
	        return funcao;
	    }

	    public String getUnidadeAg() {
	        return unidadeAg;
	    }

	    @Override
	    public String toString() {
	        return "Cliente: " + nome + " | CPF: " + cpf + " | Função: " + funcao;
	    }
}
