/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author felip
 */
public class Equations {
    private double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
    public void adition(double operator){
        this.number+=operator;
    }
    public void subtraction(double operator){
        this.number-=operator;
    }
    public void multiplicator(double operator){
        this.number=this.number*operator;
    }
    public void division(double operator){
        this.number=this.number/operator;
    }
}
