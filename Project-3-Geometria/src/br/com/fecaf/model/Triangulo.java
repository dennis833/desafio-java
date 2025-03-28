package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, altura, lado2, lado3, area, perimetro;
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/**************************/");
        System.out.println("/*  Cadastrando Triangulo */");
        System.out.println("/**************************/");
        System.out.println("/* Informe a base:        */");
        base = scanner.nextDouble();
        System.out.println("/* Informe o lado2:       */");
        lado2 = scanner.nextDouble();
        System.out.println("/* Informe o lado3        */");
        lado3 = scanner.nextDouble();
        System.out.println("/* Informe a altura:      */");
        altura = scanner.nextDouble();
        System.out.println("/**************************/");

        return true;
    }

    public void calcularArea() {
        System.out.println("/*****************************/");
        System.out.println("/*     Calculando a area     */");
        System.out.println("/*****************************/");

        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("/******************************/");
    }

    public void calcularPerimetro() {
        System.out.println("/******************************/");
        System.out.println("/*   Calculando o perímetro   */");
        System.out.println("/******************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perímetro é: " + perimetro);
        System.out.println("/******************************/");
    }

    public void definirTipo() {
        System.out.println("/******************************/");
        System.out.println("/*   Definindo o Triângulo    */");
        System.out.println("/******************************/");

        if (base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é Equilátero...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triângulo é Escaleno...");
        } else if (base * base + lado2 * lado2 == lado3 * lado3 || base * base + lado3 * lado3 == lado2 * lado2
                || lado2 * lado2 + lado3 * lado3 == base * base) {
            System.out.println("Esse triângulo é Retângulo...");
        } else {
            System.out.println("Esse triângulo é Isósceles...");
        }
    }

    /** Verifica se um número é múltiplo de outro */
    public boolean verificaMultiplo(double numero, double divisor) {
        return numero % divisor == 0;
    }

    /** aqui identifica se o triângulo é um triângulo especial */
    public void triangulo345() {
        System.out.println("/*******************************/");
        System.out.println("/*  Verificando se é 3-4-5...  */");
        System.out.println("/*******************************/");

        double[] lados = {base, lado2, lado3};
        java.util.Arrays.sort(lados);

        // aqui verifica se os lados são múltiplos de 3, 4 e 5
        if (verificaMultiplo(lados[0], 3) && verificaMultiplo(lados[1], 4) && verificaMultiplo(lados[2], 5)) {

            if (Math.pow(lados[0], 2) + Math.pow(lados[1], 2) == Math.pow(lados[2], 2)) {
                System.out.println("Esse é um Triângulo 3-4-5!");
                return;
            }
        }

        // usei esse código pra verifica se é um triângulo retângulo mas não 3-4-5!!
        if (Math.pow(lados[0], 2) + Math.pow(lados[1], 2) == Math.pow(lados[2], 2)) {
            System.out.println("Esse é um Triângulo retângulo, mas não é 3-4-5.");
        } else {
            System.out.println("Esse não é um Triângulo 3-4-5.");
        }
    }
}
