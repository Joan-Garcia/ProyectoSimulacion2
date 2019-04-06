/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.ArrayList;

/**
 *
 * @author rodo
 */
public class RunsUpandDown {

    public RunsUpandDown() {

    }

    public String areIndependent(ArrayList<Double> Numbers, int confidence) {
         int contador = 0;

        ArrayList<Integer> Runs = new ArrayList();
        {//Method to generate 1s and 0s
        for (int i = 0, j = 1; j < Numbers.size(); i++, j++) {
            if (Numbers.get(j) >= Numbers.get(i)) {
                Runs.add(1);
            } else {
                Runs.add(0);
            }
        }
        System.out.println(Runs);
        //Method to count runs
        for (int i = 0, j = 1; j < Runs.size(); i++, j++) {
            if (Runs.get(j) == Runs.get(i)) {
            } else { contador++; }
        }
        //System.out.println(contador + 1);
        
        return answerMe(contador+1, Numbers.size(), confidence);

    }
}

    private String answerMe(int i, int n, int confiden) {
        System.out.println(i);
        System.out.println(n);
        double mc = (((2*((double) n))-1))/3;
        System.out.println(mc);
        double powerO;
        powerO = (((16*((double)n))-29))/90;
        System.out.println(powerO);
        float zo = (float) Math.abs((i-mc)/(Math.sqrt(powerO)));
        System.out.println(zo);
        if(confiden==80){
            if(zo<1.28)
                return "The numbers are independent!";
            else
                return "The numbers are not independent!";
        }
        if(confiden==90){
            if(zo<1.645)
                return "The numbers are independent!";
            else
                return "The numbers are not independent!";
        }
        if(confiden==95){
            if(zo<1.96)
                return "The numbers are independent!";
            else
                return "The numbers are not independent!";
        }
        return null;
        
    }
}
