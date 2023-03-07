import java.util.Scanner;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        /* Criar Algoritmo de Média de Aluno Simples */
        Scanner read = new Scanner(System.in);
        String nome;
        float n1,n2,media;
       
        System.out.print("Insira Nome do Aluno : ");
        nome = read.nextLine();
        do{
        System.out.print("Insira 1° Nota : ");
        n1 = read.nextFloat();
        System.out.print("Insira 2° Nota : ");
        n2 = read.nextFloat();
        media = (n1+n2) / 2;
        
            if((n1+n2) > 20 || (n1+n2) < 0){
                System.out.println("ERRO! A soma das Notas está maior que o Normal! \n");
                System.out.println("INSIRA NOTAS NOVAMENTE!");
            }else{
                System.out.println("NOTAS ANEXADAS COM SUCESSO! \n");
            }
        }while((n1+n2) > 20 || (n1+n2) < 0);
        
        if(media >= 6){
            System.out.println("APROVADO! \n");
        }else if(media >= 4){
            System.out.println("NÃO ATINGIU A MÉDIA, FAÇA OUTRO EXAME!");
        }else{
            System.out.println("REPROVADO!");
        }

        System.out.println("| Nome : "+nome+" |");
        System.out.println("| 1° Nota : "+n1+" |");
        System.out.println("| 2° Nota : "+n2+" |");
        System.out.println("| Média : "+media+" |");
    }
}
