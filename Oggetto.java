/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershotgun;

import javax.swing.JLabel;

/**
 *
 * @author Andrea
 */
public class Oggetto {
    private int xo,yo;
    private final int width,height,distR;
    private final String name;
    private int repet;
    private JLabel label;
    public Oggetto(int x, int y, int width, int height, int distR,String name,int repet, JLabel label) {
        this.xo = x;
        this.yo = y;
        this.width = width;
        this.height = height;
        this.distR = distR;
        this.name = name;
        this.repet = repet;
        this.label = label;
        label.setIcon(new javax.swing.ImageIcon(name));
        label.setLocation(xo,yo);
        label.setSize(width,height);
    }
    public void moveX(int val){
        xo = xo+val;
        if(xo <-width && repet>0){
            repet--;
            xo += distR;
        }
        if(xo > distR-width && repet>0){
            repet++;
            xo -= distR;
        }
        label.setLocation(xo,yo);
    }
    public void moveY(int val){
        yo = yo+val;
    }
    public int getX(){
        return xo;
    }
    public int getY(){
        return yo;
    }
}
