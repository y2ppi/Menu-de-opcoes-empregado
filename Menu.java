import java.util.*;

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcoes;
        double salario, percentualImposto, salarioFinal;

        do{

        System.out.println("\n=== Menu de opções===\n");
        System.out.println("\n==Insira o número para consultar o desejado==\n");
        System.out.println("1. Imposto\n");
        System.out.println("2. Novo Salario\n");
        System.out.println("3. Classificação\n");
        System.out.println("4. Finalizar o programa\n");
        opcoes = sc.nextInt();


        switch (opcoes) {
            case 1:
            System.out.println("Insira seu salário: ");
            salario = sc.nextDouble();
                if(salario < 1000){
                    percentualImposto = (salario*5)/100;
                    salarioFinal = (salario - percentualImposto);

                    System.out.printf("O seu salário com o imposto é: %.2f", salarioFinal);

                } if (salario > 1000 && salario < 3000){
                    percentualImposto = (salario*10)/100;
                    salarioFinal = (salario - percentualImposto);

                    System.out.printf("O seu salário com o imposto é: %.2f", salarioFinal);

                } if (salario > 3000){
                    percentualImposto = (salario*15)/100;
                    salarioFinal = (salario - percentualImposto);

                    System.out.printf("O seu salário com o imposto é: %.2f", salarioFinal);

                }
                break;

            case 2:
            System.out.println("Insira seu salário: ");
            salario = sc.nextDouble();
                if(salario > 4500){
                    salarioFinal = salario + 45;
                    System.out.println("Seu novo salário: " + salarioFinal);
                } if(salario > 2250 && salario <= 4500){
                    salarioFinal = salario + 150;
                    System.out.println("Seu novo salário é: " + salarioFinal);
                } if(salario > 1350 && salario <= 2249.99){
                    salarioFinal = salario + 225;
                    System.out.println("Seu novo salário é: " + salarioFinal);
                } if(salario < 1350){
                    salarioFinal = salario + 300;
                    System.out.println("Seu novo salário é: " + salarioFinal);
                }
                break;
            
            case 3:
            System.out.println("Insira seu salário: ");
            salario = sc.nextDouble();
                if(salario <= 1500){
                    System.out.println("Classificação: Mal remunerado.");
                }else {
                    System.out.println("Bem remunerado");
                }
                break;

            case 4:
            System.out.println("Programa finalizado.");
            break;
        
            default:
            System.out.println("Opção inválida. Tente novamente.");
                break;
        
        }
    } while (opcoes != 4);

    sc.close();
    } 
}