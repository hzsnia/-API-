package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SettingFrame extends JFrame {

	private JPanel contentPane;
	JTextField BaiduKey;
	JComboBox Դ����ѡ��;
	JComboBox Ŀ������ѡ��;
	JTextField BaiduID;
	Setting Setting;



	/**
	 * Create the frame.
	 */
	public SettingFrame() {
		setTitle("����");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u767E\u5EA6\u7FFB\u8BD1API\uFF1A");
		lblNewLabel.setBounds(20, 40, 87, 15);
		contentPane.add(lblNewLabel);
		
		BaiduID = new JTextField();
		BaiduID.setText("������ٶȷ���id");
		BaiduID.setBounds(117, 37, 340, 21);
		contentPane.add(BaiduID);
		BaiduID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u767E\u5EA6\u7FFB\u8BD1Key\uFF1A");
		lblNewLabel_1.setBounds(20, 75, 87, 15);
		contentPane.add(lblNewLabel_1);
		
		BaiduKey = new JTextField();
		BaiduKey.setText("������key");
		BaiduKey.setBounds(117, 75, 340, 21);
		contentPane.add(BaiduKey);
		BaiduKey.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("����Baidu����");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(44, 105, 127, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2 = new JLabel("Դ���ԣ�");
		lblNewLabel_2.setBounds(20, 570, 58, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ŀ�����ԣ�");
		lblNewLabel_3.setBounds(192, 570, 68, 15);
		contentPane.add(lblNewLabel_3);
		
		JButton Ӧ�� = new JButton("Ӧ��");
		Ӧ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Setting.save();
			}
		});
		Ӧ��.setBounds(246, 634, 97, 23);
		contentPane.add(Ӧ��);
		
		JButton ���� = new JButton("�ر�");
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		����.setBounds(360, 634, 97, 23);
		contentPane.add(����);
		
		Դ����ѡ�� = new JComboBox();
		Դ����ѡ��.setModel(new DefaultComboBoxModel(new String[] {"�Զ�ʶ��", "Ӣ��"}));
		Դ����ѡ��.setBounds(73, 566, 75, 23);
		contentPane.add(Դ����ѡ��);
		
		Ŀ������ѡ�� = new JComboBox();
		Ŀ������ѡ��.setModel(new DefaultComboBoxModel(new String[] {"��������"}));
		Ŀ������ѡ��.setBounds(258, 566, 75, 23);
		contentPane.add(Ŀ������ѡ��);
	}
	
	void ͬ��() {
		BaiduKey.setText(Setting.Baidusk);
		BaiduID.setText(Setting.Baiduid);
		switch(Setting.fromlang) {
		case "auto" :
			Դ����ѡ��.setSelectedItem("�Զ�ʶ��");break;
		case "en" :
			Դ����ѡ��.setSelectedItem("Ӣ��");break;
		}
		switch(Setting.tolang) {
		case "zh" :
			Ŀ������ѡ��.setSelectedItem("��������");break;
		}
	}
}
