package ruijosecj.loja.teste;

import java.math.BigDecimal;

import ruijosecj.loja.desconto.CalculadoraDesconto;
import ruijosecj.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"),6);
		Orcamento orcamento1 = new Orcamento(new BigDecimal("1000"),1);
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		
		System.out.println(calculadora.calcular(orcamento));
		System.out.println(calculadora.calcular(orcamento1));
		
	}

}
