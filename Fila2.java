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
public class Fila2 extends Lista2{
    // implementa a estrututa FIRST IN, FIRST OUT
    void add (int val){
        adicionar_no_final (val);
    }
    
    void get (){
        remover_do_inicio();
        
        /*
            codigo mantido a fim de estudos
        Nodo rem = primeiro_nodo;
            if (primeiro_nodo.proximo_nodo == null){
                System.out.println("A lista está vazia agora");
            }
            else{
        	primeiro_nodo = primeiro_nodo.proximo_nodo;
                System.out.println("O primeiro valor agora é: " + primeiro_nodo.valor);
            }*/
    }
}