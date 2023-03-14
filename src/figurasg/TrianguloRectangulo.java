/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasg;


public class TrianguloRectangulo {
    double base;
    double altura;
    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea() {
        return (base * altura / 2);
    }
    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa());
    }
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    void determinarTipoTriángulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa()))
            System.out.println("Es un triangulo equilátero");
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triangulo escaleno");
        else
            System.out.println("Es un triangulo isosceles");
    }    
}
