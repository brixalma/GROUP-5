package book.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeView {

	
	
	HomeView(JFrame GuiFrame){

	JPanel panel = new JPanel();
	panel.setBounds(0,0,400,500);
	panel.setVisible(true);
	panel.setLayout(null);
	panel.setBackground(new Color(17, 109, 129));
	GuiFrame.add(panel);

	JLabel attendanceLab = new JLabel("ATTENDANCE");
	attendanceLab.setBounds(105,60,280,30);
	Font attendanceFont = new Font("Cooper Black", Font.BOLD, 30);
	attendanceLab.setFont(attendanceFont);
	panel.add(attendanceLab);

	JButton adminBtn = new JButton ("ADMIN VIEW");
	adminBtn.setBounds(53,150,280,40);
	panel.add(adminBtn);

	JButton studentBtn = new JButton ("STUDENT");
	studentBtn.setBounds(53,240,280,40);
	panel.add(studentBtn);

	

	JButton regBtn = new JButton ("REGISTER");
	regBtn.setBounds(53,330,280,40);
	panel.add(regBtn);

	
	}
}