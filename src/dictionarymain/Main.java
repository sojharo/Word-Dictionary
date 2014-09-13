/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarymain;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Sojharo
 */
public class Main {
    
    public static void main(String []args) throws FileNotFoundException, IOException
    {
    
        NewJFrame frame=new NewJFrame();
        
        frame.setTitle("Nadeem's DSA Project __Dictionary");
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocation(400, 400);
        frame.setDefaultCloseOperation(NewJFrame.EXIT_ON_CLOSE);
    }
}
