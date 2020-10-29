// File name: CtoF.java
// The program gets two numbers from the user and displays the result
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCalcFrame extends JFrame implements ActionListener
{
  FlowLayout flow = new FlowLayout();

  JLabel num1 = new JLabel("Enter Farenheit degree:      ");
  JTextField number1 = new JTextField(6);

  JButton calcButton = new JButton("Calculate temperature (°C)");
  JButton exitButton = new JButton("Exit");
  JButton reset = new JButton("Reset");

  JLabel blankSpaces1 = new JLabel("                 ");
  JLabel blankSpaces2 = new JLabel("                                          ");
  JLabel result = new JLabel("The total is ");
  JLabel sum = new JLabel("");

  public JCalcFrame()
  {
    Container con = getContentPane();

    con.setLayout(flow);// places components in a row

    con.add(num1);

    con.add(number1);

    con.add(calcButton);
  
    con.add(blankSpaces1);

    con.add(result);
    
    con.add(sum);

    con.add(blankSpaces2);

    con.add(exitButton);

    con.add(reset);  

    calcButton.addActionListener(this);
    exitButton.addActionListener(this);
    reset.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
     Object source = e.getSource();
     if(source == calcButton)
     {
        String num1 = number1.getText();

        double n1 = Double.parseDouble(num1);

        double total = (5/9) * (n1 - 32);
        // we need to convert the data type of the total to String
        String output = "" + total;//we should convert the 
        sum.setText(output);
      }
      else
      if(source == reset)
      {
        sum.setText("");
        number1.setText("");
      }
      else
          {
            // if the user clicks on the Exit button (source is Exit button)
            System.exit(0);
          }
   }// end actionPerformed
}// end JCalcFrame

