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
	JButton ���ð�ť;
	JTextArea �ı���;
	Catchphoto catchphoto;
	Program pro;


	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("��������API��ͼƬʶ���뷭���ʵ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1086, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		���ð�ť = new JButton("����");
		���ð�ť.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sf.setVisible(true);
				sf.ͬ��();
			}
		});
		���ð�ť.setBounds(980, 10, 63, 23);
		contentPane.add(���ð�ť);
		
		�ı��� = new JTextArea();
		�ı���.setBounds(25, 47, 1037, 206);
		contentPane.add(�ı���);
		
		JButton ���� = new JButton("����");
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro.Baidu();
			}
		});
		����.setBounds(22, 10, 68, 23);
		contentPane.add(����);
		
		JButton ��ͼѡ�� = new JButton("\u9009\u533A");
		��ͼѡ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				catchphoto = new Catchphoto();
			}
		});
		��ͼѡ��.setBounds(100, 10, 68, 23);
		contentPane.add(��ͼѡ��);
		
		setVisible(true);
		
	}
}
