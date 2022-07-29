/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudproducto;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Oz
 */
public class FCrudProducto {
    
    JFrame f = new JFrame();
    JPanel p = new JPanel();
    
    public void form() {
        f.setTitle("PRODUCTO");//Titulo JFrame
        f.setLocationRelativeTo(null);
        f.setBounds(50, 100, 400, 600);//Dimensiones JFrame
        f.setVisible(true);//Activando JFrame
        
        p.setBackground(Color.LIGHT_GRAY);//Agregado color a panel
        p.setLayout(null);
        f.add(p);//Agregando panel a Jframe
        
        JLabel l1= new JLabel ("REGISTRO DE PRODUCTO");//Creacion de Jlabel
        l1.setBounds(10,0,500,50);//Ingresando datos X,Y,Long,Altura de Jlabel
        p.add(l1);//Adiriendo Jlabel a JPanel
//01---------------------------------------------------------------------
        int px,py,lo,al;
        px=10; py=40; lo=300; al=25;
        JLabel l2= new JLabel ("Codigo:");//Ingresando datos X,Y,Long,Altura de Jlabel
        l2.setBounds(px,py,lo,al);//Ingresando datos X,Y,Long,Altura de Jlabel
        p.add(l2);//Adiriendo Jlabel a JPanel
        
        JTextField t1 = new JTextField("Codigo, Codigo");//Ingresando datos X,Y,Long,Altura de JTextField
        t1.setBounds(px,60,lo,al);//Ingresando datos X,Y,Long,Altura de JTextField
        p.add(t1);//Adiriendo Jlabel a JTextField
        
//02---------------------------------------------------------------------
        JLabel l3= new JLabel ("Nombre del Producto:");//Creacion de Jlabel
        l3.setBounds(px,80,lo,al);//Ingresando datos X,Y,Long,Altura de Jlabel
        p.add(l3);//Adiriendo Jlabel a JPanel
        
        JTextField t2 = new JTextField("Nombre del Producto");//Ingresando datos X,Y,Long,Altura de JTextField
        t2.setBounds(px,100,lo,al);//Ingresando datos X,Y,Long,Altura de JTextField
        p.add(t2);//Adiriendo Jlabel a JTextField
        
//03---------------------------------------------------------------------
        JLabel l4= new JLabel ("Cantidad de Producto:");//Creacion de Jlabel
        l4.setBounds(px,120,lo,al);//Ingresando datos X,Y,Long,Altura de Jlabel
        p.add(l4);//Adiriendo Jlabel a JPanel
        
        JTextField t3 = new JTextField("Cantidad de Producto");//Ingresando datos X,Y,Long,Altura de JTextField
        t3.setBounds(px,140,lo,al);//Ingresando datos X,Y,Long,Altura de JTextField
        p.add(t3);//Adiriendo Jlabel a JTextField
        
//04---------------------------------------------------------------------       
        JLabel l5= new JLabel ("Lugar de Fabricación o Producción:");//Creacion de Jlabel
        l5.setBounds(px,160,lo,al);//Ingresando datos X,Y,Long,Altura de Jlabel
        p.add(l5);//Adiriendo Jlabel a JPanel
        
        JTextField t4 = new JTextField("Lugar de Fabricación o Producción");//Ingresando datos X,Y,Long,Altura de JTextField
        t4.setBounds(px,180,lo,al);//Ingresando datos X,Y,Long,Altura de JTextField
        p.add(t4);//Adiriendo Jlabel a JTextField
        
//05---------------------------------------------------------------------        
        JLabel l6= new JLabel ("Fecha Ingreso de Producto:");//Creacion de Jlabel
        l6.setBounds(px,200,lo,al);//Ingresando datos X,Y,Long,Altura de Jlabel
        p.add(l6);//Adiriendo Jlabel a JPanel
        
        JTextField t5 = new JTextField("Fecha Ingreso de Producto");//Ingresando datos X,Y,Long,Altura de JTextField
        t5.setBounds(px,220,lo,al);//Ingresando datos X,Y,Long,Altura de JTextField
        p.add(t5);//Adiriendo Jlabel a JTextField
        
    }
    
    public static void main(String[] args) {
        FCrudProducto f =new FCrudProducto();
        f.form();
    }
    
    
}
