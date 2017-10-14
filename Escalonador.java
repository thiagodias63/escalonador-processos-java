package com.br.trabalho_faculdade;

public class Escalonador extends Gerenciador_Processos 
{
	public void prontoParaExecucao(Pronto pronto)
	{
		Processo processoPronto = pronto.remove();
		Executando e = new Executando(processoPronto);
		System.out.println("Processo deve ir para a fila de:" + e.estadoProcesso);
	}
}
