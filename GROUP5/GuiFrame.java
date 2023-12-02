package book.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiFrame extends JFrame{

	public  GuiFrame(){

	new LoginView(this);

	setTitle("BIOMETRICS ATTENDACE");
	setSize(400,500);
	setResizable(false);
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

	}
}