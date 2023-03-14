/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasg;


public class Cuadrado {
    double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    double calcularArea() {
        return lado*lado;
    }
    double calcularPerímetro() {
        return (4*lado);
    }
    
}
