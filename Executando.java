package com.br.trabalho_faculdade;

public class Executando 
{
	protected String estadoProcesso;
	protected Processo[] emExecucao = new Processo[1];
	public boolean EnfileiraEmExecucao(Processo p)
	{
		if(this.Cheia() == true)
		{
			//System.out.println("Já existe um processo sendo executado");
			return false;
		}
		else
		{
			this.emExecucao[0] = p;
			return true;
		}
		
	}
	public boolean Cheia()
	{
		if(this.emExecucao[0] == null)
			return false;
		else
			return true;
	}
	public Processo Executar()
	{
		//p.turnaroud += p.tamanho;
		if(this.emExecucao[0].interrupcao == true || this.emExecucao[0].geraBloqueio == true)
		{
			this.estadoProcesso = "Bloqueado";
		}
		else if(this.emExecucao[0].excecao == true || this.emExecucao[0].svc == true)
		{
			//p.turnaroud -= p.tamanho;
			this.estadoProcesso = "Finalizado";
		}
		else
		{
			this.estadoProcesso = "Finalizado";
		}
		Processo processoExecutado = this.emExecucao[0];
		this.Remove();
		return processoExecutado;
	}
	public boolean Remove()
	{
		if(!this.Cheia())
		{
			return false;
		}
		else
		{
			this.emExecucao[0] = null; 
			return true;
		}
	}
	public void ImprimeFila()
	{
		System.out.println("Processo | PID | Chegada | Tamanho | Prioridade | Interrupção? | SVC? | Exeção? | Gera Bloqueio?");
		if(this.Cheia() == true)
		{
			System.out.println(this.emExecucao[0].nome + " | " + this.emExecucao[0].pid  + " | "+ this.emExecucao[0].chegada + " | " + this.emExecucao[0].tamanho + " | " + this.emExecucao[0].prioridade + " | " + this.emExecucao[0].interrupcao + " | " + this.emExecucao[0].svc + " | " + this.emExecucao[0].excecao + " | " + this.emExecucao[0].geraBloqueio);
		}
	}
}
