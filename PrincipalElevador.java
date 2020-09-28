/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividadeelevador;

/**
 *
 * @author ferna
 */
public class PrincipalElevador {
    public static void main (String[] args){
        Elevador tk = new Elevador (4,6);
        Elevador atlas = new Elevador (5);
        tk.subir();
        tk.subir();
        tk.subir();
        tk.subir();
        tk.subir();
        tk.descer();
        tk.descer();
        tk.descer();
        tk.mostrar_andar();
        tk.descer();
        tk.mostrar_andar();
        tk.descer();
        
        atlas.subir();
        atlas.entrar();
        atlas.entrar();
        atlas.entrar();
        atlas.entrar();
        atlas.subir();
        atlas.mostrar_andar();
        atlas.entrar();
    }
}
