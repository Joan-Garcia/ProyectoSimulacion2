
package view;

import controller.Controller;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Gui {
    private final JFrame window;
    private final JPanel panel;
    private final JLabel result, h1, h2, h3;
    private final JButton bCalculate, openFile;
    private final JTextField dirFile;
    private final JComboBox confidence;
    private final ButtonGroup radioGroup;
    private final JRadioButton chi, runs, runsAverage;
    private Controller c;
    
    public Gui(){
        window = new JFrame();
        panel = new JPanel();
        result = new JLabel("The numbers are independent!");
        bCalculate = new JButton("Test");
        openFile = new JButton("Open");
        h1 = new JLabel("Select File");
        dirFile = new JTextField();
        h2 = new JLabel("Select the level of Confidence");
        confidence = new JComboBox();
        h3 = new JLabel("Select method");
        radioGroup = new ButtonGroup();
        chi = new JRadioButton("Chi square");
        runs = new JRadioButton("Runs up & down");
        runsAverage = new JRadioButton("Runs up & down the average");
        c = new Controller(dirFile, confidence, radioGroup, result, bCalculate, openFile, chi, runs, runsAverage);
    }
    
    public void launch(){
        windowSettings();
        h1Settings();
        h2Settings();
        h3Settings();
        openFileSettings();
        dirFileSettings();
        confidenceSettings();
        radioButtonssettings();
        radioGroupSettings();
        bCalculateSettings();
        resultSettings();
        panelSettings();
        show();
    }
    
    private void windowSettings(){
        window.setSize(600, 500);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void h1Settings(){
        h1.setFont(new Font("Century Gothic", Font.BOLD, 25));
        h1.setBounds(20, 20, 300, 30);
    }
    
    private void h2Settings(){
        h2.setFont(new Font("Century Gothic", Font.BOLD, 25));
        h2.setBounds(20, 130, 500, 30);
    }
    
    private void h3Settings(){
        h3.setFont(new Font("Century Gothic", Font.BOLD, 25));
        h3.setBounds(20, 230, 400, 30);
    }
    
    private void openFileSettings(){
        openFile.setBounds(20, 70, 100, 30);
        openFile.addActionListener(c);
    }
    
    private void dirFileSettings(){
        dirFile.setBounds(130, 70, 445, 30);
        dirFile.setEditable(false);
    }
    
    private void confidenceSettings(){
        confidence.setBounds(20, 170, 100, 30);
        confidence.addItem("80");
        confidence.addItem("90");
        confidence.addItem("95");
    }
    
    private void radioButtonssettings(){
        chi.setBounds(20, 270, 100, 30);
        
        runs.setBounds(130, 270, 120, 30);
        
        runsAverage.setBounds(275, 270, 190, 30);
    }
    
    private void radioGroupSettings(){
        radioGroup.add(chi);
        radioGroup.add(runs);
        radioGroup.add(runsAverage);
    }
    
    private void bCalculateSettings(){
        bCalculate.setBounds(470, 420, 100, 30);
        bCalculate.addActionListener(c);
    }
    
    private void resultSettings(){
        result.setFont(new Font("Century Gothic", Font.BOLD, 25));
        result.setBounds(20, 350, 400, 30);
    }
    
    private void panelSettings(){
        panel.setLayout(null);
        panel.add(h1);
        panel.add(openFile);
        panel.add(dirFile);
        panel.add(h2);
        panel.add(confidence);
        panel.add(h3);
        panel.add(chi);
        panel.add(runs);
        panel.add(runsAverage);
        panel.add(bCalculate);
        panel.add(result);
    }
    
    private void show(){
        window.getContentPane().add(panel);
        window.setVisible(true);
    }
}
