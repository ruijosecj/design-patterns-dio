package ruijosecj.loja.imposto;

import java.math.BigDecimal;

import ruijosecj.loja.orcamento.Orcamento;

public interface TipoImposto {
	BigDecimal calcular(Orcamento orcamento);
}
