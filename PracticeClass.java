/**
 * Auto Generated Java Class.
 */
import java.awt.*;
import java.awt.event.*;  

//public class LabelExample extends Frame implements ActionListener{  
public class PracticeClass extends Frame {

  
  //JButton
public void PracticeClass1(){  
//Frame f=new Frame(); 
Button b=new Button("click me");  
b.setBounds(30,100,80,30);// setting button position  
add(b);//adding button into frame  
setSize(300,300);//frame size 300 width and 300 height  
setLayout(null);//no layout manager  
setVisible(true);//now frame will be visible, by default not visible  
}


public void PracticeClass2(){  
 
    //Frame f= new Frame("Label Example");  
    Label l1,l2;  
    l1=new Label("First Label.");  
    l1.setBounds(50,100, 100,30);  
    l2=new Label("Second Label.");  
    l2.setBounds(50,150, 100,30);
    //Text field
    TextField t1,t2;  
    t1=new TextField("Welcome to Javatpoint.");  
    t1.setBounds(50,100, 200,30);  
    t2=new TextField("AWT Tutorial");  
    t2.setBounds(50,150, 200,30); 
    
    //checkbox
    Checkbox checkbox1 = new Checkbox("C++");  
    checkbox1.setBounds(100,100, 50,50);  
    Checkbox checkbox2 = new Checkbox("Java", true);  
    checkbox2.setBounds(100,150, 50,50);  
    
    
    f.add(l1); f.add(l2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true) 
}  

  public static void main(String[] args) { 
    PracticeClass p = new PracticeClass();
    p.PracticeClass1();
    //p.PracticeClass2();
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
