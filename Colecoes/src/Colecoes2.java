import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Colecoes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar grupos masculino e feminino
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.println("Digite os nomes e sexos (formato: nome-sexo), separados por vírgula:");
        String input = scanner.nextLine();

        // Quebra a entrada em um array de strings usando vírgula como delimitador
        String[] entradas = input.split(",");

        // Processa cada entrada
        for (String entrada : entradas) {
            // Quebra cada entrada (nome-sexo) em nome e sexo
            String[] partes = entrada.split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toLowerCase();

                // Verifica se é masculino ou feminino e adiciona ao grupo correspondente
                if (sexo.equals("masculino")) {
                    grupoMasculino.add(nome);
                } else if (sexo.equals("feminino")) {
                    grupoFeminino.add(nome);
                } else {
                    System.out.println("Sexo inválido para o nome: " + nome);
                }
            } else {
                System.out.println("Formato inválido para a entrada: " + entrada);
            }
        }

        // Exibe os grupos
        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }

        // Segunda parte: leitura de nomes separados por vírgulas e ordenação
        System.out.println("\nDigite uma lista de nomes separados por vírgulas para ordenação alfabética:");
        String nomesInput = scanner.nextLine();

        // Quebra a entrada em um array de nomes
        String[] nomesArray = nomesInput.split(",");

        // Converte o array para uma lista para facilitar a ordenação
        List<String> listaNomes = new ArrayList<>();
        for (String nome : nomesArray) {
            listaNomes.add(nome.trim());
        }

        // Ordena a lista em ordem alfabética
        Collections.sort(listaNomes);

        // Exibe a lista ordenada
        System.out.println("\nLista de Nomes em Ordem Alfabética:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }


    }
}
