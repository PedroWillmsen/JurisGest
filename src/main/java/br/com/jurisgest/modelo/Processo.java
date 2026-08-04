package br.com.jurisgest.modelo;

import java.time.LocalDate;

public class Processo {
	
	private String numeroProcesso;
    private String bancoEmpresa;
    private String escritorio;
    private String objeto;
    private String comarca;
    private String vara;
    private String fase;
    private LocalDate dataAjuizamento;
    private double valorAcao;
    private Cliente cliente;
    
    public Processo(String numeroProcesso, String bancoEmpresa, String escritorio, String objeto, String comarca, String vara, String fase, LocalDate dataAjuizamento, double valorAcao, Cliente cliente) {
    	
    			this.numeroProcesso = numeroProcesso;
    			this.bancoEmpresa = bancoEmpresa;
    			this.escritorio = escritorio;
    			this.objeto = objeto;
    			this.comarca = comarca;
    			this.vara = vara;
    			this.fase = fase;
    			this.dataAjuizamento = dataAjuizamento;
    			this.valorAcao = valorAcao;
    			this.cliente = cliente;
}
    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public String getBancoEmpresa() {
        return bancoEmpresa;
    }

    public String getEscritorio() {
        return escritorio;
    }

    public String getObjeto() {
        return objeto;
    }

    public String getComarca() {
        return comarca;
    }

    public String getVara() {
        return vara;
    }

    public String getFase() {
        return fase;
    }

    public LocalDate getDataAjuizamento() {
        return dataAjuizamento;
    }

    public double getValorAcao() {
        return valorAcao;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
