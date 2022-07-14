package ruijosecj.loja.imposto;

import java.math.BigDecimal;

import ruijosecj.loja.orcamento.Orcamento;

public class CalculadoraImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		return tipoImposto.calcular(orcamento);
	}

}
