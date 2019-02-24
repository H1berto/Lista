/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author humbe
 */

import java.util.Scanner;

public class Lista {

   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cont = 0, inicio, tamanho = 100, elemento, quant_elementos = 0, troca, posa = 0, posp = 1;

        String opc = "s";
        

        int lista[] = new int[tamanho];

        do {
            
            System.out.print("Digite o elemento da lista: ");

            elemento = entrada.nextInt();

            quant_elementos++;

            lista[cont] = elemento;

            cont++;

            if (quant_elementos >= tamanho) {

                System.out.println("Lista Cheia!");

            }
            

            System.out.print("digite a opção:");

            opc = entrada.next();

        } while ("s".equals(opc));
        



        for (posp = 0; posp < quant_elementos; posp++) {

            for (posa = 0; posa < quant_elementos; posa++) {

                if (lista[posa] > lista[posp]) {

                    troca = lista[posp];

                    lista[posp] = lista[posa];

                    lista[posa] = troca;

                }

            }
            

        }

        System.out.println("Quantidade de elementos:" + quant_elementos);

        for (cont = 0; cont < quant_elementos; cont++) {

            System.out.println("Posição: " + cont + " - Elemento: " + lista[cont]);

        }
        

        System.out.print("Qual elemento deseja retirar da Lista: ");

        elemento = entrada.nextInt();

        posa = 0;
        int trocou=0;
        for (posp = 1; posp <= quant_elementos; posp++) {

            if (lista[posa] == elemento) {

                lista[posa] = lista[posp];
                trocou=1;
                
            }else if(trocou==1){
                lista[posa] = lista[posp];
            }
               
            

            posa++;

        }
        
        quant_elementos--;

        System.out.println("Quantidade de elementos:" + quant_elementos);

        for (cont = 0; cont < quant_elementos; cont++) {

            System.out.println("Posição: " + cont + " - Elemento: " + lista[cont]);

        }

    }

    
}