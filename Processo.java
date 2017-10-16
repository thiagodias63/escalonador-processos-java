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
	protected boolean geraBloqueio = false;
	public Processo(int pid,String nome,int chegada,int tamanho, String prioridade, boolean interrupcao, boolean svc, boolean execao, boolean geraBloqueio)
	{
		this.pid = pid;
		this.nome = nome;
		this.prioridade = prioridade;
		this.tamanho = tamanho;
		this.chegada = chegada;
		this.interrupcao = interrupcao;
		this.svc = svc;
		this.excecao = execao;
		this.geraBloqueio = geraBloqueio;
	}
	/* @var turnaroud em segundos */
	//protected int turnaroud =0; -- Não é necessario implementar
	/* @var overhead em segundos */ 
	//protected int overhead = 0; -- Não é necessario implementar
}
