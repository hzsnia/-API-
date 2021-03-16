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
		temp = sf.源语言选择.getSelectedItem().toString();
		switch(temp) {
		case "自动识别" :
			fromlang = "auto";break;
		case "英语" :
			fromlang = "en";break;
		default :
			fromlang = "auto";break;
		}
	}
	
	void getTolang() {
		temp = sf.目标语言选择.getSelectedItem().toString();
		switch(temp) {
		case "简体中文" :
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
