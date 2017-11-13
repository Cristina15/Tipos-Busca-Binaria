package pii.bubblesort;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vitoria.csilva15
 */
public class PIIBubbleSORT {

    public static String[] lerNomes(String[] n) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nome " + (i + 1) + ": ");
            n[i] = leitor.next();
        }
        return n;
    }

    static void trocaValores(String[] vetor, int a, int b) {
        String t = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = t;

    }

    static void BubbleSort(String[] vetor) {
//o que diferencia é esse - 1 e -i depois do length
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                //esse compareTo está comparando se o tem o mesmo nome no vetor
                
                if (vetor[j].compareToIgnoreCase(vetor[j + 1]) > 0) {

                    trocaValores(vetor, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] nomes = new String[7];
        nomes = lerNomes(nomes);
        BubbleSort(nomes);
        JOptionPane.showMessageDialog(null, nomes);

    }

}
