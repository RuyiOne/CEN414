/**
 * Auto Generated Java Class.
 */
import java.awt.*;
import java.awt.event.*;  

//public class LabelExample extends Frame implements ActionListener{  
public class PracticeClass2 {

  
  //JButton
public void PracticeClass1(){  
  Frame f=new Frame();
  Button b=new Button("click me");  
b.setBounds(30,100,80,30);// setting button position  
f.add(b);//adding button into frame  
f.setSize(300,300);//frame size 300 width and 300 height  
f.setLayout(null);//no layout manager  
f.setVisible(true);//now frame will be visible, by default not visible  
}

  
  public static void main(String[] args) { 
    PracticeClass2 p =new PracticeClass2();
    p.PracticeClass1();
  }
  
}