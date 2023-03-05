package entities;

public class ArvoreBinaria {
private BIntNo raiz;
	
	//metodo inserir
	private BIntNo inserir(BIntNo arvore, double novoValor) {
		if (arvore == null) {
			return new BIntNo(novoValor);
		} else {
			if (novoValor < arvore.valor) {
				arvore.esq = inserir (arvore.esq, novoValor);
			} else {
				arvore.dir = inserir (arvore.dir, novoValor);
			}
		}
		return arvore;
	}
	
	public void inserirNo(double novoValor) {
		raiz = inserir (raiz, novoValor);
	}
	
	//metodo exibir
	private void exibirEsquerdo(BIntNo arv) {
		if (arv != null) {
			exibirEsquerdo(arv.esq);
			System.out.print(arv.valor + " ");
		}
	}
	
	public void exibirNoEsq() {
		exibirEsquerdo(raiz);
	}
	
	private void exibirDireito(BIntNo arv) {
		if (arv != null) {
			exibirDireito(arv.dir);
			System.out.print(arv.valor + " ");
		}
	}
	
	public void exibirNoDireito() {
		exibirDireito(raiz);
	}
	
	public void exibirRaiz() {
		System.out.println("\nRaiz: " + raiz.valor);
	}
	
	private void buscarNo(BIntNo arv, double valorBuscado) {
		if (arv != null) {
			if (valorBuscado == arv.valor) {
				System.out.println("Item encontrado");
			} else if (valorBuscado < arv.valor) {
				buscarNo(arv.esq, valorBuscado);
			} else if (valorBuscado > arv.valor) {
				buscarNo(arv.dir, valorBuscado);
			}
		} else {
			System.out.println("Item não localizado");
		}
	}
	
	public void buscarValor(double valor) {
		buscarNo(raiz, valor);
	}
}
