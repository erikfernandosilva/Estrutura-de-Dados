/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estrutura_dados;

/**
 *
 * @author ferna
 */

// este arquivo possui uma lista duplamente encadeada,
// então temos os nodos com posicoes anteriores e posteriores
// assim pode se percorrer para os dois lados
// enquanto a lista simples só pode avancar

public class ListaDupla2 extends Lista2{
    void inserir_final (int valor){
        adicionar_no_final (valor);
    }
    
    void inserir_inicio (int valor){
       adicionar_no_inicio (valor);
    }
    
    void inserir_posicao (int valor,int indice){
        add_na_pos (valor,indice);
    }
    
    void delete_final (){
        remover_do_final();
        /* minha visão da tarefa, funcional porem nao mostra anterior e posterior
        int contador = 0;
        if (primeiro_nodo == null){
            System.out.println("Lista2 Vazia");
        }
        else {
            Nodo nodo_temp = primeiro_nodo;
            while (nodo_temp != null){
                contador++;
                nodo_temp = nodo_temp.proximo_nodo;
            }
        }
        remover (contador - 1);
        num_elementos --;
        */
    }
    
    void delete_inicio (){
        remover_do_inicio ();
    }
    
    void remover_posicao (int indice){
        remover (indice);
    }
}
