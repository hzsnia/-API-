package main;

public class Setting {
	
	SettingFrame sf;
	
	String fromlang;
	String tolang;
	
	String APIname;
	String Baiduid;
	String Baidusk;
	
	String temp = null;
	
	boolean baidu;
	
	void getFromlang() { 
		temp = sf.Դ����ѡ��.getSelectedItem().toString();
		switch(temp) {
		case "�Զ�ʶ��" :
			fromlang = "auto";break;
		case "Ӣ��" :
			fromlang = "en";break;
		default :
			fromlang = "auto";break;
		}
	}
	
	void getTolang() {
		temp = sf.Ŀ������ѡ��.getSelectedItem().toString();
		switch(temp) {
		case "��������" :
			tolang = "zh";break;
		default :
			tolang = "zh";break;
		}
	}
	
	void getBaiduid() {
		Baiduid = sf.BaiduID.getText();
	}
	
	void getBaidusk() {
		Baidusk = sf.BaiduKey.getText();
	}
	
	void save() {
		getFromlang();
		getTolang();
		getBaiduid();
		getBaidusk();
	}
	
	public Setting(SettingFrame mysf) {
		sf = mysf;
		save();
	}


}
