package leituraarq3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import meuPacote.Regpro;

public class Leituraarq3 {
	public static void main(String[] args) {
		// Especifique o caminho para o arquivo de texto
		String caminhoArquivo = "C:\\Users\\PC 1\\Downloads/Produto.txt";
		ArrayList<Regpro> listaDeProdutos = new ArrayList<>();
		int codigo = 0;
		String nome;
		String valors;
		double valor = 0;
		int qtd = 0;
		int categoria = 0;
		double total = 0;
		int qtd1 = 0;

		try {
			// Crie um objeto File para representar o arquivo
			File arquivo = new File(caminhoArquivo);
			// Crie um objeto Scanner para ler o conteúdo do arquivo
			Scanner leitor = new Scanner(arquivo);
			Scanner leia = new Scanner(System.in);
			// Use um loop para ler e imprimir cada linha do arquivo
			while (leitor.hasNextLine()) {
				String linha = leitor.nextLine();
				codigo = Integer.parseInt(linha.substring(0, 2));
				nome = linha.substring(3, 34);
				valors = linha.substring(36, 41);
				valor = Double.parseDouble(valors);
				valor = valor / 100;
				qtd = Integer.parseInt(linha.substring(43, 45));
				categoria = Integer.parseInt(linha.substring(46, 47));
				listaDeProdutos.add(new Regpro(codigo, nome, valor, qtd, categoria));
				System.out.println(codigo + " - " + nome + " - " + valor + " - " + qtd + " - " + categoria);

				total = total + (valor * qtd);
			}
			System.out.println();
			System.out.println("O total foi: " + total);
			// Feche o Scanner após a leitura do arquivo
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + caminhoArquivo);
		}
		for (Regpro produto : listaDeProdutos) {
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQtd());
			System.out.println("Categoria: " + produto.getCategoria());
			System.out.println();
		}
	}
}
