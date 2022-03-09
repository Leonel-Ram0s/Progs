import java.util.Scanner;

    public class Exercicio1 {
     public static void main(String args[]) {
      Scanner ler = new Scanner (System.in);
    
     System.out.println("informe um número:");

     System.out.println("Informe um outro Número:");

     int numero1 = ler.nextInt();

     int numero2 = ler.nextInt();

     int soma = numero1 + numero2;
     int sub = numero1 - numero2;
     int multi = numero1 * numero2;
     int div = numero1/numero2;

     System.out.println("A Soma dos dois numeros:" + soma);
     System.out.println("A subtracao dos dois numeros" + sub);
     System.out.println("A multiplicacao dos dois numeros" + multi);
     System.out.println("A divisao dos dois numeros" + div);

    
    }
    
}