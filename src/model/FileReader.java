
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FileReader {
    JFileChooser fc;
    
    public ArrayList<Double> readFile(String dir){
        
        try{
            Scanner reader = new Scanner(new FileInputStream(dir));
            ArrayList<Double> numbers = new ArrayList();
            
            while(reader.hasNext())
                numbers.add(reader.nextDouble());
            return numbers;
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "File not Found", "Error", 0);
        }
        return null;
    }
    
    public String getDirFile(){
        fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter(".txt", "txt"));
        File file;
        if (fc.showOpenDialog(null) == 0) {
            file = fc.getSelectedFile();
            return file.getAbsolutePath();
        }
        return null;
    }
}
