// 

package com.mycompany.digitoverificador;

import java.util.Scanner;

public class DigitoVerificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite um código de cinco algarismos (00000 a 99999): ");
        
        try {
            int codigo = scanner.nextInt();
            
            if (codigo < 0 || codigo > 99999) {
                System.out.println("Erro: O código deve ser um número de cinco algarismos (00000 a 99999).");
                scanner.close();
                return;
            }
            
            int e = codigo % 10;
            int d = (codigo / 10) % 10;
            int c = (codigo / 100) % 10;
            int b = (codigo / 1000) % 10;
            int a = (codigo / 10000) % 10;
            
            int s = 6 * a + 5 * b + 4 * c + 3 * d + 2 * e;
            
            int digitoV = s % 7;
            
            System.out.printf("Código: %05d%n", codigo);
            System.out.println("Dígito verificador: " + digitoV);
            
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
        }
        
        scanner.close();
    }
}