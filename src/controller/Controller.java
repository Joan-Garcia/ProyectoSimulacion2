
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
import methods.RunsUpandDown;
import methods.RunsUpandDown1Average;
import methods.methodChi;
import model.FileReader;

public class Controller implements ActionListener{
    private final JLabel result;
    private final JTextField dirFile;
    private final JComboBox confidence;
    private final ButtonGroup radioGroup;
    private final JButton bCalculate, openFile;
    private final JRadioButton chi, runs, runsAverage;
    private FileReader fr;
    private RunsUpandDown rud;
    private RunsUpandDown1Average ruda;
    private methodChi chiChenol;
    
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
        rud = new RunsUpandDown();
        ruda = new RunsUpandDown1Average();
        chiChenol = new methodChi();
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
                    int confi= Integer.parseInt(confidence.getSelectedItem().toString());
                    if (chi.isSelected()) {
                        result.setText(chiChenol.calcular(n, confi));
                    } else if (runs.isSelected()){
                        result.setText(rud.areIndependent(n, confi));
                    } else if (runsAverage.isSelected()){
                        result.setText(ruda.areIndependent(n, confi));
                    }
                }
            }else
                JOptionPane.showMessageDialog(null, "Fill the data", "Error", 2);
            
        } else if (e.getSource() == openFile) {
            result.setText("");
            radioGroup.clearSelection();
            dirFile.setText(fr.getDirFile());
        }
    }
}
