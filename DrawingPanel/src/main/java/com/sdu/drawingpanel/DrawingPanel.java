
package com.sdu.drawingpanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class DrawingPanel extends JPanel implements MouseListener{
    
    int x,y;
    
    public DrawingPanel(){
        setSize(640,480);
        Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
        setBorder(blackBorder);
        addMouseListener(this);
    }
    
    public void doDrawing(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        
        g2d.setPaint(Color.BLUE);
        
        g2d.fillOval(x, y, 10, 10);
    }
    
   @Override
   protected void paintComponent(Graphics g){
       super.paintComponent(g);
       doDrawing(g);
   }

    @Override
    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    
    
}
