package ruijosecj.loja.desconto;

import java.math.BigDecimal;

import ruijosecj.loja.orcamento.Orcamento;

public class DescontoMaisDeCincoItens extends Desconto {

	public DescontoMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		return proximo.calcular(orcamento);
	}
	
}
