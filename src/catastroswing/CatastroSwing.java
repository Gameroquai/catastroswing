/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catastroswing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Gamero
 */
public class CatastroSwing extends JFrame implements ActionListener{

    
    public static void main(String[] args) {
        CatastroSwing ventana = new CatastroSwing("Catastro");
        ventana.setBounds(200, 200, 500, 300);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public CatastroSwing(String title) throws HeadlessException {
        super(title);
        Container cpane = getContentPane();
        JPanel norte = new JPanel();
        JPanel centro = new JPanel();
        JPanel derecha = new JPanel();
        JLabel comu, prov, pueblo;
        
        //Panel norte
        cpane.add(norte, BorderLayout.NORTH);
        comu = new JLabel("Comunidad");
        norte.add(comu);
        
        //Panel centro
        cpane.add(centro, BorderLayout.CENTER);
        prov = new JLabel("Provincias");
        centro.add(prov);
        
        //Panel derecho
        cpane.add(derecha, BorderLayout.EAST);
        pueblo = new JLabel("pueblo");
        derecha.add(pueblo);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    
}
