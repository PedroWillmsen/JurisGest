package br.com.jurisgest.modelo;

import java.math.BigDecimal;

public class Honorarios {

    private Processo processo;
    private BigDecimal honorariosContratuais;
    private BigDecimal honorariosSucumbenciais;
    private String advogadoResponsavel;
    private BigDecimal percentualComissao;
    
    public Honorarios(Processo processo,
            BigDecimal honorariosContratuais,
            BigDecimal honorariosSucumbenciais,
            String advogadoResponsavel,
            BigDecimal percentualComissao) {
    	
this.processo = processo;
this.honorariosContratuais = honorariosContratuais;
this.honorariosSucumbenciais = honorariosSucumbenciais;
this.advogadoResponsavel = advogadoResponsavel;
this.percentualComissao = percentualComissao;
}
    public Processo getProcesso() {
        return processo;
    }

    public BigDecimal getHonorariosContratuais() {
        return honorariosContratuais;
    }

    public BigDecimal getHonorariosSucumbenciais() {
        return honorariosSucumbenciais;
    }

    public String getAdvogadoResponsavel() {
        return advogadoResponsavel;
    }

    public BigDecimal getPercentualComissao() {
        return percentualComissao;
    }
    
    public BigDecimal getTotalHonorarios() {
        return honorariosContratuais.add(honorariosSucumbenciais); //add pq BigDecimal é uma classr, por isso n usei o +
    }
}