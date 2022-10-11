package main;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Page3 extends Panel {
	
	
	
	boolean exitThread = true;
	Frame f;
	
	public Page3(Frame f) {
		// TODO Auto-generated constructor stub
		ImageIcon ic =new ImageIcon ("src/image/Image3.png");
		JLabel jl = new JLabel(ic);
		this.setSize(1200, 630); //이미지
		
		Button btn = new Button("시작하기");
		btn.setBounds(0, 630, 1200, 50);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.removeAll();
				exitThread = false;
				new Startpage_2(f);
			}
		});
		f.add(btn);
		
		this.add(jl);
		f.add(this);
		f.setVisible(true);
	}


}
