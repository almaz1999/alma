package pack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPanelApp extends JPanel
{
	//������� ��������� ���� ��������� ���� ��� ����������
JTextField txt1 = null;
/*res, res1 ���������� ��� ���������, ������������ ��� ������� ���������, �������, ��������, ���������*/
double res = 0;
double res1 = 0;
/*op ����� ������� �������� (+-/*) � ���� ������*/
 String op = "";
 
 public JPanelApp()
 {
//������������� ���
 	setBackground(SystemColor.text);
 	//try ����������� ����������(������) �� ��������� � ���� ��-��
 try
 {
	 /*�� ���������� ���������� ���������, ������������ ������-��� ������� ����*/
 setLayout(null);
 /*������� ������ ���� ��������� ���� ��� ����������*/
 final TextField txt1 = new TextField();
 /*������ ���������� � �������*/
 txt1.setBounds(10, 10, 222, 25);
 
 /*������ "0"*/
 /*������� ������ ���� ������*/
 JButton b0 = new JButton("0");
 /*������ ���������� � �������*/
 b0.setBounds(10, 119, 48, 25);
 
 /*����� ������ ��������� ���������� ������ "0"*/
 JButton b1 = new JButton("1");
 b1.setBounds(10, 92, 48, 25);
 
 JButton b2 = new JButton("2");
 b2.setBounds(59, 92, 48, 25);
 
 JButton b3 = new JButton("3");
 b3.setBounds(108, 92, 48, 25);
 
 JButton b4 = new JButton("4");
 b4.setBounds(10, 66, 48, 25);
 
 JButton b5 = new JButton("5");
 b5.setBounds(59, 66, 48, 25);
 
 JButton b6 = new JButton("6");
 b6.setBounds(108, 66, 48, 25);
 
 JButton b7 = new JButton("7");
 b7.setBounds(10, 41, 48, 25);
 
 JButton b8 = new JButton("8");
 b8.setBounds(59, 41, 48, 25);
 
 JButton b9 = new JButton("9");
 b9.setBounds(108, 41, 48, 25);
 
 JButton bRes = new JButton("=");
 bRes.setBounds(59, 119, 97, 25);
 /*����� Font ��� ������������� ������� */
 Font bigFont = new Font("serif", Font.BOLD, 22);
 /*������������� ����� bigFont ��� ������, ������������� � ����-��*/
 bRes.setFont(bigFont);
 
 /*����� ����� Font ������������ ����������*/
 JButton bPlus = new JButton("+");
 bPlus.setBounds(157, 41, 75, 25);
 Font bigFontPlus = new Font("serif", Font.BOLD, 22);
 bPlus.setFont(bigFontPlus);
 
 JButton bMinus = new JButton("-");
 bMinus.setBounds(157, 66, 75, 25);
 Font bigFontMinus = new Font("serif", Font.BOLD, 22);
 bMinus.setFont(bigFontMinus);
 
 JButton bMulti = new JButton("*");
 bMulti.setBounds(157, 92, 75, 25);
 Font bigFontMulti = new Font("serif", Font.BOLD, 22);
 bMulti.setFont(bigFontMulti);
 
 JButton bDivision = new JButton("/");
 bDivision.setBounds(157, 119, 75, 25);
 Font bigFontDivision = new Font("serif", Font.BOLD, 22);
 bDivision.setFont(bigFontDivision);
 
 
 /*������� ��� ����������� ������ */
 JLabel label_1 = new JLabel("���������� ����� �� 18 ���");
 label_1.setFont(new Font("Arial", Font.PLAIN, 13));
 label_1.setBounds(10, 250, 222, 14);

 /*������������� ��� ������*/

 
 /*������������� ��������� �������� ������ true*/

 
 /*JSpinner ������� ��� ����� �����*/
 JSpinner Ds = new JSpinner();
 Ds.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
 Ds.setBounds(10, 195, 104, 30);
 

 
 JSpinner CHILDs = new JSpinner();
 CHILDs.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
 CHILDs.setBounds(10, 295, 104, 30);
 
 /*������ ������� ������*/
 JButton TAXb = new JButton("�����");
 
 TAXb.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent arg0) {
 	}
 });
 TAXb.setBounds(157, 295, 75, 30);
 
 JLabel label_2 = new JLabel("����� ����������� ���� �� 1 �����");
 label_2.setFont(new Font("Arial", Font.PLAIN, 13));
 label_2.setBounds(10, 160, 222, 14);
 
 JSpinner PROCs = new JSpinner();
 PROCs.setModel(new SpinnerNumberModel(1, 1, 100, 1));
 PROCs.setBounds(128, 350, 104, 30);
 
 JLabel label = new JLabel("������� ������");
 label.setFont(new Font("Arial", Font.PLAIN, 13));
 label.setBounds(10, 356, 111, 14);
 
 /*��������� ��������� ������� � ������*/
 add(txt1);
 add(b0);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(b5);
 add(b6);
 add(b7);
 add(b8);
 add(b9);
 add(bRes);
 add(bPlus);
 add(bMinus);
 add(bMulti);
 add(bDivision);
 add(label_1);
 add(Ds);
 add(CHILDs);
 add(TAXb);
 add(label_2);
 add(PROCs);
 add(label);
 
 //������������� ��������� �� ������ b1"1"
 b1.addActionListener(new ActionListener()
 {
	 //��������� �������, ��������� � �������� ������� �� ����-��
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
	 //��������� 1 � txt1
 txt1.setText(txt1.getText() + 1);
 /*���� res (������ �������) ����� 0, �� ������������ ���������� txt1 � Double � ���������� � res*/
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
	 /*���� res (������ �������) �� ����� 0, �� ������������ ��-�������� txt1 � Double � ���������� � res1*/
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 /*����������� ������� ������������� ���������� �� ��������� ������ � ��������� ������� �� ������� ������� �� ������*/
 
 b2.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 txt1.setText(txt1.getText() + 2);
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
 res1 = Double.valueOf(txt1.getText());
 }}});
 
 b3.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 txt1.setText(txt1.getText() + 3);
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 b4.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 txt1.setText(txt1.getText() + 4);
 if (res==0)
 {
 res = Double.valueOf(txt1.getText());
 } else {
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 b5.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 txt1.setText(txt1.getText() + 5);
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 b6.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 txt1.setText(txt1.getText() + 6);
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 b7.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 txt1.setText(txt1.getText() + 7);
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 b8.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 txt1.setText(txt1.getText() + 8);
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 b9.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 txt1.setText(txt1.getText() + 9);
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 b0.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 txt1.setText(txt1.getText() + 0);
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 /*������ ����������*+/-*/
 bPlus.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
	 /*���������� � res ���������������� � Double ���������� txt1*/
 res = Double.valueOf(txt1.getText());
 /*�������� txt1*/
 txt1.setText("");
 /*� ���������� ���������� ������� ��������������� ���� (+) */
 op = "+";
 }
 });
 /*����������� ������� ������������� ���������� �� ��������� ������ � ��������� ������� �� ������� ������� �� ������*/
 bMinus.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 res = Double.valueOf(txt1.getText());
 txt1.setText("");
 op = "-";
 }
 });
 
 bMulti.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 res = Double.valueOf(txt1.getText());
 txt1.setText("");
 op = "*";
 }
 });
 
 bDivision.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
 res = Double.valueOf(txt1.getText());
 txt1.setText("");
 op = "/";
 }
 });
 /*��������� ������ "="*/
 bRes.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg0)
 {
	 /* ������������ res � res1 � Double, ������� � num, num1 ��-������������*/
 double num = Double.valueOf(res);
 double num1 = Double.valueOf(res1);
 String strOp = op;
 /*������ ������ mc ������ MetodCalc ��� ������� ��������*/
 MetodCalc mc = new MetodCalc();
 /*�������� � mc ����� calc � �������� ��� ��������� � ��������*/
 /*��������� ������ ������ ����������� � String � ������� � ����-������ strRes*/
 String strRes = String.valueOf(mc.calc(num, strOp, num1 ));
 /*������� ��������� � txt1*/
 txt1.setText(strRes);
 }
 });
 /*��������� ������ "�����"*/
 TAXb.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg0)
 { //�������� ����������� ��� ������� ������ �������� �� �������-�������� ��������
	 //������������ �������� � double
	 //������� �������� � ��������������� ����������
	 double d=  ((SpinnerNumberModel) Ds.getModel()).getNumber().intValue();
	 double child =  Double.valueOf(CHILDs.getValue().toString());
	 double proc=  Double.valueOf(PROCs.getValue().toString());
	 /*������ ������ tax ������ tax ��� ������� ������*/
	 tax tax = new tax();
	 /*�������� � tax ����� calcTax � �������� ��� ����������� ��������*/
	 /*��������� ������ ������ ������������ � String � ������� � ���������� strRes*/
	 double t=tax.calcTax(d, child, proc);
	 String strRes = Double.toString(t);
	 txt1.setText(strRes);
	 }
 });}
 //������������ ����������
 catch (ArithmeticException exception)
 {
	 //������� ��������� �� �������
 System.out.println("something went wrong"); }}
}
