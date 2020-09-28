/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojson;
import java.io.FileNotFoundException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author ferna
 */

class Pessoa{
    String nome;
    int idade;
    String sexo;
    
    // criacao do construtor
    Pessoa (String nomep, int idadep, String sexop){
        nome = nomep;
        idade = idadep;
        sexo = sexop;
    }
    
    /*void CriarJson (JSONObject obj) throws IOException{
        FileWriter file = new FileWriter("./teste.json");
        file.write(obj.toJSONString());
    }*/
}

public class ProjetoJson {
    public static void main(String[] args) throws IOException {
        
        JSONParser meu_leitor_json = new JSONParser();

        try {
            FileReader meu_arquivo = new FileReader("./baba/meujson.json");
            JSONArray retorno = (JSONArray) meu_leitor_json.parse(meu_arquivo);
            System.out.println("JSON:"+retorno.toString());
            System.out.println("Tamanho do array: "+retorno.size());
            for (int i=0; i<retorno.size(); i++){
                JSONObject cur_obj = (JSONObject) retorno.get(i);
                System.out.println("Nome do "+(i+1)+"o obj: "+cur_obj.get("name"));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found or not parsed!");
        }
    }
    
    public void escrever_arquivo(){
        JSONObject meuJson = new JSONObject();
        meuJson.put("name","Bernardo");
        meuJson.put("idade", 29);
        meuJson.put("sexo","masc");
        JSONObject meuJson2 = new JSONObject();
        meuJson2.put("name","Gabi");
        meuJson2.put("idade", 3);
        meuJson2.put("sexo","fem");
        JSONArray meu_array_de_pessoas = new JSONArray();
        meu_array_de_pessoas.add(meuJson);
        meu_array_de_pessoas.add(meuJson2);
        meu_array_de_pessoas.add(meuJson);
        meu_array_de_pessoas.add(meuJson2);
        meu_array_de_pessoas.add(meuJson);
        meu_array_de_pessoas.add(meuJson2);
        try {
            try (FileWriter meu_escritor = new FileWriter("./babameujson.json")) {
                meu_escritor.write(meu_array_de_pessoas.toJSONString());
            }
            System.out.println("JSON Criado com sucesso");
            // TODO code application logic here
        } catch (IOException ex) {
            System.out.println("JSON não criado. Falha no IO.");
        }
        
       // arraylist de pessoas
       /*ArrayList <Pessoa> lista_pessoas = new ArrayList();
       
       // criando pessoas
       Pessoa erik = new Pessoa ("Erik",25,"Masc");
       Pessoa maria = new Pessoa ("Maria",36,"Fem");
       Pessoa alisen = new Pessoa ("Alisen",19,"SG");
       Pessoa bruno = new Pessoa ("Bruno",24,"Masc");
       Pessoa fabricia = new Pessoa ("Fabricia",45,"Fem");
       
       // adicionando ao arraylist
       lista_pessoas.add(erik);
       lista_pessoas.add(maria);
       lista_pessoas.add(alisen);
       lista_pessoas.add(bruno);
       lista_pessoas.add(fabricia);
       
       // o objeto do json
       JSONObject obj = new JSONObject();
       
       CriarJson(obj);
       for (int i = 0; i < lista_pessoas.size(); i++){
           obj.put(i);
       }*/
    }
}
