package com.br.trabalho_faculdade;

public class ProntoVetor {
	private Processo vet[];	
	private int inicio;
	private int fim;
	public ProntoVetor(int tam)
	{
		vet = new Processo[tam];
		inicio = fim = 0;
	}
	public void enfileirar(Processo p) 
	{
		vet[fim] = p;
		fim = (fim + 1) % vet.length;
	}
	public Processo desenfileirar() {
		Processo item;
		item = vet[inicio];
		inicio = (inicio + 1) % vet.length;
		return item;
	}
	public boolean vazia() 
	{
		return inicio == fim;
	}
	public boolean cheia() 
	{
		return ((fim + 1) % vet.length) == inicio;
	}
	public void imprime()
	{
		for(int i = 0;i < this.fim; i++)
		{
			System.out.println(this.vet[i].nome);
		}
	}
}
