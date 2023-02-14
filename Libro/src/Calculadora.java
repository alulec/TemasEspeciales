import java.util.Scanner;

public class Calculadora {
//atributos
    private int numero1;
    private int numero2;
    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;



    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public void leerNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("introduce segundo numero: ");
        numero2 = entrada.nextInt();
    }
    public void sumar(){
        suma=numero1+numero2;

    }

    public void resta(){
        resta=numero1-numero2;

    }
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }

    public void dividir(){
        division= numero1 / numero2;
    }
public void mostrar(){
    System.out.println("La SUMA es: "+ suma);
    System.out.println("La RESTA es "+resta);
    System.out.println("La MULTIPLICACION es: " +multiplicacion);
    System.out.println("La DIVISION es "+ division);
}
}
