package br.com.jurisgest;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.jurisgest.modelo.Cliente;
import br.com.jurisgest.modelo.Honorarios;
import br.com.jurisgest.modelo.Processo;

public class JurisGest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(
		        "João Silva",
		        "123.456.789-00",
		        "51999999999",
		        "Caixa",
		        "Agência Centro"
		);

		Processo processo = new Processo(
		        "0001234-56.2026.5.04.0001",
		        "Banco Exemplo",
		        "ES & MF",
		        "Horas extras",
		        "Porto Alegre",
		        "1ª Vara do Trabalho",
		        "Ajuizado",
		        LocalDate.of(2026, 8, 4),
		        15000.00,
		        cliente
		);
		
		
		Honorarios honorarios = new Honorarios(
		        processo,
		        new BigDecimal("3000.00"),
		        new BigDecimal("1500.00"),
		        "Dra. marilia",
		        new BigDecimal("10.00")
		);

		System.out.println("Cliente: " + processo.getCliente().getNome());
		System.out.println("Número do processo: " + processo.getNumeroProcesso());
		System.out.println("Banco: " + processo.getBancoEmpresa());
		System.out.println("Fase: " + processo.getFase());
		System.out.println("Valor da ação: " + processo.getValorAcao());
		System.out.println("Data de ajuizamento: " + processo.getDataAjuizamento());
		System.out.println("Advogado: " + honorarios.getAdvogadoResponsavel());
		
		System.out.println("Honorários contratuais: R$ " + honorarios.getHonorariosContratuais());
		System.out.println("Honorários sucumbenciais: R$ " + honorarios.getHonorariosSucumbenciais());
		System.out.println("Percentual de comissão: " + honorarios.getPercentualComissao() + "%");
		System.out.println("Total de honorários: R$ " + honorarios.getTotalHonorarios());
	}

}
