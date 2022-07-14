package ruijosecj.loja.desconto;

import java.math.BigDecimal;

import ruijosecj.loja.orcamento.Orcamento;

public class DescontoValormaiorQuinhentos extends Desconto {

	public DescontoValormaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		return proximo.calcular(orcamento);
	}
	
}
