package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pay extends JPanel {

	public Pay (JFrame f, Container c) {
		c.setBounds(0, 0, 1200, 630);
		c.setLayout(null);
		c.setBackground(Color.PINK);
		
		
		JButton prev = new JButton("◀");
		JLabel pl = new JLabel();
		JLabel cashl = new JLabel();
		JLabel cardl = new JLabel();
		
		ImageIcon cash = new ImageIcon("src/image/cash.jpg");
		ImageIcon card = new ImageIcon("src/image/card.png");
		
		Image cash_img = cash.getImage();
		Image card_img = card.getImage();
				
		Image cash_img_ud = cash_img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		Image card_img_ud = card_img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
				
		ImageIcon new_cash = new ImageIcon(cash_img_ud);
		ImageIcon new_card = new ImageIcon(card_img_ud);
				
		JLabel cashj = new JLabel(new_cash);
		JLabel cardj = new JLabel(new_card);
				
		cashj.setBounds(280, 180, 200, 200);
		cardj.setBounds(730, 180, 200, 200);
		
		prev.setBounds(20, 295, 100, 50);
		prev.setOpaque(false);
		prev.setBorderPainted(false);
		prev.setFocusable(false);
		prev.setBackground(Color.PINK);
		
		cashj.setHorizontalAlignment(JLabel.CENTER);
		cardj.setHorizontalAlignment(JLabel.CENTER);
		
		pl.setBounds(0, 50, 1200, 630);
		cashl.setBounds(315, -180, 1200, 630);
		cardl.setBounds(765, -180, 1200, 630);
		
		pl.setText("결제 수단");
		pl.setFont(new Font("맑은고딕",Font.BOLD,40));
		pl.setHorizontalAlignment(JLabel.CENTER);
		pl.setVerticalAlignment(JLabel.TOP);
		
		cashl.setText("현금 결제");
		cashl.setFont(new Font("맑은고딕",Font.BOLD,30));
		cashl.setVerticalAlignment(JLabel.BOTTOM);
		
		cardl.setText("카드 결제");
		cardl.setFont(new Font("맑은고딕",Font.BOLD,30));
		cardl.setVerticalAlignment(JLabel.BOTTOM);
		
		prev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "이전 화면으로 가시겠습니까?","확인",JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.CLOSED_OPTION) {
				}else if(result == JOptionPane.YES_OPTION) {
					
					c.removeAll();
					c.setVisible(false);
					new Count(f,c);
					
				}else {
					
				}
				
			}
		});
		
		cashj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "현금 결제 하시겠습니까?","결제수단",JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.CLOSED_OPTION) {
				}else if(result == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "결제 완료!", "확인",JOptionPane.INFORMATION_MESSAGE);
					c.removeAll();
					c.setVisible(false);
					new Qr(f,c);
					
				}else {
					
				}
				
			}
		});
		
		cardj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "카드 결제 하시겠습니까?","결제수단",JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.CLOSED_OPTION) {
				}else if(result == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "결제 완료!", "확인",JOptionPane.INFORMATION_MESSAGE);
					c.removeAll();
					c.setVisible(false);
					new Qr(f,c);

				}else {
					
				}
				
			}
		});
		
		c.add(prev);
		c.add(cashj);
		c.add(cardj);
		c.add(pl);
		c.add(cashl);
		c.add(cardl);
		
//		jPanel.add(this);
		c.setVisible(true);
		
	}
	
}
