import java.io.*;
import java.util.Scanner;
public class Atividade_2 {

    static public void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um valor: ");
        numero = sc.nextInt();

        if (numero % 2 == 0){

            System.out.println("O valor " + numero + " e um valor par.");
        } else {

            System.out.println("O valor " + numero + " e um valor impar.");
        }





    }
}
