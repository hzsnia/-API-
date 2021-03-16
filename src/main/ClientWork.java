package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program {

	MainFrame MainFrame;
	Setting Setting;
	String line;
	String message = "hello world";
	
	void Baidu() {
		String[] topy = new String[] {"python","src\\py\\Baidu.py",this.message,Setting.fromlang,Setting.tolang,Setting.Baiduid,Setting.Baidusk};
		try {

			Process proc = Runtime.getRuntime().exec(topy);
			BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			line = in.readLine();
			
			MainFrame.文本区.setText(line);
			
			in.close();
			proc.waitFor();
		} catch (IOException | InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
}

public class ClientWork {
	public static void main(String a[]) {
		init();
		
	}
	
	static void init() {
		Program pro = new Program();
		SettingFrame SF = new SettingFrame();
		Setting Setting = new Setting(SF);
		MainFrame MF = new MainFrame();
		MF.sf = SF;
		SF.Setting = Setting;
		pro.MainFrame = MF;
		pro.Setting = Setting;
		MF.pro = pro;
	}
}