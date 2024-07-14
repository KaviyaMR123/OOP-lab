import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Calculator implements ActionListener
{
   JFrame f;
   JTextField tf;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,bdel,
   bclr;
   static double a=0,b=0,result=0;
   static int op=0;
Calculator()
{
   f = new JFrame();
   f.setTitle("Calculator");
   f.setVisible(true);
   f.setLayout(null);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f.setBounds(20,30,300,350);
   f.setResizable(false);
   Font font = new Font("Arial",Font.BOLD,20);
   tf = new JTextField();
   tf.setFont(font);
   tf.setBackground(Color.orange);
   tf.setForeground(Color.red);
   tf.setBounds(40,40,200,50);
   f.add(tf);
   b1=new JButton("1");
   b2=new JButton("2");
   b3=new JButton("3");
   b4=new JButton("4");
   b5=new JButton("5");
   b6=new JButton("6");
   b7=new JButton("7");
   b8=new JButton("8");
   b9=new JButton("9");
   b0=new JButton("0");
   bdot= new JButton(".");
   badd=new JButton("+");
   badd.setFont(font);
   bsub=new JButton(" -");
   bsub.setFont(font);
   bmul=new JButton("*");
   bmul.setFont(font);
   bdiv=new JButton("/");
   bdiv.setFont(font);
   beq=new JButton("=");
   beq.setFont(font);
   bdel=new JButton("Delete");
   bclr=new JButton("clear");
   b7.setBounds(40,100,50,40);
   b8.setBounds(90,100,50,40);
   b9.setBounds(140,100,50,40);
   bdiv.setBounds(190,100,50,40);
   b4.setBounds(40,140,50,40);
   b5.setBounds(90,140,50,40);
   b6.setBounds(140,140,50,40);
   bmul.setBounds(190,140,50,40);
   b1.setBounds(40,180,50,40);
   b2.setBounds(90,180,50,40);
   b3.setBounds(140,180,50,40);
   bsub.setBounds(190,180,50,40);
   bdot.setBounds(40,220,50,40);
   b0.setBounds(90,220,50,40);
   beq.setBounds(140,220,50,40);
   badd.setBounds(190,220,50,40);
   bdel.setBounds(40,260,100,40);
   bclr.setBounds(140,260,100,40);
   f.add(b1);
   f.add(b2);
   f.add(b3);
   f.add(b4);
   f.add(b5);
   f.add(b6);
   f.add(b7);
   f.add(b8);
   f.add(b9);
   f.add(b0);
   f.add(bdot);
   f.add(badd);
   f.add(bsub);
   f.add(bmul);
   f.add(bdiv);
   f.add(beq);
   f.add(bdel);
   f.add(bclr);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);
   b7.addActionListener(this);
   b8.addActionListener(this);
   b9.addActionListener(this);
   b0.addActionListener(this);
   bdot.addActionListener(this);
   badd.addActionListener(this);
   bsub.addActionListener(this);
   bmul.addActionListener(this);
   bdiv.addActionListener(this);
   beq.addActionListener(this);
   bdel.addActionListener(this);
   bclr.addActionListener(this); 
}
  public static void main(String[] args) 
  {
    new Calculator();
  }
public void actionPerformed(ActionEvent e) 
{
if (e.getSource()==b1) 
{
    tf.setText(tf.getText().concat("1"));
}
else if (e.getSource()==b3) 
{
   tf.setText(tf.getText().concat("3"));
}
else if (e.getSource()==b2)
{
   tf.setText(tf.getText().concat("2"));
}
else if (e.getSource()==b4) 
{
   tf.setText(tf.getText().concat("4"));
}
else if (e.getSource()==b5) 
{
    tf.setText(tf.getText().concat("5")); 
}
if (e.getSource()==b6)
{
   tf.setText(tf.getText().concat("6"));
}
if (e.getSource()==b7) 
{
   tf.setText(tf.getText().concat("7")); 
}
if (e.getSource()==b8) 
{
  tf.setText(tf.getText().concat("8"));
}
if (e.getSource()==b9) 
{
  tf.setText(tf.getText().concat("9"));
}
if (e.getSource()==b0)
{
   tf.setText(tf.getText().concat("0")); 
}
if (e.getSource()==bdot) 
{
   tf.setText(tf.getText().concat("."));
}
if (e.getSource() == badd)
{
   a= Double.parseDouble(tf.getText());
   op= 1;
   tf.setText("");
} 
else if (e.getSource() == bsub)
{
   a= Double.parseDouble(tf.getText());
   op= 2;
   tf.setText("");
} 
else if (e.getSource() == bmul)
{
    a = Double.parseDouble(tf.getText());
    op = 3;
    tf.setText("");
}
if (e.getSource() == bdiv) 
{
    a = Double.parseDouble(tf.getText());
    op = 4;
    tf.setText("");
}
if (e.getSource() == bclr)
{
   tf.setText("");
}
if (e.getSource() == bdel) 
{
   String s = tf.getText();
   tf.setText("");
   for (int i = 0; i < s.length() - 1; i++) 
   {
      tf.setText(tf.getText() + s.charAt(i));
   }
}
if (e.getSource() == beq)
{
   int flag = 0;
   double b = Double.parseDouble(tf.getText());
   double result = 0.0;
   switch (op) 
   {
    case 1:
            result = a + b;
            break;
    case 2:
            result = a - b;
            break;
    case 3:
            result = a * b;
            break;
    case 4:
           if (b != 0)
           {
             result = a / b;
           } 
           else
           {
             flag = 1;
             tf.setText("Error");
           }
           break;
    }
if (flag != 1) 
{
    tf.setText(String.valueOf(result));
}
}
}
}
