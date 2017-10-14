package com.br.trabalho_faculdade;

public class Escalonador extends Gerenciador_Processos 
{
	public void prontoParaExecucao(Pronto pronto)
	{
		Processo processoPronto = pronto.remove();
		//System.out.println(processoPronto.nome);
	}
}
