package com.br.trabalho_faculdade;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Comparable;
public class Pronto implements Fila
{
	public LinkedList<Processo> filaPronto = new LinkedList<Processo>();
	private LinkedList<Processo> filaAuxOrdenacao = new LinkedList<Processo>();
	@Override
	public boolean enfileirar(Processo p) 
	{
		/*Espera um processo que vem da fila de novo ou de bloqueado*/
		if(this.filaPronto.add(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Processo desenfileirar() 
	{
		if(this.vazia() == true)
		{
			return null;
		}
		else
		{
			return this.filaPronto.remove();
		}
	}
	@Override
	public boolean vazia() {
		if(this.filaPronto.isEmpty() == true)
			return true;
		else
			return false;
	}
	public void ImprimeFila()
	{
		System.out.println("Processo | PID | Chegada | Tamanho | Prioridade");
		for(Processo p : this.filaAuxOrdenacao)
		{
			System.out.println(p.nome + " | " + p.pid  + " | "+ p.chegada + " | " + p.tamanho + " | " + p.prioridade);
		}
	}
	public void ordernar(Processo outroProcesso)
	{
		/*for(Processo p : this.filaPronto)
		{
			if(outroProcesso.chegada >= p.chegada)
			{
				if(outroProcesso.tamanho <= p.tamanho)
				{
					this.filaAuxOrdenacao.add(this.filaPronto.removeFirst());
				}
			}
		}*/
		//this.filaPronto = this.filaAuxOrdenacao;
	}
}

/*@Override
public int compareTo(Object o) {
	Processo p = (Processo) o;
	if(p.chegada >= this.filaPronto.element().chegada)
	{
		if(p.tamanho <= this.filaPronto.element().tamanho)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	else
	{
		return 1;
	}
}*/