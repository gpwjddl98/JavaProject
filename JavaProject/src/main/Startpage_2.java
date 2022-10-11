package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Startpage_2{

	public Startpage_2(Frame f) {
		
		f.setBounds(360,225, 1200, 630);
		f.setTitle("인생네컷");
		f.setBackground(Color . pink);
		
		ImageIcon ic =new ImageIcon ("src/image/col1.png");
		JLabel jl = new JLabel(ic);
		jl.setBounds(50,30,500,528);
		
		ImageIcon ir =new ImageIcon ("src/image/row.png");
		JLabel j2 = new JLabel(ir);
		j2.setBounds(620,150,547,290);
		
		Button col = new Button("4x1 프레임");
		Button row = new Button("2x2 프레임");
		col.setBounds(50, 550, 500, 50);
		row.setBounds(645, 550, 500, 50);
		
		col.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setVisible(false);
				new MyFrame4x1();
			}
		});
		row.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setVisible(false);
				new MyFrame2x2();
			}
		});
		
		
		f.add(col);
		f.add(row);
		f.add(j2);
		f.add(jl);
		
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}//종료버튼
		});
	}//public Startpage_2(Frame f)
}

