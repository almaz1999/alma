package pack;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrameApp extends JFrame {

	public JFrameApp()
	 {
	 	//������� ���� ������ ����������, ��������� ��� �������
	 	setBounds(100, 100, 267, 438);
		//��������� � ���� ����������� ������ (��������, �������, ���������� �� ���� �����
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	//������ ���� �� ��������������  
	 	setResizable(false);
	 	//��������� ������ ������� ������������ � ��������� ����
	 	setTitle("Calculator Kireev, Le, Abybakir");
	 	//������� ������ �� ������� ����� ��������� ��� ���� ������
	 	JPanelApp panelApp = new JPanelApp();
	 	//�������� ������ � ����
	 	getContentPane().add( panelApp);
	 	//������� ��� ����� �������� ���� ������ ����������
	 	setVisible(true);
	 }

}