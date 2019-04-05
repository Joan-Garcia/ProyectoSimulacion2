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
public class RunsUpandDown1Average {

    int contador = 0, contador0 = 0, contador1 = 0;
    
    public RunsUpandDown1Average() {

    }

    public String areIndependent(ArrayList<Double> Numbers, int confidence) {
        ArrayList<Integer> Runs = new ArrayList();
        {//Method to generate 1s and 0s
        for (int i = 0; i < Numbers.size(); i++) {
            if (Numbers.get(i) >= 0.5) {
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
        
            for (int i = 0; i < Runs.size(); i++) {
                if(Runs.get(i)==0)
                    contador0++;
                else
                    contador1++;              
            }
        //System.out.println(contador + 1);
        
        return answerMe(contador+1, Numbers.size(), confidence, contador1, contador0);

    }
}

    private String answerMe(int i, int n, int confiden, int coun1, int count0) {
        float mc = (float) (((2*coun1*count0)/n) + 0.5);
        float powerO = ((2*coun1*count0)*(2*count0*coun1-n))/(n*n*(n-1));
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
