package com.br.trabalho_faculdade;

import java.util.ArrayList;

public class Pronto implements Fila 
{
	ArrayList<Processo> filaPronto = new ArrayList<Processo>(); 
	@Override
	public boolean enfileirar(Processo p)
	{
		if(this.filaPronto.add(p) == true)
			return true;
		else
			return false;
	}
	@Override
	public boolean vazia()
	{
		if(this.filaPronto.isEmpty() == true) 
			return true;
		else
			return false;
	}
	public Processo remove()
	{
		if(!this.vazia())
		{
			Processo menorTamanho = new Processo(1,"ProcessoDeCoparacao",0,1000,"Baixa",false,false,false,false);
			for(Processo p : this.filaPronto)
			{
				if(p.interrupcao == true || p.svc == true || p.excecao == true || p.prioridade == "Bloqueado")
				{
					Processo retornaProcesso = p;
					this.filaPronto.remove(this.filaPronto.indexOf(p));
					return retornaProcesso;
				}
			}
			for(Processo p : this.filaPronto)
			{
				if(p.prioridade == "Alta")
				{
					Processo retornaProcesso = p;
					this.filaPronto.remove(this.filaPronto.indexOf(p));
					return retornaProcesso;
				}
				else if(menorTamanho.tamanho > p.tamanho)
				{
					menorTamanho = p;
				}
			}
			
			this.filaPronto.remove(this.filaPronto.indexOf(menorTamanho));
			return menorTamanho;
		}
		else
		{
			return null;
		}
	}
	public void ImprimeFila()
	{
		System.out.println("Processo | PID | Chegada | Tamanho | Prioridade");
		for(Processo p : this.filaPronto)
		{
			System.out.println(p.nome + " | " + p.pid  + " | "+ p.chegada + " | " + p.tamanho + " | " + p.prioridade);
		}
	}
}
