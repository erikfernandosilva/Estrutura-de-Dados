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
public class Estrutura_Dados2 {
    public static void main(String[] args) {
        // teste da lista
        /*Lista minha_lista = new Lista();
        Lista teste = new Lista();
        // colocando no final
        minha_lista.adicionar_no_final (5);
        minha_lista.adicionar_no_final (10);
        minha_lista.adicionar_no_final (15);
        minha_lista.adicionar_no_final (20);
        minha_lista.adicionar_no_final (25);
        minha_lista.adicionar_no_final (30);
        
        // colocando no inicio
        minha_lista.adicionar_no_inicio(65);
        minha_lista.adicionar_no_inicio(90);
        
        // mostrar a lista completa
        minha_lista.mostrarlista();
        
        // numero de itens
        minha_lista.quantidade();
        minha_lista.somatorio();
        minha_lista.maior_valor();
        minha_lista.mostrar_ate(2);
        minha_lista.add_na_pos(1000, 3);
        System.out.println(" ");
        minha_lista.mostrarlista();
        minha_lista.remover_do_inicio();
        minha_lista.remover_do_final();
        System.out.println(" ");
        minha_lista.mostrarlista();
        minha_lista.valorpos (5);
        
        minha_lista.isEmpty(minha_lista);
        teste.isEmpty(teste);
        minha_lista.clear(minha_lista);
        minha_lista.isEmpty(minha_lista);*/
        
        // teste da fila
        System.out.println(" agora é a fila FIFO");
        
        Fila2 filamento = new Fila2();
        filamento.add(1);
        filamento.add(2);
        filamento.add(3);
        filamento.add(5);
        filamento.add(7);
        filamento.add(11);
        filamento.add(13);
        filamento.add(17);
        filamento.mostrarlista();
        filamento.get();
        filamento.get();
        filamento.get();
        System.out.println(" ");
        filamento.mostrarlista();
        System.out.println(" ");
        filamento.get();
        filamento.get();
        filamento.get();
        filamento.mostrarlista();
        
        System.out.println(" ");
        System.out.println(" agora é a pilha LIFO");
        // teste da pilha
        Pilha2 pratos = new Pilha2 ();
        pratos.empilhar(25);
        pratos.empilhar(12);
        pratos.empilhar(36);
        pratos.empilhar(67);
        pratos.empilhar(100);
        pratos.mostrarlista();
        pratos.desempilhar();
        pratos.desempilhar();
        System.out.println(" ");
        pratos.mostrarlista();
        
        /*ListaDupla dois = new ListaDupla();
        ListaDupla tres = new ListaDupla();
        ListaDupla quatro = new ListaDupla();
        // inserir final - multiplos itens
        dois.inserir_final(9);
        dois.inserir_final(7);
        dois.inserir_final(5);
        dois.mostrarlista();
        System.out.println(" ");
        
        //inserir final - unico item
        tres.inserir_final(23);
        tres.mostrarlista();
        System.out.println(" ");
        
        //inserir inicio - unico item
        quatro.inserir_inicio(46);
        quatro.mostrarlista();
        System.out.println(" ");
        
        // inserir inicio - lista existente
        dois.inserir_inicio(11);
        dois.mostrarlista();
        System.out.println(" ");
        
        // inserir inicio - comando duplo
        tres.inserir_inicio(100);
        tres.inserir_inicio(3);
        tres.mostrarlista();
        System.out.println(" ");
        
        // remover final - lista elemento unico
        quatro.mostrarlista();
        quatro.delete_final();
        quatro.mostrarlista();
        System.out.println(" ");
        
        // remover final - multiplos valores
        dois.mostrarlista();
        System.out.println(" ");
        dois.delete_final();
        dois.mostrarlista();
        System.out.println(" ");
        
        //remover final - comando duplo
        tres.mostrarlista();
        System.out.println(" ");
        tres.delete_final();
        tres.delete_final();
        tres.mostrarlista();
        System.out.println(" ");
        
        // remover final - lista vazia
        quatro.mostrarlista();
        quatro.delete_final();
        System.out.println(" ");
        
        // visualizacao das listas
        System.out.println("dois:");
        dois.mostrarlista();
        System.out.println(" ");
        System.out.println("tres:");
        tres.mostrarlista();
        System.out.println("");
        System.out.println("quatro:");
        quatro.mostrarlista();
        System.out.println("");
        
        // remover inicio - lista unica
        tres.mostrarlista();
        tres.delete_inicio();
        System.out.println(" ");
        
        // remover inicio - comando duplo
        dois.delete_inicio();
        dois.delete_inicio();
        dois.mostrarlista();
        System.out.println(" ");
        
        // remover inicio - lista vazia
        quatro.delete_inicio();
        quatro.mostrarlista();
        
        // adicionando mais itens nas listas
        dois.adicionar_no_final(50);
        dois.adicionar_no_final(29);
        
        // remover posicao
        dois.mostrarlista();
        System.out.println(" ");
        dois.remover_posicao(2);
        dois.mostrarlista();*/
        
    }
}
