import java.io.*;
import java.util.Scanner;
public class Atividade_5 {
    static public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int valor = 0;


        System.out.println("Digite um valor: ");
        valor = sc.nextInt();

        int quadrado = (int) Math.pow(valor,2);
        int cubo = (int) Math.pow(valor,3);


        if (valor > 0){
            System.out.println(valor = quadrado);
        } else{
            System.out.println(valor = cubo);
        }







    }
}
