/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasg;

public class Rombo {
    double DiagonalMayor;
    double DiagonalMenor;
    double Lado;
    public Rombo(double DiagonalMayor, double DiagonalMenor, double Lado) {
        this.DiagonalMayor = DiagonalMayor;
        this.DiagonalMenor = DiagonalMenor;
        this.Lado = Lado;
    }
    double calcularArea(){
        return ((DiagonalMayor * DiagonalMenor)/2);
    }        
    double calcularPerimetro(){
        return (Lado * 4);
    }
    
}
