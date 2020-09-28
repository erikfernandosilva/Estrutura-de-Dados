/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividadeelevador;

import java.util.Random;

/**
 *
 * @author ferna
 */
public class Elevador {
    private int andar_atual = 0;
    private int andares;
    private int qt_pessoas = 0;
    private int cap_maxima = 4;
    
    Elevador(int qt_andares, int cap_elevador){
        andares = qt_andares;
        cap_maxima = cap_elevador;
    }
    
    Elevador(int qt_andares){
        andares = qt_andares;
    }

void quebrar(){
    Random aleatorio = new Random();
    int aux = aleatorio.nextInt(10);
    if (aux == 10){
        System.out.println("ALARME!");
    }
}   
    
int entrar (){
    if (qt_pessoas + 1 > cap_maxima){
        System.out.println ("Capacidade máxima, proibida entrada");
    }
    else{
        qt_pessoas ++;
    }
    return qt_pessoas;
}

int sair (){
    if (qt_pessoas == 0){
        System.out.println ("Não há ninguém no elevador!");
    }
    else{
        qt_pessoas --;
    }
    return qt_pessoas;
}

int subir(){
    quebrar();
    if (andar_atual + 1 > andares){
        System.out.println ("Já está na cobertura!");
    }
    else{
        andar_atual ++;
    }
    return andar_atual;
}

int descer(){
    quebrar();
    if (andar_atual - 1 < 0){
        System.out.println ("Já está no térreo");
    }
    else{
        andar_atual --;
    }
    return andar_atual;
}

void mostrar_andar(){
    if (andar_atual == 0){
        System.out.println ("Andar: T");
    }
    else{
        System.out.println ("Está no " + andar_atual + "° andar");
    }
}

}
