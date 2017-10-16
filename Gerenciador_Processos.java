package com.br.trabalho_faculdade;

public class Gerenciador_Processos {
	protected String processoNome;
	protected Novo novo = new Novo();
	protected Pronto pronto = new Pronto();
	protected Executando executando = new Executando();
	protected Finalizado finalizado = new Finalizado();
	protected Bloqueado bloqueado = new Bloqueado();
	
	public boolean criaNovo(int pid,String nome,int chegada,int tamanho, String prioridade, boolean interrupcao, boolean svc, boolean execao, boolean geraBloqueio)
	{
		Processo processo = new Processo(pid,nome,chegada,tamanho, prioridade, interrupcao, svc, execao,geraBloqueio);
		return this.novo.enfileirar(processo);
	}
	
	public void novoParaPronto()
	{
		if(this.novo.vazia() != true)
		{
			Processo p = this.novo.desenfileirar();
			this.pronto.enfileirar(p);
			this.ImprimeFilas();
		}
		else
		{
			System.out.println("Não há processos para mover de novo para pronto");
			this.ImprimeFilas();
			//return false;
		}
	}
	
	public void prontoParaExecucao()
	{
		if(this.pronto.vazia() != true)
		{
			if(!this.executando.Cheia())
			{
				Processo processoPronto = this.pronto.remove();
				executando.EnfileiraEmExecucao(processoPronto);
				this.ImprimeFilas();
			}
			else
			{
				System.out.println("Já existe um processo sendo executado");
			}
		}
		else
		{
			System.out.println("Não há processos para mover de pronto para executando");
			this.ImprimeFilas();
		}
		//System.out.println("Executando Processo" + processoPronto.nome + "");
		//System.out.println("Processo deve ir para a fila de:" + e.estadoProcesso);
	}
	
	public void Executar()
	{
		Processo processoExecutado = this.executando.Executar();
		if(this.executando.estadoProcesso == "Finalizado")
		{
			this.finalizado.enfilera(processoExecutado);
			this.ImprimeFilas();
		}
		else if(this.executando.estadoProcesso == "Bloqueado")
		{
			this.bloqueado.enfileira(processoExecutado);
			this.ImprimeFilas();
		}
	}
	
	public void RemoveBloqueado()
	{
		Processo processoBloqueado = this.bloqueado.desenfileirar();
		processoBloqueado.prioridade = "Bloqueado";
		this.pronto.enfileirar(processoBloqueado);
		this.ImprimeFilas();
	}
	public void ImprimeFilas()
	{
		System.out.println("-------Fila de Novo-------");
		this.novo.ImprimeFila();
		System.out.println("-------Fila de Pronto-------");
		this.pronto.ImprimeFila();
		System.out.println("-------Executando-------");
		this.executando.ImprimeFila();
		System.out.println("-------Bloqueados-------");
		this.bloqueado.ImprimeFila();
		System.out.println("-------Finalizados-------");
		this.finalizado.ImprimeFila();
		System.out.println("---------------//---------------");
	}
}
