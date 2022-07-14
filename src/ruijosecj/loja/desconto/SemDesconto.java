package ruijosecj.loja.desconto;

import java.math.BigDecimal;

import ruijosecj.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		return BigDecimal.ZERO;
	}
	
}
