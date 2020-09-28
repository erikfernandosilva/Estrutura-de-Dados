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
public class Lista2 {
    int num_elementos;
    Nodo primeiro_nodo;
    Nodo ultimo_nodo;
    Lista2(){
        num_elementos = 0;
        primeiro_nodo = null;
    }
    /* codigo utilizado em aulas anteriores, mantido a fim de estudos
    public void adicionar_no_final (int valor){
        if (primeiro_nodo == null){
            primeiro_nodo = new Nodo (valor);
        }
        else {
            Nodo nodo_temporario = primeiro_nodo;
            while (nodo_temporario.proximo_nodo != null){
                nodo_temporario = nodo_temporario.proximo_nodo;
            }
            nodo_temporario.proximo_nodo = new Nodo (valor);
        }
       System.out.println ("Valor adicionado " + valor);
       num_elementos++;
    }*/
    void adicionar_no_final(int valor){
        Nodo tmp = new Nodo(valor);
        if (primeiro_nodo == null){
            primeiro_nodo = tmp;
            ultimo_nodo = tmp; 
        } else {
            ultimo_nodo.proximo_nodo = tmp;
            tmp.anterior_nodo = ultimo_nodo;
            ultimo_nodo = tmp;
        }
        num_elementos++;
    }
    void adicionar_no_inicio (int valor){
        Nodo tmp = new Nodo(valor);
        if (primeiro_nodo == null){
            primeiro_nodo = tmp;
            ultimo_nodo = tmp;
        } else {
            tmp.proximo_nodo = primeiro_nodo;
            primeiro_nodo.anterior_nodo = tmp;
            primeiro_nodo = tmp;
        }
        num_elementos++;
    }
    public void mostrarlista(){
        if (primeiro_nodo == null){
            System.out.println("Lista Vazia");
        }
        else {
            Nodo nodo_temp = primeiro_nodo;
            while (nodo_temp != null){
                System.out.println(nodo_temp.valor);
                nodo_temp = nodo_temp.proximo_nodo;
            }
        }
    }
    public void quantidade() {
        System.out.println("Numero de elementos: " + num_elementos);
        /* 
        Código mantido apenas para fins de estudo
        
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
        System.out.println("Existem " + contador + " elementos");*/
    }
    public void somatorio(){
        int soma = 0;
        if (primeiro_nodo == null){
            System.out.println("Lista Vazia");
        }
        else {
            Nodo nodo_temp = primeiro_nodo;
            while (nodo_temp != null){
                soma += nodo_temp.valor;
                nodo_temp = nodo_temp.proximo_nodo;
            }
        }
        System.out.println("A soma é: " + soma);
    }
    public void maior_valor (){
        int maximo = 0;
        if (primeiro_nodo == null){
            System.out.println("Lista Vazia");
        }
        else {
            Nodo nodo_temp = primeiro_nodo;
            while (nodo_temp != null){
                if (nodo_temp.valor > maximo){
                    maximo = nodo_temp.valor;
                }
                nodo_temp = nodo_temp.proximo_nodo;
            }
        }
        System.out.println ("O maior valor é: " + maximo);
    }
    void add_na_pos(int val, int pos){
	if (/*pos >= 0 || */primeiro_nodo == null){
	Nodo novo = new Nodo(val);
	novo.proximo_nodo = primeiro_nodo;
	primeiro_nodo = novo;
    }
	Nodo temp = primeiro_nodo;
        int tmp_pos = 1;
        while ((tmp_pos < pos) && (temp.proximo_nodo != null)){
            temp = temp.proximo_nodo;
            tmp_pos ++;
        }
	Nodo novo = new Nodo(val);
	novo.proximo_nodo = temp.proximo_nodo;
	temp.proximo_nodo = novo;
}
    void mostrar_ate (int pos){
	Nodo tmp = primeiro_nodo;
	int tmp_pos = 1;
	while ((tmp_pos < pos) && (tmp.proximo_nodo != null)){
		tmp = tmp.proximo_nodo;
		tmp_pos++;
		System.out.println (tmp.valor);
            }
}
    void remover (int pos){
	if (primeiro_nodo == null || pos == 0){
	System.out.println ("não é possível");
	return;
}
	/* codigo de aulas anteriores, mantido a fim de estudo
        if (pos == 0){
	Nodo rem = primeiro_nodo;
	primeiro_nodo = primeiro_nodo.proximo_nodo;
}       */
	Nodo tmp = primeiro_nodo;
	int tmp_pos = 1;
	while ((tmp_pos < pos) && (tmp != null)){
		tmp = tmp.proximo_nodo;
		tmp_pos ++;
            }
        if (tmp == null)
            return;
        if ((tmp.proximo_nodo != null) && (tmp.anterior_nodo != null)){
            Nodo rem = tmp.proximo_nodo;
            tmp.proximo_nodo = tmp.proximo_nodo.proximo_nodo;
            tmp.anterior_nodo = tmp.anterior_nodo.anterior_nodo;
        }
        num_elementos--;
}
    void remover_do_inicio(){
        /*
        mesmo caso do remover do final, as mudancas foram feitas para o caso
        de exclusao de uma lista com um elemento apenas
        */
        if (primeiro_nodo == null)
            System.out.println("Lista Vazia");
        //int retorno = primeiro_nodo.valor;
        if (primeiro_nodo == ultimo_nodo){
            // ultimo nodo = null;
            /*
            foi necessario realizar mudanca pois no caso de exclusao em lista
            com um unico elemento, apresentava erro. o elemento ainda era exibido
            se selecionado (mostrarlista), sendo que tornou-se uma lista vazia
            */
            primeiro_nodo = null;
            System.out.println("Lista Vazia");}
        else{
        primeiro_nodo = primeiro_nodo.proximo_nodo;
        primeiro_nodo.anterior_nodo = null;
        num_elementos--;
        //return retorno;
        }
    }
    void remover_do_final(){
        /* 
        atribuir o return mostrou erro no caso especial de excluir lista dupla
        que nao possua nenhum item (lista vazia).
        isso e solucionado trocando o metodo para void, ao inves de int.
        todos os outros casos funcionaram bem nesta implementacao de codigo
        */
        if (primeiro_nodo == null)
            System.out.println("Lista vazia");
        //int retorno = ultimo_nodo.valor;
        if (primeiro_nodo == ultimo_nodo){
            primeiro_nodo = null;
            ultimo_nodo = null;
        } else {
            ultimo_nodo = ultimo_nodo.anterior_nodo;
            ultimo_nodo.proximo_nodo = null;
        }
        num_elementos--;
        //return retorno;
    }
    void valorpos (int pos){
        int var = 1;
        Nodo nodo_temp = primeiro_nodo;
        while (var != pos){
            var++;
            nodo_temp = nodo_temp.proximo_nodo;
        }
        if (var == pos){
            int valor = nodo_temp.proximo_nodo.valor;
            System.out.println ("Valor na posição "+ pos + " é " + valor);
        }
    }
    void isEmpty (Lista2 lista){
        if (lista.primeiro_nodo == null){
            System.out.println("Lista Vazia!");
        }
        else{
            System.out.println("Lista não está vazia");
        }
    }
    void clear (Lista2 lista){
        while (lista.primeiro_nodo != null){
            primeiro_nodo = primeiro_nodo.proximo_nodo;
            primeiro_nodo = null;
        }
    }
}


class Nodo{
    int valor;
    Nodo proximo_nodo;
    Nodo anterior_nodo;
    Nodo (){
        valor = 0;
        proximo_nodo = null;
        anterior_nodo = null;
    }
    Nodo (int valorP){
        valor = valorP;
        proximo_nodo = null;
        anterior_nodo = null;
    }
}
