package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Qr extends JPanel {
	
	public Qr(Frame f, Container c) {
		
		c.setBounds(0, 0, 1200, 630);
		c.setLayout(null);
		c.setBackground(Color.pink);
		
		ImageIcon qr = new ImageIcon("src/image/qr.png");
		Image qr_img = qr.getImage();
		Image qr_img_ud = qr_img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon new_qr = new ImageIcon(qr_img_ud);
						
		JLabel qrj = new JLabel(new_qr);
		JLabel qt = new JLabel();
		JLabel tfl = new JLabel();
		JLabel tfl2 = new JLabel();
		TextField tf = new TextField(30);
		TextField tf2 = new TextField(13);
						
		qrj.setBounds(200, 200, 200, 200);
		qrj.setHorizontalAlignment(JLabel.CENTER);
		
		tf.setBounds(500,250,300,20);
		tf2.setBounds(500,350,300,20);
		
		tfl.setBounds(-77, 220, 1200, 630);
		tfl.setText("이메일");
		tfl.setFont(new Font("맑은고딕",Font.BOLD,15));
		tfl.setHorizontalAlignment(JLabel.CENTER);
		tfl.setVerticalAlignment(JLabel.TOP);
		
		tfl2.setBounds(-77, 320, 1200, 630);
		tfl2.setText("연락처");
		tfl2.setFont(new Font("맑은고딕",Font.BOLD,15));
		tfl2.setHorizontalAlignment(JLabel.CENTER);
		tfl2.setVerticalAlignment(JLabel.TOP);
		
		
		qt.setText("사진 전송");
		qt.setFont(new Font("맑은고딕",Font.BOLD,40));
		qt.setHorizontalAlignment(JLabel.CENTER);
		qt.setVerticalAlignment(JLabel.TOP);
		qt.setBounds(0,50,1200,630);
		
		qrj.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "전송하시겠습니까?","확인",JOptionPane.YES_NO_OPTION);
				String mail = tf.getText();
				String num = tf2.getText();
				
				
				if(result == JOptionPane.CLOSED_OPTION) {
					
				}else if(result == JOptionPane.YES_OPTION) {
					if(mail.isEmpty()) {
						JOptionPane.showMessageDialog(null, "이메일을 입력하세요", "확인",JOptionPane.ERROR_MESSAGE);
					} else if(num.isEmpty()) {
						JOptionPane.showMessageDialog(null, "연락처를 입력하세요", "확인",JOptionPane.ERROR_MESSAGE);
					} 
					else {
						JOptionPane.showMessageDialog(null, "전송 완료!", "확인",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
				}
				
			}
		});
		
		c.add(tf);
		c.add(tf2);
		c.add(qrj);
		c.add(qt);
		c.add(tfl);
		c.add(tfl2);
		
		c.add(this);
		c.setVisible(true);
	}
}
