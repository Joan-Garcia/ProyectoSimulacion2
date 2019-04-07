package methods;

import java.util.Random;

public class methodChi {
    public methodChi(){}
    Random rand = new Random();
    float alpha = (float) 0.1;
    float b = (float) 14.68;
    int e = 10;

    int r1 = 0;
    int r2 = 0;
    int r3 = 0;
    int r4 = 0;
    int r5 = 0;
    int r6 = 0;
    int r7 = 0;
    int r8 = 0;
    int r9 = 0;
    int r10 = 0;

    float xi1;
    float xi2;
    float xi3;
    float xi4;
    float xi5;
    float xi6;
    float xi7;
    float xi8;
    float xi9;
    float xi10;

    public void calcular() {
        for (int i = 0; i < 100; i++) {
            float r = rand.nextFloat();
//            System.out.println(r);
            if (0 <= r && r <= .1) {
                r1 = r1 + 1;
            }
            if (0.1 <= r && r <= .2) {
                r2 = r2 + 1;
            }
            if (0.2 <= r && r <= .3) {
                r3 = r3 + 1;
            }
            if (0.3 <= r && r <= .4) {
                r4 = r4 + 1;
            }
            if (0.4 <= r && r <= .5) {
                r5 = r5 + 1;
            }
            if (0.5 <= r && r <= .6) {
                r6 = r6 + 1;
            }
            if (0.6 <= r && r <= .7) {
                r7 = r7 + 1;
            }
            if (0.7 <= r && r <= .8) {
                r8 = r8 + 1;
            }
            if (0.8 <= r && r <= .9) {
                r9 = r9 + 1;
            }
            if (0.9 <= r && r <= 1) {
                r10 = r10 + 1;
            }
        }
    }

    public void inicio() {
        System.out.println("Este programa genera 100 numeros aleatorios"
                + "a los cuales se aplica la chi cuadrada");
    }

    public void resulPaciales() {
        System.out.print("Con un total de: ");
        System.out.println(r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8 + r9 + r10);
        System.out.println("Se obtiene que: ");
        System.out.println("[ 0  - 0.1] : " + r1);
        System.out.println("[0.1 - 0.2] : " + r2);
        System.out.println("[0.2 - 0.3] : " + r3);
        System.out.println("[0.3 - 0.4] : " + r4);
        System.out.println("[0.4 - 0.5] : " + r5);
        System.out.println("[0.5 - 0.6] : " + r6);
        System.out.println("[0.6 - 0.7] : " + r7);
        System.out.println("[0.7 - 0.8] : " + r8);
        System.out.println("[0.8 - 0.9] : " + r9);
        System.out.println("[0.9 -  1 ] : " + r10);
    }

    public void Xi() {
        xi1 = (float) ((Math.pow(e - r1, 2)) / e);
        xi2 = (float) (Math.pow(e - r2, 2)) / e;
        xi3 = (float) (Math.pow(e - r3, 2)) / e;
        xi4 = (float) (Math.pow(e - r4, 2)) / e;
        xi5 = (float) (Math.pow(e - r5, 2)) / e;
        xi6 = (float) (Math.pow(e - r6, 2)) / e;
        xi7 = (float) (Math.pow(e - r7, 2)) / e;
        xi8 = (float) (Math.pow(e - r8, 2)) / e;
        xi9 = (float) (Math.pow(e - r9, 2)) / e;
        xi10 = (float) (Math.pow(e - r10, 2)) / e;
        System.out.println("Los X son : ");
        System.out.println(xi1);
        System.out.println(xi2);
        System.out.println(xi3);
        System.out.println(xi4);
        System.out.println(xi5);
        System.out.println(xi6);
        System.out.println(xi7);
        System.out.println(xi8);
        System.out.println(xi9);
        System.out.println(xi10);
    }

    public void resultados() {

    }

    public void chi() {
        System.out.print("La sumatoria de las X es : ");
        float x = (xi1 + xi2 + xi3 + xi4 + xi5 + xi6 + xi7 + xi8 + xi9 + xi10);
        System.out.println(x);
        System.out.println("Dado que X2 es : " + b);
        System.out.print("Por lo cual se puede decir que ");
        if (b > x) {
            System.out.println("sigue una distribucion uniforme");
        } else {
            System.out.println("sigue una distribucion independiente");
        }
    }

    public void corrida() {
        methodChi ES3 = new methodChi();
        ES3.inicio();
        ES3.calcular();
        ES3.resulPaciales();
        ES3.Xi();
        ES3.chi();
    }
    

}
