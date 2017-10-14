package com.br.trabalho_faculdade;

public class Gerenciador_Processos {
	String processoNome;
	Novo novo = new Novo();
	Pronto pronto = new Pronto();
	public boolean criaNovo(int pid,String nome,int chegada,int tamanho,String prioridade)
	{
		Processo processo = new Processo(pid, nome, chegada, tamanho, prioridade);
		return this.novo.enfileirar(processo);
	}
	public boolean novoParaPronto()
	{
		if(this.novo.vazia() != true)
		{
			Processo p = this.novo.desenfileirar();
			this.pronto.enfileirar(p);
			this.pronto.ordernar(p);
			this.ImprimeFilas();
			return true;
		}
		else
		{
			System.out.println("Não há processos para mover de novo para pronto");
			this.ImprimeFilas();
			return false;
		}
	}
	public void ImprimeFilas()
	{
		System.out.println("-------Fila de Novo-------");
		this.novo.ImprimeFila();
		System.out.println("-------Fila de Pronto-------");
		this.pronto.ImprimeFila();
	}
	public void NovoVazio()
	{
		if(this.novo.vazia() == true)
		{
			System.out.println("Fila de Novo Vazia");
		}
		else
		{
			System.out.println("Fila de Novo Não está vazia");
		}
	}
}

/*
 * Ideia de Arraylist de novo para pronto
 * //Processo primeiroProcesso = this.novo.retornaPrimeiro();
		//System.out.println("Ultimo Processo:" + primeiroProcesso.nome);
		//this.novo.desenfileirar();
 * */
