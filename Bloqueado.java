package com.br.trabalho_faculdade;

import java.util.ArrayList;

public class Bloqueado {
	protected ArrayList<Processo> filaBloqueado = new ArrayList<Processo>();
	public void enfileira(Processo p)
	{
		this.filaBloqueado.add(p);
	}
	public Processo desenfileirar()
	{
		if(!this.vazia())
		{
			return this.filaBloqueado.remove(0);
		}
		else
		{
			return null;
		}		
	}
	public boolean vazia()
	{
		if(this.filaBloqueado.isEmpty() == true)
			return true;
		else
			return false;
	}
	public void ImprimeFila()
	{
		System.out.println("Processo | PID | Chegada | Tamanho | Prioridade | Interrupção? | SVC? | Exeção? | Gera Bloqueio?");
		for(Processo p : this.filaBloqueado)
		{
			System.out.println(p.nome + " | " + p.pid  + " | "+ p.chegada + " | " + p.tamanho + " | " + p.prioridade + " | " + p.interrupcao + " | " + p.svc + " | " + p.excecao + " | " + p.geraBloqueio);
		}
	}
}
