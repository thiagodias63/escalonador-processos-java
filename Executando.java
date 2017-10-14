package com.br.trabalho_faculdade;

public class Executando 
{
	protected String estadoProcesso;
	public Executando(Processo p)
	{
		p.turnaroud += p.tamanho;
		if(p.geraBloqueio == true)
		{
			this.estadoProcesso = "Bloqueado";
		}
		else if(p.interrupcao == true || p.excecao == true || p.svc == true)
		{
			p.turnaroud -= p.tamanho;
			this.estadoProcesso = "Finalizado";
		}
		else
		{
			this.estadoProcesso = "Finalizado";
		}
	}
}
