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
public class Lista {
    Nodo primeiro_nodo;
    Lista(){
        primeiro_nodo = null;
    }
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
        int contador = 0;
        if (primeiro_nodo == null){
            System.out.println("Lista Vazia");
        }
        else {
            Nodo nodo_temp = primeiro_nodo;
            while (nodo_temp != null){
                contador++;
                nodo_temp = nodo_temp.proximo_nodo;
            }
        }
        System.out.println("Existem " + contador + " elementos");
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
}

class Nodo{
    int valor;
    Nodo proximo_nodo;
    Nodo (){
        valor = 0;
        proximo_nodo = null;
    }
    Nodo (int valorP){
        valor = valorP;
        proximo_nodo = null;
    }
}
