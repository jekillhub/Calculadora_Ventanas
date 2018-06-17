package com.jekill.calculadora.ventanas;

public class Calculo {

    public String precio;



    public Calculo(){

        this.precio = "";

    }

    public int redondeo(double num){

        return (int)Math.round(num);

    }

    //L-15

    public double calculoL15menor100(double alto, double ancho) {

        double calAlto = (alto * 6 * 0.4 * 6500);
        double calAncho = (ancho * 0.4 * 6500);
        double calVidrio = (ancho * alto * 10500);

        System.out.println("calculo alto: "+ calAlto);
        System.out.println("calculo ancho: "+ calAncho);
        System.out.println("calculo vidrio: "+ calVidrio);

        return calAlto + calAncho + calVidrio;

    }

    public double calculoL15mayor100(double alto, double ancho) {

        System.out.println("total: " + (ancho * alto * 30000));

        return (ancho * alto * 30000);



    }

    public void l15Comprobacion100(double alto, double ancho) {

        if (alto * ancho > 100000) {

            calculoL15mayor100(alto, ancho);

        } else {

            calculoL15menor100(alto, ancho);

        }

    }

    //L-20

    public double calculoL20menor100(double alto, double ancho) {

        double calAlto = (alto * 6 * 0.48 * 6500);
        double calAncho = (ancho * 0.48 * 6500);
        double calVidrio = (ancho * alto * 10500);

        System.out.println("calculo alto: "+ calAlto);
        System.out.println("calculo ancho: "+ calAncho);
        System.out.println("calculo vidrio: "+ calVidrio);
        System.out.println("total: " + (calAlto + calAncho + calVidrio));

        return calAlto + calAncho + calVidrio;


    }

    public double calculoL20mayor100(double alto, double ancho) {

        System.out.println("total: "+ (ancho * alto * 35000));

        return (ancho * alto * 35000);


    }

    public void l20Comprobacion100(double alto, double ancho) {

        if (alto * ancho > 100000) {

            calculoL20mayor100(alto, ancho);

        } else {

            calculoL20menor100(alto, ancho);

        }

    }

    //L-25

    public double calculoL25menor100(double alto, double ancho) {

        double calAlto = (alto * 6 * 0.68 * 6500);
        double calAncho = (ancho * 0.68 * 6500);
        double calVidrio = (ancho * alto * 10500);

        System.out.println("calculo alto: "+ calAlto);
        System.out.println("calculo ancho: "+ calAncho);
        System.out.println("calculo vidrio: "+ calVidrio);
        System.out.println("total: " + (calAlto + calAncho + calVidrio));

        return (calAlto + calAncho + calVidrio);


    }

    public double calculoL25mayor100(double alto, double ancho) {

        System.out.println("total : " + (ancho*alto*42000));

        return (ancho * alto * 42000);


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
