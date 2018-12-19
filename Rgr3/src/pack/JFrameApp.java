package pack;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrameApp extends JFrame {

	public JFrameApp()
	 {
	 	//Создаем окно нашего приложения, указываем его размеры
	 	setBounds(100, 100, 267, 438);
		//добавляем в него стандартные кнопки (свернуть, закрыть, развернуть на весь экран
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	//делаем окно не масштабируемым  
	 	setResizable(false);
	 	//Указываем строку которая отображается в заголовке окна
	 	setTitle("Calculator Kireev, Le, Abybakir");
	 	//Создаем панель на которой будем размещать все наши кнопки
	 	JPanelApp panelApp = new JPanelApp();
	 	//добавлем панель в окно
	 	getContentPane().add( panelApp);
	 	//говорим что нужно показать окно нашего приложения
	 	setVisible(true);
	 }

}