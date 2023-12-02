package book.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginView {

	
	
	LoginView(JFrame GuiFrame){

	JPanel panel = new JPanel();
	panel.setBounds(0,0,400,500);
	panel.setVisible(true);
	panel.setLayout(null);
	GuiFrame.add(panel);

	JLabel logLab = new JLabel("BIO PORTAL");
	logLab.setBounds(80,60,280,30);
	Font logFont = new Font("Cooper Black", Font.BOLD, 30);
	logLab.setFont(logFont);
	panel.add(logLab);

	JLabel idLab = new JLabel("ID NUMBER:");
	idLab.setBounds(60,110,280,30);
	panel.add(idLab);

	TextField idText,passText;

	idText = new TextField("");
	idText.setBounds(60,140,280,30);
	panel.add(idText);

	JLabel passLab = new JLabel("PASSWORD:");
	passLab.setBounds(60,200,280,30);
	panel.add(passLab);

	passText = new TextField("");
	passText.setBounds(60,230,280,30);
	panel.add(passText);

	JButton logBtn = new JButton ("LOGIN");
	logBtn.setBounds(60,300,280,40);
	panel.add(logBtn);

	
	}
}