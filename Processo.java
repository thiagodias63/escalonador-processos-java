package com.br.trabalho_faculdade;

public class Processo
{
	protected int pid;
	protected String nome;
	protected int tamanho; //duração do processo
	/* @var prioridade (normal, baixa, alta) */
	protected int chegada;
	protected String prioridade;
	protected boolean interrupcao = false;
	protected boolean svc = false;
	protected boolean excecao = false;
	/* @var turnaroud em segundos */
	protected int turnaroud =0;
	/* @var overhead em segundos */
	protected int overhead = 0;
	public Processo(int pid,String nome,int chegada,int tamanho, String prioridade)
	{
		this.pid = pid;
		this.nome = nome;
		this.prioridade = prioridade;
		this.tamanho = tamanho;
		this.chegada = chegada;
	}
}
