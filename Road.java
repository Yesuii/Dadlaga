import java.awt.*;
import javax.swing.*;

public class Road extends JPanel
{
    
    public Road(){
        setLayout(null);
        setSize(500, 700);
        setVisible(true);
        
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.gray);
        g.fillPolygon(new int[] {150, 325, 485, 0}, new int[] {0, 0, 695, 695}, 4);
        
        g.setColor(Color.black);
        g.drawPolygon(new int[] {150, 325, 485, 0}, new int[] {0, 0, 695, 695}, 4);
        
        g.setColor(Color.white);
        g.fillPolygon(new int[] {175, 185, 190, 180}, new int[] {650, 650, 480, 480}, 4);
        g.fillPolygon(new int[] {305, 315, 310, 300}, new int[] {650, 650, 480, 480}, 4);
        
        g.fillPolygon(new int[] {181, 189, 194, 186}, new int[] {450, 450, 305, 305}, 4);
        g.fillPolygon(new int[] {300, 308, 303, 295}, new int[] {450, 450, 305, 305}, 4);
        
        g.fillPolygon(new int[] {187, 193, 198, 192}, new int[] {280, 280, 160, 160}, 4);
        g.fillPolygon(new int[] {295, 301, 296, 290}, new int[] {280, 280, 160, 160}, 4);
        
        g.fillPolygon(new int[] {193, 197, 202, 198}, new int[] {140, 140, 45, 45}, 4);
        g.fillPolygon(new int[] {290, 294, 289, 285}, new int[] {140, 140, 45, 45}, 4);
    }
    
}
