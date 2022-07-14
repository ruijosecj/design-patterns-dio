package ruijosecj.loja.desconto;

import java.math.BigDecimal;

import ruijosecj.loja.orcamento.Orcamento;

public class CalculadoraDesconto {
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoMaisDeCincoItens(new DescontoValormaiorQuinhentos(new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
}
