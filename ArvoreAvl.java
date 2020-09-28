/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avl;

/**
 *
 * @author ferna
 */

class Nodo {
    int valor,quantidade,balanceamento;
    Nodo esquerda,direita;
    
    Nodo(){
        this.valor = 0;
        esquerda = null;
        direita = null;
    }
    
    Nodo(int valor){
        this.valor = valor;
        esquerda = null;
        direita = null;
    }
    
    void adicionar(int novo_valor){
        if (novo_valor > valor){
            if (direita == null){
                direita = new Nodo(novo_valor);
            }
            else{
                direita.adicionar(novo_valor);
            }
            quantidade++;
        }
        else if (novo_valor < valor){
            if (esquerda == null){
                esquerda = new Nodo(novo_valor);
            }
            else{
                esquerda.adicionar(novo_valor);
            }
            quantidade++;
        }
    }
    
    void imprimir(){
        if(direita != null){
            direita.imprimir();
        }
        System.out.println(valor);
        if (esquerda != null){
            esquerda.imprimir();
        }
    }
    
    void buscar (int valor){
        if ((valor > this.valor) && (direita != null)){
            direita.buscar(valor);
        }
        else if ((valor < this.valor) && (esquerda != null)){
            esquerda.buscar(valor);
        }
        else if (valor == this.valor){
            System.out.println(this.toString());
        }
        else{
            System.out.println("Null");
        }
    }
    
    int calcularAltura(){
        if (esquerda == null && direita == null){
            return 1;
        }
        else if (direita != null && esquerda == null){
            return 1 + direita.calcularAltura();
        }
        else if (direita == null && esquerda != null){
            return 1 + esquerda.calcularAltura();
        }
        else{
            return 1 + Math.max(direita.calcularAltura(),esquerda.calcularAltura());
        }
    }
      
    void calcularBalanceamento(){
        if (esquerda == null && direita == null){
            balanceamento = 0;
        }
        else if (esquerda == null && direita != null){
            balanceamento = direita.calcularAltura();
        }
        else if (esquerda != null && direita == null){
            balanceamento =  0 - esquerda.calcularAltura();
        }
        else if (esquerda != null && direita != null){
            balanceamento = direita.calcularAltura() - esquerda.calcularAltura();
        }
        if (direita != null){
            direita.calcularBalanceamento();
        }
        if (esquerda != null){
            esquerda.calcularBalanceamento();
        }
    }
    
    Nodo rotacaoSimplesDireita(){
        Nodo filhoDireito;
        Nodo neto = null;
        
        filhoDireito = direita;
        if (direita != null){
            if (direita.esquerda != null){
                neto = direita.esquerda;
            }
        }
        filhoDireito.esquerda = this;
        this.direita = neto;
        
        return filhoDireito;
    }
    
    Nodo rotacaoDuplaDireita(){
        Nodo atual = this;
        Nodo filhoDireito = direita;
        Nodo neto = filhoDireito.esquerda;
        Nodo nodoInsercao = neto.direita;
        
        filhoDireito.esquerda = nodoInsercao;
        neto.direita = filhoDireito;
        this.direita = neto;
        
        Nodo novo = this.direita;
        atual.direita = null;
        novo.esquerda = atual;
        
        return novo;
    }
    
    Nodo rotacaoSimplesEsquerda(){
        Nodo filhoEsquerdo;
        Nodo neto = null;
        
        filhoEsquerdo = esquerda;
        if (esquerda != null){
            if (esquerda.direita != null){
                neto = esquerda.direita;
            }
        }
        filhoEsquerdo.esquerda = this;
        this.esquerda = neto;
        
        return filhoEsquerdo;
    }
    
    Nodo rotacaoDuplaEsquerda(){
        Nodo atual = this;
        Nodo filhoEsquerdo = esquerda;
        Nodo neto = filhoEsquerdo.direita;
        Nodo nodoInsercao = neto.esquerda;
        
        filhoEsquerdo.direita = nodoInsercao;
        neto.esquerda = filhoEsquerdo;
        this.esquerda = neto;
        
        Nodo novo = this.esquerda;
        atual.esquerda = null;
        novo.direita = atual;
        
        return novo;
    }
    
    Nodo verificarBalanceamento(){
        if (balanceamento >= 2 || balanceamento <= -2){
            if (balanceamento >= 2){
                if ((balanceamento * direita.balanceamento) > 0){
                    System.out.println("Rotação simples a direita");
                    return rotacaoSimplesDireita();
                }
                else {
                    System.out.println("Rotação dupla a direita");
                    return rotacaoDuplaDireita();
                }
            }
            else if ((balanceamento * esquerda.balanceamento) > 0) {
                System.out.println("Rotação simples a esquerda");
                return rotacaoSimplesEsquerda();
            }
            else {
                System.out.println("Rotação dupla a esquerda");
                return rotacaoDuplaEsquerda();
            }
        }
        
        this.calcularBalanceamento();
        if (direita != null){
            direita = direita.verificarBalanceamento();
        }
        if (esquerda != null){
            esquerda = esquerda.verificarBalanceamento();
        }
        return this;
    }
}

public class ArvoreAvl{
    public static void main (String[] args){
        Nodo raiz = new Nodo(10);
        raiz.adicionar(5);
        raiz.adicionar(15);
        raiz.adicionar(20);
        raiz.adicionar(25);
        raiz.imprimir();
        raiz.verificarBalanceamento();
    }
}
