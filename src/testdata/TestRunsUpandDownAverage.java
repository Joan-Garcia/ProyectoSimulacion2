/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdata;

import java.util.ArrayList;
import methods.RunsUpandDown;
import methods.RunsUpandDown1Average;

/**
 *
 * @author rodo
 */
public class TestRunsUpandDownAverage {

    public static void main(String[] args) {
        ArrayList<Double> Numbers = new ArrayList();
        Numbers.add(0.89);
        Numbers.add(0.26);
        Numbers.add(0.01);
        Numbers.add(0.98);
        Numbers.add(0.13);
        Numbers.add(0.12);
        Numbers.add(0.69);
        Numbers.add(0.11);
        Numbers.add(0.05);
        Numbers.add(0.65);
        Numbers.add(0.21);
        Numbers.add(0.04);
        Numbers.add(0.03);
        Numbers.add(0.11);
        Numbers.add(0.02);
        Numbers.add(0.97);
        Numbers.add(0.22);
        Numbers.add(0.12);
        Numbers.add(0.95);
        Numbers.add(0.02);
        Numbers.add(0.06);
        System.out.println( new RunsUpandDown1Average().areIndependient(Numbers, 90));
    }

}
