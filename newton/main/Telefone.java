package br.com.newton.main;
import br.com.newton.agenda.Contato;

import java.util.Scanner;
public class Telefone {


        public static void main(String[] args) {
            int Telefone;
            String nome;
            Scanner ler = new Scanner(System.in);
            System.out.println("Informe o nome do contato: ");
            nome = ler.next();
            System.out.println("Informe o numero de telefone: ");
            Telefone = ler.nextInt();
            if (Telefone != 9) {
                System.out.println("Numero invalido: ");
                Telefone = ler.nextInt();
            } else if (Telefone < 9 && Telefone > 9) {
                System.out.println("numero correto: ");

            } else {

            }
        }
    }


