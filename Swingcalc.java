import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Swingcalc implements ActionListener{
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    JTextField t1,t2,t3;
    JLabel l1,l2;
    Swingcalc(){
         f=new JFrame("Listener");
         t1=new JTextField("");
         t2=new JTextField("");
         t3=new JTextField("");
         b1=new JButton("Add");
         b2=new JButton("Sub");
         b3=new JButton("Mul");
         b4=new JButton("Div");
         l1=new JLabel();
         l2=new JLabel();
    }
    public void awt1(){
        f.setLayout(new GridLayout(3,2));
        f.setVisible(true);
        f.setSize(500,500);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l1);
        f.add(l2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.pack();
    }
    public void actionPerformed(ActionEvent ae){
        String s=new String(ae.getActionCommand());
        l1.setText(s);
        if((s).equals("Add")){
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            Integer c=a+b;
            t3.setText(c.toString());
        }
        else if((s).equals("Sub")){
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            Integer c=a-b;
            t3.setText(c.toString());
        }
        else if((s).equals("Mul")){
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            Integer c=a*b;
            t3.setText(c.toString());
        }
        else if((s).equals("Div")){
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            Integer c=a/b;
            t3.setText(c.toString());
        }
    }
    public static void main(String[] args){
        Swingcalc a=new Swingcalc();
        a.awt1();
    }
}
