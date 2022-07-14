package ruijosecj.loja.teste;

import java.math.BigDecimal;

import ruijosecj.loja.imposto.CalculadoraImpostos;
import ruijosecj.loja.imposto.ICMS;
import ruijosecj.loja.imposto.ISS;
import ruijosecj.loja.orcamento.Orcamento;

public class TesteImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS()));
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
	}

}
