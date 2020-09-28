/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bucketsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ferna
 */

public class BucketSort {
    public static void main(String[] args) {
    Scanner leia = new Scanner (System.in);
   
    // criação do array com o numero de elementos em desordem
    System.out.println("Quantos elementos você quer ordenar?");
    int numero_elementos = leia.nextInt();
    int[] arr = new int [numero_elementos];
    
    // for para adicionar no array
    System.out.println("Insira os números no array");
    for (int i = 0; i < numero_elementos; i++){
        arr[i] = leia.nextInt();
    }
    
    // mostrar eles antes e depois do bucket sort
    System.out.println("Números Originais - " + Arrays.toString(arr));
    bucketSort(arr, numero_elementos);
    System.out.println("Após o bucket sort - " + Arrays.toString(arr));
  }
	
  private static void bucketSort(int[] arr, int bucketSize){
    // criar um array de baldes para guardar as listas
    List<Integer>[] buckets = new List[bucketSize];
    
    // LinkedList com o indice de cada array
    // pois pode haver colisão de hashes
    for(int i = 0; i < bucketSize; i++){
      buckets[i] = new LinkedList<>();
    }
    // calcular o hash e colocar os elementos em seus baldes
    for(int num : arr){
      buckets[hash(num, bucketSize)].add(num);
    }
    // ordernar os baldes
    for(List<Integer> bucket : buckets){
      Collections.sort(bucket);
    }

    int index = 0;
    // unir os baldes para ter um array arrumado
    for(List<Integer> bucket : buckets){
      for(int num : bucket){
        arr[index++] = num;
      }
    }
  }
  
  // função de hash usada para distribuir os numeros
  private static int hash(int num, int bucketSize){
    return num/bucketSize;
  }
}
