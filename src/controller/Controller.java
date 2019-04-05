
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.FileReader;

public class Controller implements ActionListener{
    private final JLabel result;
    private final JTextField dirFile;
    private final JComboBox confidence;
    private final ButtonGroup radioGroup;
    private final JButton bCalculate, openFile;
    private final JRadioButton chi, runs, runsAverage;
    private FileReader fr;
    
    public Controller(JTextField dirFile, JComboBox confidence,
            ButtonGroup radioGroup, JLabel result, JButton bCalculate,
            JButton openFile, JRadioButton chi, JRadioButton runs,
            JRadioButton runsAverage){
        this.dirFile = dirFile;
        this.confidence = confidence;
        this.radioGroup = radioGroup;
        this.result = result;
        this.bCalculate = bCalculate;
        this.openFile = openFile;
        this.chi = chi;
        this.runs = runs;
        this.runsAverage = runsAverage;
        fr = new FileReader();
    }
    
    private boolean checkData(){
        if (dirFile.getText().length() != 0 && radioGroup.getSelection() != null)
            return true;
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bCalculate) {
            if (checkData()) {
                ArrayList<Double> n = fr.readFile(dirFile.getText());
                if (n != null) {
                    for (int i = 0; i < n.size(); i++){
                        System.out.println(n.get(i));
                    }
                }
            }else
                JOptionPane.showMessageDialog(null, "Fill the data", "Error", 2);
            
        } else if (e.getSource() == openFile) {
            dirFile.setText(fr.getDirFile());
        }
    }
}
