/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Ernest Menasu
 */
public class Calculatrice extends JFrame implements ActionListener{
    JFrame frame= new JFrame();
    JTextField text;
    JButton b0, b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,minus,time,div,del,dot,back,equal,clock,sqrt;
    JRadioButton rad1,rad2;
    ButtonGroup p= new ButtonGroup();
    String number1="",number2="",number3="", number4;
    
Calculatrice(){
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new BorderLayout());

b0= new JButton("0");
b1= new JButton("1");b2= new JButton("2"); b3= new JButton("3");
b4= new JButton("4");b5= new JButton("5");b6= new JButton("6");
b7= new JButton("7");b8= new JButton("8");text= new JTextField("BONJOUR MONSIER BRICE", 20);
b9= new JButton("9");plus= new JButton("+");minus= new JButton("-");
time= new JButton("*");div= new JButton("/"); del= new JButton("Delete");
clock= new JButton("Time ET");sqrt= new JButton("sqrt"); equal= new JButton("=");
dot= new JButton(".");back= new JButton("BackSpace");
rad1= new JRadioButton("On"); rad2= new JRadioButton("Off"); 



text.setBackground(Color.WHITE);
text.setColumns(60);
JPanel pane= new JPanel(new GridLayout(3,1));
JPanel pane1= new JPanel(new GridLayout(5,4));
pane.setBounds(30, 30, 30, 30);
pane1.setBounds(20, 20, 20, 20);

p.add(rad1);p.add(rad2);
pane.add(text);pane.add(rad1);pane.add(rad2);
pane1.add(clock);pane1.add(del);pane1.add(back);pane1.add(sqrt);
pane1.add(b0);pane1.add(b1);pane1.add(b2);pane1.add(plus);
pane1.add(b3);pane1.add(b4);pane1.add(b5);pane1.add(minus);
pane1.add(b6);pane1.add(b7);pane1.add(b8);pane1.add(time);
pane1.add(b9);pane1.add(dot);pane1.add(equal);pane1.add(div);

frame.setTitle("BENVENU DANS LA FAMILLE MENASU");
frame.add(pane, BorderLayout.NORTH);frame.add(pane1,BorderLayout.CENTER);
frame.setBackground(Color.blue);
frame.setSize(600, 300);
frame.setVisible(true);

del.addActionListener(this);
rad1.addActionListener(this);
rad2.addActionListener(this);
plus.addActionListener(this);
minus.addActionListener(this);
time.addActionListener(this);
div.addActionListener(this);
clock.addActionListener(this);
back.addActionListener(this);
equal.addActionListener(this);
sqrt.addActionListener(this);
b0.addActionListener(this);
}
@Override
    public void actionPerformed(ActionEvent e) {
     
       
  if(e.getSource()==del){
        text.setText("0.");}

  else if(e.getSource().equals(rad1)) {
       turnOn();
  } 
  else if(e.getSource().equals(rad2)) {
       turnOff();
  }
  else if(e.getSource().equals(clock)) {
      text.setText(new Date().toString());
  }
   else if(e.getSource().equals(plus)) {
      JOptionPane.showMessageDialog(frame,"Loading...");
   }
   else if(e.getSource().equals(minus)) {
      
      JOptionPane.showMessageDialog(frame,"Loading...");
   } else if
           (e.getSource().equals(time)) 
   {
     JOptionPane.showMessageDialog(frame,"Loading...");
   } else if(e.getSource().equals(div)) 
   {
      JOptionPane.showMessageDialog(frame,"Loading...");
   } else if(e.getSource().equals(sqrt)) 
   {
      JOptionPane.showInputDialog("Can you please enter your name?");
   }else if(e.getSource().equals(equal)) 
   {
      JOptionPane.showInputDialog("Can you please enter your name?");
   }else if(e.getSource().equals(back))
       
   {
      JOptionPane.showInputDialog(frame,"Sorry,I've not configured this button yet");}
  else if(e.getSource().equals(b0))
       
   {
      JOptionPane.showInputDialog(frame,"Sorry Brice, TonTon ERNEST is still working on");}
  
      else if(e.getActionCommand().equals(b1)) 
   {
       text.setText(text.getText());
   }}
    
    
    public void turnOn(){
  text.setEnabled(true);
  b0.setEnabled(true);b2.setEnabled(true);b3.setEnabled(true);
   b4.setEnabled(true);b5.setEnabled(true);b6.setEnabled(true);
    b7.setEnabled(true);b8.setEnabled(true);b9.setEnabled(true);
    time.setEnabled(true);b1
            .setEnabled(true);
     plus.setEnabled(true);minus.setEnabled(true);div.setEnabled(true);
     dot.setEnabled(true);back.setEnabled(true);del.setEnabled(true);
     equal.setEnabled(true);clock.setEnabled(true);sqrt.setEnabled(true);}
    
    public void turnOff(){
  text.setEnabled(false);
  b0.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
   b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
    b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
   b1.setEnabled(false);b0.setEnabled(false);b0.setEnabled(false);
   del.setEnabled(false);time.setEnabled(false);div.setEnabled(false);
   back.setEnabled(false);del.setEnabled(false);clock.setEnabled(false);
    sqrt.setEnabled(false);plus.setEnabled(false);minus.setEnabled(false);
   dot.setEnabled(false);equal.setEnabled(false);
    }
    
    String calculate(String s){
    char[] arr = s.toCharArray();
      String operand1 = "";String operand2 = "";String operator = "";
      double result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
            if(operator.isEmpty()){
               operand1 += arr[i];
            }else{
               operand2 += arr[i];
    }}
      if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
            operator += arr[i];
         }
      }

        switch (operator) {
            case "+":
                result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
                break;
            case "-":
                result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
                break;
            case "/":          
                result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
                break;
            default:
                result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
                break;
        }
      return operand1 + operator + operand2 + "=" +result;
   }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculatrice calculatrice = new Calculatrice();
    }

   
    
}
