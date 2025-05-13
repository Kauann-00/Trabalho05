// string

package com.mycompany.jogopalavraembaralhada;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JogoPalavraEmbaralhada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        String[] palavras = {
            "JAVA", "PROGRAMA", "COMPUTADOR", "ALGORITMO", 
            "DESENVOLVIMENTO", "CODIGO", "SISTEMA"
        };
        
        String palavraCorreta = palavras[random.nextInt(palavras.length)];
        
        
        String palavraEmbaralhada = embaralharPalavra(palavraCorreta);
        
        
        int tentativasMaximas = 6;
        int tentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-vindo ao Jogo da Palavra Embaralhada!");
        System.out.println("A palavra embaralhada é: " + palavraEmbaralhada);
        System.out.println("Você tem " + tentativasMaximas + " tentativas para adivinhar a palavra.");
        
       
        while (tentativas < tentativasMaximas && !acertou) {
            System.out.print("Tentativa " + (tentativas + 1) + ": Digite sua palavra: ");
            String tentativa = scanner.nextLine().trim().toUpperCase();
            tentativas++;
            
            if (tentativa.equals(palavraCorreta)) {
                acertou = true;
            } else {
                int tentativasRestantes = tentativasMaximas - tentativas;
                System.out.println("Palavra incorreta! Tentativas restantes: " + tentativasRestantes);
            }
        }
        
     
        System.out.println("\nFim do jogo!");
        System.out.println("A palavra correta era: " + palavraCorreta);
        if (acertou) {
            System.out.println("Parabéns, você ganhou em " + tentativas + " tentativa(s)!");
        } else {
            System.out.println("Você perdeu! Não conseguiu adivinhar a palavra.");
        }
        
        scanner.close();
    }
    
    // Método para embaralhar as letras de uma palavra
    private static String embaralharPalavra(String palavra) {
        List<String> letras = Arrays.asList(palavra.split(""));
        Collections.shuffle(letras);
        return String.join("", letras);
    }
}
