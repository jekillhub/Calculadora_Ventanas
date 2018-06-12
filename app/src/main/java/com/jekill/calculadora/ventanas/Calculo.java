package com.jekill.calculadora.ventanas;

import static java.lang.Math.pow;

public class Calculo {

    public String precio;



    public Calculo(){

        this.precio = "";

    }

    public int redondeo(double num){

        return (int)Math.round(num);

    }

    //L-15

    public void calculoL15menor100(double alto, double ancho) {

        double calcAlto = (alto * 6 * 0.4 * 6500);
        double calAncho = (ancho * 0.4 * 6500);
        double calVidrio = (ancho * alto * 10500);

        calcAlto = calcAlto/(pow(10,contarDigitos(alto)));
        System.out.println("calculo alto: "+ calcAlto);

        calAncho = calcAlto/(pow(10,contarDigitos(alto)));
        System.out.println("calculo ancho: "+ calAncho);

        calVidrio = calVidrio/pow(10,(contarDigitos(alto)+contarDigitos(ancho)));
        System.out.println("calculo vidrio: "+ calVidrio);

        int precioR =  (int) redondeo(calcAlto + calAncho + calVidrio);
        System.out.println(precioR);

        return precioR;

    }

    public void calculoL15mayor100(double alto, double ancho) {

        double calVidrio = (ancho * alto * 30000);


    }

    public void l15Comprobacion100(double alto, double ancho) {

        if (alto * ancho > 100000) {

            calculoL15mayor100(alto, ancho);

        } else {

            calculoL15menor100(alto, ancho);

        }

    }

    //L-20

    public void calculoL20menor100(double alto, double ancho) {

        double calcAlto = (alto * 6 * 0.48 * 6500);
        double calAncho = (ancho * 0.48 * 6500);
        double calVidrio = (ancho * alto * 10500);

        double precioSR = 0;


    }

    public void calculoL20mayor100(double alto, double ancho) {

        double calVidrio = (ancho * alto * 35000);


    }

    public void l20Comprobacion100(double alto, double ancho) {

        if (alto * ancho > 100000) {

            calculoL20mayor100(alto, ancho);

        } else {

            calculoL20menor100(alto, ancho);

        }

    }

    //L-25

    public void calculoL25menor100(double alto, double ancho) {

        double calcAlto = (alto * 6 * 0.68 * 6500);
        double calAncho = (ancho * 0.68 * 6500);
        double calVidrio = (ancho * alto * 10500);

        double precioSR = 0;


    }

    public void calculoL25mayor100(double alto, double ancho) {

        double calVidrio = (ancho * alto * 42000);


    }

    public void l25Comprobacion100(double alto, double ancho) {

        if (alto * ancho > 100000) {

            calculoL25mayor100(alto, ancho);

        } else {

            calculoL25menor100(alto, ancho);

        }

    }

    public int contarDigitos(double iNumero){

        int iCantidad = 0;
        int iTemp = (int) iNumero;

        while (iTemp>0){
            iTemp = iTemp/10;
            iCantidad++;
        }

        //System.out.println(iNumero + " tiene " + iCantidad + " dígitos");
        return iCantidad;

    }

    public void setPrecio(int precio){

        this.precio = String.valueOf(precio);

    }

    public String getPrecio(){

        return this.precio;

    }

}
