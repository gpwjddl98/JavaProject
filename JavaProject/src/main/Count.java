package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Count extends JPanel {

	
	public Count (JFrame f,Container c) {
			
		
		c.setBounds(0, 0, 1200, 630);
		c.setSize(1200, 630);
		c.setLayout(null);
		c.setBackground(Color.PINK);
	
		JLabel ct = new JLabel();
						
		JButton one = new JButton("1��");
		JButton two = new JButton("2��");
		JButton three = new JButton("3��");
		JButton four = new JButton("4��");
		
		
		one.setBounds(200, 100, 300, 200);
		two.setBounds(700, 100, 300, 200);
		three.setBounds(200, 360, 300, 200);
		four.setBounds(700, 360, 300, 200);
		ct.setBounds(0, 50, 1200, 630);
		
		ct.setText("��� ����");
		ct.setFont(new Font("�������",Font.BOLD,40));
		ct.setHorizontalAlignment(JLabel.CENTER);
		ct.setVerticalAlignment(JLabel.TOP);
		
		one.setFont(new Font("�������",Font.BOLD,30));
		two.setFont(new Font("�������",Font.BOLD,30));
		three.setFont(new Font("�������",Font.BOLD,30));
		four.setFont(new Font("�������",Font.BOLD,30));
		
		one.setBackground(Color.PINK);
		two.setBackground(Color.PINK);
		three.setBackground(Color.PINK);
		four.setBackground(Color.PINK);
		
		one.setOpaque(false);
		two.setOpaque(false);
		three.setOpaque(false);
		four.setOpaque(false);
		
		one.setBorderPainted(false);
		two.setBorderPainted(false);
		three.setBorderPainted(false);
		four.setBorderPainted(false);
		
		one.setFocusable(false);
		two.setFocusable(false);
		three.setFocusable(false);
		four.setFocusable(false);
		
		
		one.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "1�� �μ��Ͻðڽ��ϱ�?","Ȯ��",JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.CLOSED_OPTION) {
				}else if(result == JOptionPane.YES_OPTION) {
					c.removeAll();
					c.setVisible(false);
					new Pay(f,c);
				}else {
					
				}
				
			}
		});
		two.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "2�� �μ��Ͻðڽ��ϱ�?","Ȯ��",JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.CLOSED_OPTION) {
					
				}else if(result == JOptionPane.YES_OPTION) {
					c.removeAll();
					c.setVisible(false);
					new Pay(f,c);
				}else {
					
				}
				
			}
		});
		three.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "3�� �μ��Ͻðڽ��ϱ�?","Ȯ��",JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.CLOSED_OPTION) {
					
				}else if(result == JOptionPane.YES_OPTION) {
					c.removeAll();
					c.setVisible(false);
					new Pay(f,c);
				}else {
					
				}
				
			}
		});
		four.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "4�� �μ��Ͻðڽ��ϱ�?","Ȯ��",JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.CLOSED_OPTION) {
					
				}else if(result == JOptionPane.YES_OPTION) {
					c.removeAll();
					c.setVisible(false);
					new Pay(f,c);
				}else {
					
				}
				
			}
		});		
		
//		c.add(this);
		c.add(one);
		c.add(two);
		c.add(three);
		c.add(four);
		c.add(ct);


		c.setVisible(true);
	}

} 