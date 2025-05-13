//

package com.mycompany.leetspeaktranslator;

import java.util.HashMap;
import java.util.Scanner;

public class LeetSpeakTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mapeamento de letras para leet speak
        HashMap<Character, String> leetMap = new HashMap<>();
        leetMap.put('A', "4");
        leetMap.put('B', "8");
        leetMap.put('C', "[");
        leetMap.put('D', "|)");
        leetMap.put('E', "3");
        leetMap.put('G', "6");
        leetMap.put('H', "#");
        leetMap.put('I', "1");
        leetMap.put('K', "|<");
        leetMap.put('L', "1");
        leetMap.put('N', "|/|");
        leetMap.put('O', "0");
        leetMap.put('P', "|*");
        leetMap.put('R', "|2");
        leetMap.put('S', "5");
        leetMap.put('T', "7");
        leetMap.put('U', "(_)");
        leetMap.put('W', "|/|");
        leetMap.put('X', "><");
        leetMap.put('Z', "2");
        
        // Solicita o texto
        System.out.print("Digite o texto para converter em leet speak: ");
        String texto = scanner.nextLine().toUpperCase();
        
        // Converte para leet speak
        StringBuilder textoLeet = new StringBuilder();
        for (char c : texto.toCharArray()) {
            // Substitui se o caractere está no mapeamento, caso contrário mantém o original
            textoLeet.append(leetMap.getOrDefault(c, String.valueOf(c)));
        }
        
        // Exibe o resultado
        System.out.println("Texto em leet speak: " + textoLeet);
        
        scanner.close();
    }
}