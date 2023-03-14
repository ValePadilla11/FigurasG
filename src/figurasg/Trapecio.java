/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasg;


public class Trapecio {
    double BaseMayor;
    double BaseMenor;
    double altura;
    public Trapecio(double BaseMayor, double BaseMenor, double altura) {
        this.BaseMayor = BaseMayor;
        this.BaseMenor = BaseMenor;
        this.altura = altura;
    }
    double calcularArea(){
        return (((BaseMayor+BaseMenor)*altura)/2);
    }
    double calcularPerimetro(){
        return Math.pow(((BaseMayor-BaseMenor)/2)*((BaseMayor-BaseMenor)/2) + altura*altura , 0.5);
    }
}
