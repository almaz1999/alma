package pack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPanelApp extends JPanel
{
	//создаем перемнную типа текстовое поле для результата
JTextField txt1 = null;
/*res, res1 переменные для операндов, используемых для расчета умножения, деления, сложения, вычитания*/
double res = 0;
double res1 = 0;
/*op будет хранить операцию (+-/*) в виде строки*/
 String op = "";
 
 public JPanelApp()
 {
//устанавливаем фон
 	setBackground(SystemColor.text);
 	//try отлавливает исключения(ошибки) во вложенном в него ко-де
 try
 {
	 /*не используем компоновку элементов, расположение элемен-тов зададим явно*/
 setLayout(null);
 /*создаем объект типа текстовое поле для результата*/
 final TextField txt1 = new TextField();
 /*задаем координаты и размеры*/
 txt1.setBounds(10, 10, 222, 25);
 
 /*Кнопка "0"*/
 /*создаем объект типа кнопка*/
 JButton b0 = new JButton("0");
 /*задаем координаты и размеры*/
 b0.setBounds(10, 119, 48, 25);
 
 /*далее кнопки создаются аналогично кнопке "0"*/
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
 /*класс Font для использования шрифтов */
 Font bigFont = new Font("serif", Font.BOLD, 22);
 /*устанавливаем шрифт bigFont для текста, отображаемого в кноп-ке*/
 bRes.setFont(bigFont);
 
 /*далее класс Font использыется аналогично*/
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
 
 
 /*Надпись для поясняющего текста */
 JLabel label_1 = new JLabel("Количество детей до 18 лет");
 label_1.setFont(new Font("Arial", Font.PLAIN, 13));
 label_1.setBounds(10, 250, 222, 14);

 /*Переключатель для выбора*/

 
 /*устанавливаем начальное значение флажка true*/

 
 /*JSpinner элемент для ввода чисел*/
 JSpinner Ds = new JSpinner();
 Ds.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
 Ds.setBounds(10, 195, 104, 30);
 

 
 JSpinner CHILDs = new JSpinner();
 CHILDs.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
 CHILDs.setBounds(10, 295, 104, 30);
 
 /*кнопка расчета налога*/
 JButton TAXb = new JButton("Налог");
 
 TAXb.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent arg0) {
 	}
 });
 TAXb.setBounds(157, 295, 75, 30);
 
 JLabel label_2 = new JLabel("Доход физического лица за 1 месяц");
 label_2.setFont(new Font("Arial", Font.PLAIN, 13));
 label_2.setBounds(10, 160, 222, 14);
 
 JSpinner PROCs = new JSpinner();
 PROCs.setModel(new SpinnerNumberModel(1, 1, 100, 1));
 PROCs.setBounds(128, 350, 104, 30);
 
 JLabel label = new JLabel("Процент налога");
 label.setFont(new Font("Arial", Font.PLAIN, 13));
 label.setBounds(10, 356, 111, 14);
 
 /*добавляем созданные объекты в панель*/
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
 
 //устанавливаем слушателя на кнопку b1"1"
 b1.addActionListener(new ActionListener()
 {
	 //реализуем функцию, связанную с событием нажатия на кноп-ку
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
	 //добавляем 1 в txt1
 txt1.setText(txt1.getText() + 1);
 /*если res (первый операнд) равен 0, то конвертируем содержимое txt1 в Double и записываем в res*/
 if (res==0) {
 res = Double.valueOf(txt1.getText());
 } else {
	 /*если res (первый операнд) не равен 0, то конвертируем со-держимое txt1 в Double и записываем в res1*/
 res1 = Double.valueOf(txt1.getText());
 }
 }
 });
 
 /*аналогичным образом устанавливаем слушателей на следующие кнопки и реализуем реакцию на событие нажатие на кнопку*/
 
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
 
 /*кнопки операторов*+/-*/
 bPlus.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg1)
 {
	 /*записываем в res конвертированное в Double содержимое txt1*/
 res = Double.valueOf(txt1.getText());
 /*отчищаем txt1*/
 txt1.setText("");
 /*в переменную операторов заносим соответствующий знак (+) */
 op = "+";
 }
 });
 /*аналогичным образом устанавливаем слушателей на следующие кнопки и реализуем реакцию на событие нажатие на кнопку*/
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
 /*Слушатель кнопки "="*/
 bRes.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg0)
 {
	 /* конвертируем res и res1 в Double, заносим в num, num1 со-ответственно*/
 double num = Double.valueOf(res);
 double num1 = Double.valueOf(res1);
 String strOp = op;
 /*создем обьект mc класса MetodCalc для расчета действия*/
 MetodCalc mc = new MetodCalc();
 /*вызываем у mc метод calc и передаем ему оператора и операнды*/
 /*результат работы метода ковертируем в String и заносим в пере-менныю strRes*/
 String strRes = String.valueOf(mc.calc(num, strOp, num1 ));
 /*выводим результат в txt1*/
 txt1.setText(strRes);
 }
 });
 /*Слушатель кнопки "Налог"*/
 TAXb.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent arg0)
 { //получаем необходимые для расчета налога значения из соответ-ствующих областей
	 //конвертируем значения в double
	 //заносим значения в соответствующие переменные
	 double d=  ((SpinnerNumberModel) Ds.getModel()).getNumber().intValue();
	 double child =  Double.valueOf(CHILDs.getValue().toString());
	 double proc=  Double.valueOf(PROCs.getValue().toString());
	 /*создем обьект tax класса tax для расчета налога*/
	 tax tax = new tax();
	 /*вызываем у tax метод calcTax и передаем ему необходимые значения*/
	 /*результат работы метода конвертируем в String и заносим в переменную strRes*/
	 double t=tax.calcTax(d, child, proc);
	 String strRes = Double.toString(t);
	 txt1.setText(strRes);
	 }
 });}
 //обрабатываем исключения
 catch (ArithmeticException exception)
 {
	 //выводим сообщения об ошибках
 System.out.println("something went wrong"); }}
}
