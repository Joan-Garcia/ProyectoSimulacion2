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

    int contador = 0;
    public RunsUpandDown() {

    }

    public String areIndependient(ArrayList<Double> Numbers, int confidence) {
        ArrayList<Integer> Runs = new ArrayList();
        {//Method to generate 1s and 0s
        for (int i = 0, j = 1; j < Numbers.size(); i++, j++) {
            if (Numbers.get(j) >= Numbers.get(i)) {
                Runs.add(1);
            } else {
                Runs.add(0);
            }
        }
        //System.out.println(Runs);
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
        float mc = (2*n-1)/3;
        float powerO = (16*n-29)/90;
        float zo = (float) Math.abs((i-mc)/(Math.sqrt(powerO)));
        System.out.println(zo);
        if(confiden==80){
            if(zo<1.28)
                return "The numbers are independient!";
            else
                return "the numbers are not independient!";
        }
        if(confiden==90){
            if(zo<1.645)
                return "The numbers are independient!";
            else
                return "the numbers are not independient!";
        }
        if(confiden==95){
            if(zo<1.96)
                return "The numbers are independient!";
            else
                return "the numbers are not independient!";
        }
        return null;
        
    }
}
