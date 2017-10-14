package com.br.trabalho_faculdade;

public class testes {

	public static void main(String[] args) {
		Gerenciador_Processos g = new Gerenciador_Processos();
		Escalonador e = new Escalonador();
		/*if(g.criaNovo(1368, "Chrome", 1, "Normal") == true)
		{
			System.out.println("Enfilerado!");
		};*/
		
		g.criaNovo(1374, "Firefox", 1, 3, "Normal",false,false,false,false);
		g.criaNovo(1374, "Eclipse", 1, 1, "Normal",false,false,false,false);
		g.criaNovo(1374, "Sublime", 1, 7, "Normal",false,false,false,true);
		
		g.novoParaPronto();
		g.novoParaPronto();
		g.novoParaPronto();
		
		e.prontoParaExecucao(g.getPronto());
		e.prontoParaExecucao(g.getPronto());
		e.prontoParaExecucao(g.getPronto());
		//g.ImprimeFilas();
	}
	
	/*Processo Chrome = new Processo(1368,"Chrome","Normal");
	Processo Firefox = new Processo(1374,"Firefox","Normal");
	Novo fn = new Novo(1000);
	Pronto p = new Pronto(1000);
	fn.enfileirar(Chrome);
	fn.enfileirar(Firefox);
	p.enfileirar(fn.desenfileirar());
	fn.imprime();*/

}
