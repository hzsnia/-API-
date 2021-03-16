package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	SettingFrame sf;
	JButton 设置按钮;
	JTextArea 文本区;
	Catchphoto catchphoto;
	Program pro;


	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("基于线上API的图片识别与翻译的实现");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1086, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		设置按钮 = new JButton("设置");
		设置按钮.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sf.setVisible(true);
				sf.同步();
			}
		});
		设置按钮.setBounds(980, 10, 63, 23);
		contentPane.add(设置按钮);
		
		文本区 = new JTextArea();
		文本区.setBounds(25, 47, 1037, 206);
		contentPane.add(文本区);
		
		JButton 翻译 = new JButton("翻译");
		翻译.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro.Baidu();
			}
		});
		翻译.setBounds(22, 10, 68, 23);
		contentPane.add(翻译);
		
		JButton 截图选区 = new JButton("\u9009\u533A");
		截图选区.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				catchphoto = new Catchphoto();
			}
		});
		截图选区.setBounds(100, 10, 68, 23);
		contentPane.add(截图选区);
		
		setVisible(true);
		
	}
}
