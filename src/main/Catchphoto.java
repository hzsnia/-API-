package main;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Catchphoto extends JFrame implements MouseListener,MouseMotionListener{

/*	class Background extends JPanel {
		Image background;
		void setBackground() {
			background = screencatch();
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			this.setSize(d.width,d.height);
			setOpaque(true);
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0,this.getWidth(), this.getHeight(), this);
			}
	}
	
	Image screencatch() {
		Image screen = null;

		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

		try {
			screen = (new Robot()).createScreenCapture(new Rectangle(0,0,d.width, d.height));
		} catch (AWTException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		return screen;
	}  */
	

	
	public Catchphoto() {
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(d.width,d.height);
		this.setUndecorated(true);  //�ޱ߿�ȫ��
		//Background background = new Background();
		//this.add(background);
		this.setOpacity(0.65f);
		setVisible(true);
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO �Զ����ɵķ������
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO �Զ����ɵķ������
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �Զ����ɵķ������
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɵķ������
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �Զ����ɵķ������
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɵķ������
	}
	

}
