package algesd;

import java.util.Arrays;

import algesd.MergeSort;

public class Desempenho {
	
	 public static void main(String args[])
     {
        String primeira = "Merge Sort\n";
        String segunda = "Arrays Sort\n";
        long antes, depois;
        
        for(int tamanho=100000; tamanho <= 1000000; tamanho = tamanho + 100000) {
           int vet1[] = new int[tamanho];
       
           for(int i=0; i < tamanho; i++) {
        	   vet1[i] = (int) (Math.random() * 1000); 
           }
           
           antes = System.currentTimeMillis();
           MergeSort.mergeSort(vet1);
           depois = System.currentTimeMillis();
           primeira += "Tamanho: " + tamanho + " Tempo: " + (depois - antes) + " ms\n";
           
           antes = System.currentTimeMillis();
           Arrays.sort(vet1);
           depois = System.currentTimeMillis();
           segunda += "Tamanho: " + tamanho + " Tempo: " + (depois - antes) + " ms\n";

        }

        System.out.println(primeira + segunda);
     }
	
}