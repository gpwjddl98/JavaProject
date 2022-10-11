package main;

import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Startpage{
	

	public static void main(String[] args){
		Frame f = new Frame();
		
		f.setBounds(360,225, 1200, 680);
		f.setTitle("인생네컷");
		
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}//종료버튼
		});
		
		Thread_Image ti = new Thread_Image(f);
		Thread t = new Thread(ti);
		t.start();

		
		
		
		
		
	}//main
}
