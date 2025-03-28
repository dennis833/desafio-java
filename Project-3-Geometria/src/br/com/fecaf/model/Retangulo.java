package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    // isso é um atributo
    public double lado1,lado2, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarRetangulo (){
        System.out.println("/***********************/");
        System.out.println("/* cadastrar retangulo */");
        System.out.println("/***********************/");
        System.out.println("Informe o lado1: ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe o lado2: ");
        lado2 = scanner.nextDouble();
        System.out.println("/***********************/");

        return true;
    }
    public void exibirRetangulo(){
        System.out.println("/*** exibir retangulo  ***/");
        System.out.println("O lado1 é: " + lado1);
        System.out.println("O lado2 é: " + lado2);
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*************************/");
    }

    public void calcularArea(){
        System.out.println("/* calculando area */");
        area = lado1 * lado2;
        System.out.println("A area deste retangulo é: " + area);

    }
    public void calcularPerimetro (){
        System.out.println("/* calculando perimetro */");
        perimetro = 2 * lado1 + 2 * lado2;
        System.out.println("O perimetro deste retangulo é: " + perimetro);
    }
    public boolean validarQuadrado (){

        System.out.println("/* definindo se é um quadrado... */");
        if (lado1 == lado2) {
            System.out.println("Esse objeto é um quadrado...");
            return true;
        }
        return false;
    }


}
