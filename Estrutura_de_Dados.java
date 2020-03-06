/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_de_dados;

/**
 *
 * @author IFFarroupilha
 */
public class Estrutura_de_Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista minha_lista = new Lista();
        minha_lista.adicionar_no_final (5);
        minha_lista.adicionar_no_final (10);
        minha_lista.adicionar_no_final (15);
        minha_lista.adicionar_no_final (20);
        minha_lista.adicionar_no_final (25);
        minha_lista.adicionar_no_final (30);
        minha_lista.adicionar_no_final (35);
        minha_lista.adicionar_no_final (40);
        minha_lista.adicionar_no_final (45);
        minha_lista.adicionar_no_final (50);
        minha_lista.mostrarlista();
        minha_lista.quantidade();
        minha_lista.somatorio();
        minha_lista.maior_valor();
    }
    
}
