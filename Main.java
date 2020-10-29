import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
  class Main {
    public static void main(String[] args)
    {
      JCalcFrame cFrame = new JCalcFrame();
      cFrame.setTitle("Add two number");
      cFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      cFrame.setSize(250,200);
      cFrame.setVisible(true);
    }
  }
