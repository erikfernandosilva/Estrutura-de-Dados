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
public class Pilha2 extends Lista2{
    // implementa estrutura em LAST IN, FIRST OUT
    void empilhar (int val){
        adicionar_no_final (val);
    }
    
    void desempilhar (){
        remover_do_final();
        
        /* codigo mantido a fim de estudos
        
        Nodo apagar = new Nodo();
        Nodo temporario = primeiro_nodo;
            while (temporario.proximo_nodo != null){
               temporario = temporario.proximo_nodo;
            }
            if (temporario.proximo_nodo == null){
                apagar = temporario.proximo_nodo;
            }*/
    }
}
