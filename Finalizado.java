package com.br.trabalho_faculdade;

import java.util.ArrayList;

public class Finalizado {
	protected ArrayList<Processo> finalizados = new ArrayList<Processo>();
	
	public void enfilera(Processo p)
	{
		this.finalizados.add(p);
	}
	public void ImprimeFila()
	{
		System.out.println("Processo | PID | Chegada | Tamanho | Prioridade | Interrupção? | SVC? | Exeção? | Gera Bloqueio?");
		for(Processo p : this.finalizados)
		{
			System.out.println(p.nome + " | " + p.pid  + " | "+ p.chegada + " | " + p.tamanho + " | " + p.prioridade + " | " + p.interrupcao + " | " + p.svc + " | " + p.excecao + " | " + p.geraBloqueio);
		}
	}
}
