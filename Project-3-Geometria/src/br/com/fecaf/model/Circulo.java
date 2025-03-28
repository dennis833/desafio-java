package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    //isso é um atributo
    public double raio, area, perimetro, diametro;

    /** Instancia o objeto Scanner */
    Scanner scanner = new Scanner(System.in);


    public boolean cadastrarCirculo (){
        System.out.println("/*************************/");
        System.out.println("/*   cadastrar circulo   */");
        System.out.println("/*************************/");
        System.out.println("Informe o raio: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo cadastrado com sucesso!!");
        System.out.println("/******************************/");

        return true;
    }

    public void exibirCirculo (){
        System.out.println("/**** informações do circulo ****/");
        System.out.println("O raio do circulo é: " + raio);
        System.out.println("A area do circulo é: " + area);
        System.out.println("O perimetro do circulo é: " + perimetro);
        System.out.println("O diametro do circulo é: " + diametro);
        System.out.println("/*******************************/");
    }

    public void calcularArea(){
        System.out.println("/*  calculando area  */");

        /** calculo da area
        area = 3.14159 * (raio * raio):
        area = Math.PI * (raio * raio): */
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do círculo é: " + area);
    }

    public void calcularPerimetro (){
        System.out.println("/*  calculando o perimetro  */");

        perimetro = 2 * Math.PI * raio;
        System.out.println("O perimetro do círculo é: " + perimetro);
    }






}
