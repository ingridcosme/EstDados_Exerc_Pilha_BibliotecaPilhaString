package br.edu.fateczl.ingridcosme.pilhastring;

public class Pilha {
	No topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(String e) {
		No elemento = new No();
		elemento.dado = e;
		
		if(isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	public String pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("N?o h? elemetos para desempilhar");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public String top() throws Exception {
		if(isEmpty()) {
			throw new Exception("N?o h? elementos na pilha");
		}
		String valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}
	
	
	
}
