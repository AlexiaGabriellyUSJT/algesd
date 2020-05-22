package lista;

public class Main {
	public static void main(String args[])
	   {
	      Lista lista = new Lista();
	      lista.adicionarInicio(7);
	      lista.adicionarInicio(4);
	      lista.adicionarInicio(2);
	      lista.adicionarFim(11);
	      
	      Lista lista2 = new Lista();
	      lista2.adicionarInicio(7);
	      lista2.adicionarInicio(4);
	      lista2.adicionarInicio(2);
	      lista2.adicionarFim(11);

	      System.out.println("Lista no princípio: " + lista);
	      System.out.println("Lista é crescente?  " + lista.crescente());
	      System.out.println("Mínimo elemento da lista:  " + lista.minimo());
	      System.out.println("Mínimo elemento da lista (recursivo):  " + lista.minimoRec(lista.inicio));
	      System.out.println("Lista é igual a Lista2?  " + lista.iguais(lista2));
	      System.out.println("Lista é igual a Lista2 (rec)?  " + lista.iguaisRec(lista2, lista.inicio, lista2.inicio, 1));
	      System.out.println("Removi o primeiro: " + lista.removerInicio());
	      System.out.println("Ponto médio da lista = " + lista.pontoMedio());
	      System.out.println("Lista após removido: " + lista);
	      System.out.println("Removi o último: " + lista.removerFim());
	      System.out.println("O elemento 4 existe na lista? Resposta: " + lista.existe(4));
	      System.out.println("O elemento 76 existe na lista? Resposta: " + lista.existe(76));
	      System.out.println("Lista ainda é igual a Lista2?  " + lista.iguais(lista2));
	      System.out.println("Lista é igual a Lista2 (rec)?  " + lista.iguaisRec(lista2, lista.inicio, lista2.inicio, 1));
	      
	      Lista.pilhaListaLigada();
	      Lista.filaListaLigada();
	      
	      lista.inverter();
	      System.out.println("\nlista invertida: " + lista);
	   }
}
