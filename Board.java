import java.awt.*;
import javax.swing.*;
public class Board extends JFrame
{
    private JPanel pan = new JPanel();
    public Road r = new Road();
    
    public Board() {
        setLayout(null);
        setSize(510, 780);
        setVisible(true);
        setBounds(0, 0, 500, 700);
        add(r);
        JMenuBar mb=new JMenuBar();
        JMenu e=new JMenu("exit");
        mb.add(e);
        e.setIcon(new ImageIcon("C:\\eicon.png"));
      
        
        
        
        setJMenuBar(mb);
    }
    public static void main(){
        Board b = new Board();
        
    }
}
