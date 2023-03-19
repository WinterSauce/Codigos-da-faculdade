import java.io.*;
import java.util.Scanner;
public class Atividade_3 {

    static public void main(String[] args){

        int n1,n2,c = 0;
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        n2 = sc.nextInt();
        
        if (n2 == n1) {
            System.out.println(c = n1 + n2);
            
            
        } else {
            System.out.println(c = n1 * n2);
        }

    }
}
