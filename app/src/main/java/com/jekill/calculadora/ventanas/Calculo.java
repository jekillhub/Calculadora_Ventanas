package com.jekill.calculadora.ventanas;

public class Calculo {

    public String precio;


    public Calculo() {

        this.precio = "";

    }

    //Manejo Numerico

    public static int redondeo(double num) {

        return (int) (1000*(Math.ceil(Math.abs(num/1000))));

    }

    public double dividirDato(double num) {

        return num / (Math.pow(10, 2));

    }

    //L-15

    public void calculoL15menor100(double alto, double ancho) {

        double calAlto = (dividirDato(alto) * 6 * 0.4 * 6500);
        double calAncho = (dividirDato(ancho) * 0.4 * 6500);
        double calVidrio = (dividirDato(alto) * dividirDato(ancho) * 10500);

        //System.out.println("calculo alto: " + calAlto);
        //System.out.println("calculo ancho: " + calAncho);
        //System.out.println("calculo vidrio: " + calVidrio);
        double precioSR = calAlto + calAncho + calVidrio;

        setPrecio(redondeo(precioSR));

    }

    public void calculoL15mayor100(double alto, double ancho) {

        //System.out.println("total: " + (dividirDato(alto) * dividirDato(ancho) * 30000));

        setPrecio(redondeo((dividirDato(alto) * dividirDato(ancho) * 30000)));

    }

    public void l15Comprobacion100(double alto, double ancho) {

        if (alto * ancho >= 100000) {

            calculoL15mayor100(alto, ancho);

        } else {

            calculoL15menor100(alto, ancho);

        }

    }

    //L-20

    public void calculoL20menor100(double alto, double ancho) {

        double calAlto = (dividirDato(alto) * 6 * 0.48 * 6500);
        double calAncho = (dividirDato(ancho) * 0.48 * 6500);
        double calVidrio = (dividirDato(alto) * dividirDato(ancho) * 10500);

        //System.out.println("calculo alto: " + calAlto);
        //System.out.println("calculo ancho: " + calAncho);
        //System.out.println("calculo vidrio: " + calVidrio);
        //System.out.println("total: " + (calAlto + calAncho + calVidrio));
        double precioSR = calAlto + calAncho + calVidrio;

        setPrecio(redondeo(precioSR));

    }

    public void calculoL20mayor100(double alto, double ancho) {

        //System.out.println("total: " + (dividirDato(alto) * dividirDato(ancho) * 35000));

        setPrecio(redondeo(dividirDato(alto) * dividirDato(ancho) * 35000));


    }

    public void l20Comprobacion100(double alto, double ancho) {

        if (alto * ancho >= 100000) {

            calculoL20mayor100(alto, ancho);

        } else {

            calculoL20menor100(alto, ancho);

        }

    }

    //L-25

    public void calculoL25menor100(double alto, double ancho) {

        double calAlto = (dividirDato(alto) * 6 * 0.68 * 6500);
        double calAncho = (dividirDato(ancho) * 0.68 * 6500);
        double calVidrio = (dividirDato(alto) * dividirDato(ancho) * 10500);

        //System.out.println("calculo alto: " + calAlto);
        //System.out.println("calculo ancho: " + calAncho);
        //System.out.println("calculo vidrio: " + calVidrio);
        //System.out.println("total: " + (calAlto + calAncho + calVidrio));
        double precioSR = calAlto + calAncho + calVidrio;

        setPrecio(redondeo(precioSR));

    }

    public void calculoL25mayor100(double alto, double ancho) {

        //System.out.println("total : " + (dividirDato(alto) * dividirDato(ancho) * 42000));

        setPrecio(redondeo(dividirDato(alto) * dividirDato(ancho) * 42000));


    }

    public void l25Comprobacion100(double alto, double ancho) {

        if (alto * ancho >= 100000) {

            calculoL25mayor100(alto, ancho);

        } else {

            calculoL25menor100(alto, ancho);

        }

    }


    // Get y Set Precio

    public void setPrecio(int redondeo) {

        this.precio = String.valueOf(redondeo);

    }

    public String getPrecio() {

        return this.precio;

    }

}
