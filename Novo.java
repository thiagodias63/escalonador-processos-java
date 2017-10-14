package com.br.trabalho_faculdade;
import java.util.LinkedList;
//import java.util.Queue;

public class Novo implements Fila
{
	public LinkedList<Processo> filaNovo = new LinkedList<Processo>(); 
	@Override
	public boolean enfileirar(Processo p) {
		if(this.filaNovo.add(p) == true)
			return true;
		else
			return false;
	}
	public Processo desenfileirar() 
	{
		if(this.vazia() == true)
		{
			return null;
		}
		else
		{
			return this.filaNovo.remove();
		}
	}
	@Override
	public boolean vazia() {
		if(this.filaNovo.isEmpty() == true)
			return true;
		else
			return false;
	}
	public void ImprimeFila()
	{
		System.out.println("Processo | PID | Chegada | Tamanho | Prioridade");
		for(Processo p : this.filaNovo)
		{
			System.out.println(p.nome + " | " + p.pid  + " | "+ p.chegada + " | " + p.tamanho + " | " + p.prioridade);
		}
	}
}