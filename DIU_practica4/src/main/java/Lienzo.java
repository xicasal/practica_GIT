
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xavier Iglesias
 */
public class Lienzo extends JPanel{
    int d = 10;
    private ArrayList<Point2D> coord = new ArrayList<>();
    
    public void setPoint(int p1,int p2){
       coord.add(new Point(p1,p2));
       if ( coord.size()>5){
           coord.remove(0);
       }
   }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

         for(int i = 0;i<coord.size();i++){
            g.fillOval((int)coord.get(i).getX(),(int)coord.get(i).getY(),d, d);
        }
    }
   
   
}
