/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ortiz
 */
public class Sala extends JFrame implements MouseListener{
    private JLabel label;
    private JLabel verde, vermelho;
  
    ArrayList<JLabel> labels = new ArrayList<JLabel>();
    
    

        
                
                
    public Sala(){

		this.setSize(500, 400);
		this.criaGUI();
		//this.setVisible(true);
		this.setResizable(false);
		this.setLocation((800 - 300) / 2, (600 - 200) / 2);
                
                
               verde = new JLabel(); verde.setIcon(new ImageIcon("\\Cadeiras\\verde.gif"));
               vermelho = new JLabel();  vermelho.setIcon(new ImageIcon("C:\\Users\\aluno\\Documents\\GitHub\\ES2\\Cadeiras\\vermelha.gif"));
               // E casa
               // F senac
	}
    
  
    
    
    public void criaGUI(){
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new GridLayout(10,10));                
                for(int x = 1; x<=100; x++){
                    JLabel label = new JLabel();
                    label.addMouseListener(this);
                    label.setIcon(new ImageIcon("C:\\Users\\aluno\\Documents\\GitHub\\ES2\\Cadeiras\\vermelha.gif"));
                    // E casa
                    // F senac
                    label.setBorder(BorderFactory.createBevelBorder(0));
                    labels.add(label);
                    window.add(label);
                }		
                
	}
   
    
    

    @Override
    public void mouseClicked(MouseEvent e){
        boolean achou = false;
              for(JLabel l: labels){
       if(e.getSource().equals(l)&& l.getIcon().toString().equals(verde.getIcon().toString())){
           achou = true;
            l.setIcon(new ImageIcon("F:\\SENAC 2013¹\\ES2\\VendaIngressos\\Cadeiras\\vermelha.gif"));
            // E casa
            // F senac
            l.repaint();
       }
        
            
              }
              if( achou == true){ this.dispose();}
              else {JOptionPane.showMessageDialog(rootPane, "Cadeira ocupada, por favor, escolha outra.");}
              
        
    }

    @Override
    public void mousePressed(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseExited(MouseEvent e){
    }
}
