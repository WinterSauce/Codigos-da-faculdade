# Codigos-da-faculdade
Lugar que deixo meus codigos de estudo
import java.io.*;
import java.util.Scanner;
public class Atividade_1 {

    static public void main(String[] args){

        int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a = ");
        a = sc.nextInt();

        System.out.println("Digite o valor de b = ");
        b = sc.nextInt();

        c = a + b;

        System.out.println("Total é: " + c);

        if (a + b > c) {
            System.out.println("O valor " + c + " e maior que a + b.");
        }
        else {
            System.out.println("O valor " + c + " e menor que a + b.");
        }
