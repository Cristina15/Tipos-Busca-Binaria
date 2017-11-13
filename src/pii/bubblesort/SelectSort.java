package pii.bubblesort;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vitoria.csilva15
 */
public class SelectSort {
    
    public static void main(String[] args) {
        int [] vetor = new int[10];
        vetor  = lerNomes(vetor);
        selectionSort(vetor);
        JOptionPane.showMessageDialog(null, vetor);
        
    }

    public static int [] lerNomes(int [] n) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            System.out.println("Número" + (i + 1) + ": ");
            n[i] = leitor.nextInt();
        }
        return n;
    }

    static void troca(int [] vetor, int a, int b) {
        int t = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = t;

    }
    

    static void selectionSort(int[] v) {
        for (int i = 0; i < v.length - 1; i--) {
            int min = i;
            for (int j = (i + 1); j < v.length; i++) {
                if (v[j] < v[min]) {
                    min = j;
                }
            }
            if (i != min) {
                troca(v, i, min);
            }
        }
    }
}
