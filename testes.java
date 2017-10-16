package com.br.trabalho_faculdade;

public class testes {

	public static void main(String[] args) {
		Gerenciador_Processos g = new Gerenciador_Processos();
		
		g.criaNovo(1374, "Firefox", 1, 3, "Normal",false,false,false,false);
		g.criaNovo(1374, "Eclipse", 1, 1, "Normal",false,false,false,false);
		g.criaNovo(1374, "Sublime", 1, 7, "Normal",false,false,false,true);
		
		g.novoParaPronto();
		g.novoParaPronto();
		g.novoParaPronto();
		g.prontoParaExecucao();
		g.Executar();
		g.prontoParaExecucao();
		g.Executar();
		g.prontoParaExecucao();
		g.Executar();
		g.RemoveBloqueado();
		
	}
}