package algesd;

public class MergeSort {
	public static void mergeSort(int vet[])
    {
       int auxiliar[] = new int[vet.length];
       mergeSort(vet, 0, vet.length-1, auxiliar);  
    }
    
    public  static void mergeSort(int vet[], int inicio, int fim, int auxiliar[])
    {
       if(fim-inicio >= 1)
       {
          int meio = (inicio + fim)/2;
          mergeSort(vet, inicio, meio, auxiliar);
          mergeSort(vet, meio+1, fim, auxiliar);
       }
     }
}