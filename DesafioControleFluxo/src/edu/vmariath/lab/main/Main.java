package edu.vmariath.lab.main;

import edu.vmariath.lab.execptions.ParametrosInvalidosExeception;

import java.util.Scanner;

import static edu.vmariath.lab.contador.Contador.contar;

public class Main {
    public static void main(String[] args) {

            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro: " );
            int primeiroParametro = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int segundoParametro = terminal.nextInt();

            try {
                contar(primeiroParametro, segundoParametro);

            }catch (ParametrosInvalidosExeception exception) {
                System.out.println(exception.getMessage());
            }

        }
}