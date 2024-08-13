package edu.vmariath.lab.contador;

import edu.vmariath.lab.execptions.ParametrosInvalidosExeception;

public class Contador {

        public static void contar(int primeiroParametro, int segundoParametro) throws  ParametrosInvalidosExeception {
            if (primeiroParametro > segundoParametro) {
                throw new ParametrosInvalidosExeception("O número final precisa ser maior que o inicial");
            }

            int contagem = segundoParametro - primeiroParametro;
            for(int i = 1; i <= contagem; i ++){
                System.out.println("Imprimindo o número: " + i);

            }
        }

    }