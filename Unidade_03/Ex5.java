package Unidade_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        lerArquivo("arquivo.txt");
    }

    public static void lerArquivo(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado.");
        }
    }
}