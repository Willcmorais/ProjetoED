package meuPacote;

import meuPacote.Regpro;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class GravarProd {
	public static void main(String[] args) {
		// Crie um ArrayList para armazenar objetos Regpro
		ArrayList<Regpro> listaDeProdutos = new ArrayList<>();
		// Adicione objetos Regpro à lista
		listaDeProdutos.add(new Regpro(1, "Produto A", 10.99, 100,1));
		listaDeProdutos.add(new Regpro(2, "Produto B", 5.99, 50,3));
		listaDeProdutos.add(new Regpro(3, "Produto C", 7.49, 75,1));

		// Acesse os objetos na lista
		for (Regpro produto : listaDeProdutos) {
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQtd());
			System.out.println();
		}
	}
}
