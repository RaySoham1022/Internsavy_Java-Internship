import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Basic_Calculator extends JFrame implements ActionListener
{    
   JButton plusbutton,minusbutton,mulbutton,divbutton,equalbutton,cancelbutton; 
   JButton b[]=new JButton[10];
    int i,r,n1,n2;
    JTextField res;
    char op; 
   public Basic_Calculator()
  {
     super("Soham's Internsavy Calulator");
      setLayout(new BorderLayout());
      JPanel p=new JPanel();
      p.setLayout(new GridLayout(4,4));
      for(int i=0;i<=9;i++)
      {
        b[i]=new JButton(i+"");
        p.add(b[i]);
        b[i].addActionListener(this);
      }
      plusbutton=new JButton("+");
      p.add(plusbutton);
      plusbutton.addActionListener(this);
 
      minusbutton=new JButton("-");
      p.add(minusbutton);
      minusbutton.addActionListener(this);
 
      mulbutton=new JButton("*");
      p.add(mulbutton);
      mulbutton.addActionListener(this);
 
      divbutton=new JButton("/");
      p.add(divbutton);
      divbutton.addActionListener(this);
 
      equalbutton=new JButton("=");
      p.add(equalbutton);
      equalbutton.addActionListener(this);
 
      cancelbutton=new JButton("C");
      p.add(cancelbutton);
      cancelbutton.addActionListener(this);
 
      res=new JTextField(10);
      Font bigFont = res.getFont().deriveFont(Font.PLAIN, 70f);
      res.setFont(bigFont);
      add(p,BorderLayout.CENTER);
      add(res,BorderLayout.NORTH);
      setVisible(true);
      setSize(400,350);
     }
public void actionPerformed(ActionEvent ae)
{
  JButton pressedbutton=(JButton)ae.getSource();
    if(pressedbutton==cancelbutton)
    {
     r=n1=n2=0;
     res.setText("");
    }
    else
        if(pressedbutton==equalbutton)
        {
         n2=Integer.parseInt(res.getText());
         eval();
         res.setText(""+r);
        }
 
        else
        {
          boolean opf=false;
          if(pressedbutton==plusbutton)
            { op='+';
              opf=true;
            }
          if(pressedbutton==minusbutton)
            { op='-';opf=true;}
          if(pressedbutton==mulbutton)
            { op='*';opf=true;}
          if(pressedbutton==divbutton)
            { op='/';opf=true;}
    
          if(opf==false)
          {
           for(i=0;i<10;i++)
           {
            if(pressedbutton==b[i])
                {
                String t=res.getText();
                t+=i;
                    res.setText(t);
            }
           }
          }
          else
          {
                n1=Integer.parseInt(res.getText());
                res.setText("");
          }
        }
}
int eval()
{
    switch(op)
    {
    case '+':   r=n1+n2;  break;
    case '-':    r=n1-n2;   break;
    case '*':    r=n1*n2; break;
    case '/':    r=n1/n2; break;
 
    }
    return 0;
}
 
  public static void main(String arg[])
  {
      new Basic_Calculator();
   }
}

