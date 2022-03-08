/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_static;

/**
 *
 * @author IvanTron
 */
public class EVA1_14_STATIC {

    public static void main(String[] args) {
        double area = FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Area del círculo: " + area);
        double areaT = FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Area del triangulo: " + area);
        FormulasMatematicas Obj = new FormulasMatematicas();
        Obj.imprimirMensaje();
    }
    
}

class FormulasMatematicas{
    
    public static double calcularAreaCirculo(double radio) {
        double area;
        area = 3.1416 * radio * radio;
        return area;
    }
    
    public static double calcularAreaTriangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }
    
    public void imprimirMensaje() {
        System.out.println("Hola Mundo!!");
    }
}
