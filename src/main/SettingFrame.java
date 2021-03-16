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
	JComboBox 源语言选择;
	JComboBox 目标语言选择;
	JTextField BaiduID;
	Setting Setting;



	/**
	 * Create the frame.
	 */
	public SettingFrame() {
		setTitle("设置");
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
		BaiduID.setText("请输入百度翻译id");
		BaiduID.setBounds(117, 37, 340, 21);
		contentPane.add(BaiduID);
		BaiduID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u767E\u5EA6\u7FFB\u8BD1Key\uFF1A");
		lblNewLabel_1.setBounds(20, 75, 87, 15);
		contentPane.add(lblNewLabel_1);
		
		BaiduKey = new JTextField();
		BaiduKey.setText("请输入key");
		BaiduKey.setBounds(117, 75, 340, 21);
		contentPane.add(BaiduKey);
		BaiduKey.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("启用Baidu翻译");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(44, 105, 127, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2 = new JLabel("源语言：");
		lblNewLabel_2.setBounds(20, 570, 58, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("目标语言：");
		lblNewLabel_3.setBounds(192, 570, 68, 15);
		contentPane.add(lblNewLabel_3);
		
		JButton 应用 = new JButton("应用");
		应用.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Setting.save();
			}
		});
		应用.setBounds(246, 634, 97, 23);
		contentPane.add(应用);
		
		JButton 保存 = new JButton("关闭");
		保存.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		保存.setBounds(360, 634, 97, 23);
		contentPane.add(保存);
		
		源语言选择 = new JComboBox();
		源语言选择.setModel(new DefaultComboBoxModel(new String[] {"自动识别", "英语"}));
		源语言选择.setBounds(73, 566, 75, 23);
		contentPane.add(源语言选择);
		
		目标语言选择 = new JComboBox();
		目标语言选择.setModel(new DefaultComboBoxModel(new String[] {"简体中文"}));
		目标语言选择.setBounds(258, 566, 75, 23);
		contentPane.add(目标语言选择);
	}
	
	void 同步() {
		BaiduKey.setText(Setting.Baidusk);
		BaiduID.setText(Setting.Baiduid);
		switch(Setting.fromlang) {
		case "auto" :
			源语言选择.setSelectedItem("自动识别");break;
		case "en" :
			源语言选择.setSelectedItem("英语");break;
		}
		switch(Setting.tolang) {
		case "zh" :
			目标语言选择.setSelectedItem("简体中文");break;
		}
	}
}
