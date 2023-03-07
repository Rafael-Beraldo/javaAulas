
import java.util.Scanner;
public class Exercicio1{
    public static void main(String[] args) throws Exception{
        Scanner read = new Scanner(System.in);
        int idade;
        System.out.print("Informe Sua Idade : ");
        idade = read.nextInt();
        if(idade >= 18){
            System.out.println("Pode tirar CNH");
        } else{
            System.out.println("NÃO Pode tirar CNH");
        }
    }
}