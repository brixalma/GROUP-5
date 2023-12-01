import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class enroll{

enroll(){
JFrame frame = new JFrame();
JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

JPanel panelText = new JPanel(new FlowLayout(FlowLayout.LEFT));

JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));

JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));

JTextField textField1 = new JTextField(20);
JTextField textField2 = new JTextField(20);
JTextField textField3 = new JTextField(20);



JButton cancel = new JButton("Cancel");
JButton next = new JButton("Next");

cancel.setBounds(80, 500, 100, 30);
next.setBounds(200, 500, 100, 30);

frame.setTitle("Cite Application");
frame.setSize(330, 600);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);

panel.setBounds(90, 0, 330, 20);
panel1.setBounds(30, 100, 330, 20);
panel2.setBounds(30, 150, 330, 20);

JLabel label = new JLabel ("BIOMETRICS PORTAL");
JLabel idNumber = new JLabel("ID NUMBER");
JLabel password = new JLabel("PASSWORD");


panel.add(label);
panel1.add(textField1);
panel2.add(textField2);

panel1.add(idNumber);
panel2.add(password);


frame.add(panel);

frame.add(panel1);
frame.add(panel2);


frame.add(cancel);
frame.add(next);

frame.setVisible(true);


}
public static void main(String args[]){
new enroll();
}
}
