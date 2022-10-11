package main;

import java.awt.Color; 
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame2x2 extends JFrame {

	JFrame f;
	JPanel p1, p2;
	JButton btnUp1, btnUp2, btnUp3, btnUp4, btnSet, btnOk;
	JTextField link1, link2, link3, link4;
	JButton pic1, pic2, pic3, pic4;
	JLabel label1, label2;
	Font f1;
	Container c = getContentPane();
	
	public MyFrame2x2() {
		
		setSize(1200, 630); // ������ ũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Select2x2");
		setResizable(false); //������ �������� ������ ������ ���´�.
		
		c.setLayout(new GridLayout(1, 2)); // ȭ�� ������
		
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Dimension screenSize = tk.getScreenSize(); // ȭ�� ũ�� ���ϱ�
		
		System.out.println(screenSize);
		
		setLocation(screenSize.width/2-600, screenSize.height/2-315); // ����� ȭ���� ���߾ӿ� ��ġ
		
		// �г�1 : ������ ���̴� ��
		p1 = new JPanel();
		p1.setLayout(null);
		
		// �۾��߰� -> ��������
		f1 = new Font("���� ���", Font.BOLD, 35);
		label1 = new JLabel("��������");
		label1.setFont(f1);
		label1.setForeground(Color.WHITE);
		label1.setBounds(15, 10, 160, 80);
				
		// ��ư���� ������ �� Ʋ�� ����
		pic1 = new JButton("����1");
		pic1.setBounds(100, 80, 200, 200);
				
		pic2 = new JButton("����2");
		pic2.setBounds(300, 80, 200, 200);
				
		pic3 = new JButton("����3");
		pic3.setBounds(100, 280, 200, 200);
				
		pic4 = new JButton("����4");
		pic4.setBounds(300, 280, 200, 200);
				
		btnOk = new JButton("�Ϸ�(OK)");
		btnOk.setBounds(250, 520, 100, 50);
				
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.removeAll();
				c.setVisible(true);
				new Next2x2(f,c);
			}
		});
		p1.add(label1);
		p1.add(pic1);
		p1.add(pic2);
		p1.add(pic3);
		p1.add(pic4);
		p1.add(btnOk);
		
		// �г�2 : ������ �����ϴ� ��
		p2 = new JPanel();
		p2.setLayout(null); // �г��� ��ġ�����ڸ� �������� ����
		
		// �۾��߰� -> ��������
		label2 = new JLabel("��������");
		label2.setFont(f1);
		label2.setForeground(Color.WHITE);
		label2.setBounds(15, 10, 160, 80);
		
		btnUp1 = new JButton("��������1");
		btnUp1.setBounds(450, 80, 100, 50);
		link1 = new JTextField();
		link1.setBounds(100, 80, 350, 50);
		
		btnUp2 = new JButton("��������2");
		btnUp2.setBounds(450, 180, 100, 50);
		link2 = new JTextField();
		link2.setBounds(100, 180, 350, 50);
		
		btnUp3 = new JButton("��������3");
		btnUp3.setBounds(450, 280, 100, 50);
		link3 = new JTextField();
		link3.setBounds(100, 280, 350, 50);
		
		btnUp4 = new JButton("��������4");
		btnUp4.setBounds(450, 380, 100, 50);
		link4 = new JTextField();
		link4.setBounds(100, 380, 350, 50);
		
		btnSet = new JButton("�ٽü���(RESET)");
		btnSet.setBounds(150, 500, 300, 50);
		
		// ��ư - �׼Ǹ�����
		btnUp1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				FileDialog fd = new FileDialog(f, "�ҷ�����", FileDialog.LOAD);
				fd.setVisible(true); // ���Ͽ���
				
				String filePath = fd.getDirectory() + fd.getFile(); // ���� �ּ� �о����
				link1.setText(filePath); // textfield�� �ּ� ��½�Ű��
				
				// ��ũ �����ͼ� �а� pic1�� ���� ���
				String n1 = link1.getText();
				System.out.println(n1);
				ImageIcon ii1 = new ImageIcon(n1);
				Image img1 = ii1.getImage();
				Image changeImg1 = img1.getScaledInstance(210, 200, Image.SCALE_SMOOTH);
				ImageIcon changeIcon1 = new ImageIcon(changeImg1);
				pic1.setIcon(changeIcon1);
			}
			
		});
		
		btnUp2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				FileDialog fd = new FileDialog(f, "�ҷ�����", FileDialog.LOAD);
				fd.setVisible(true);
				
				String filePath = fd.getDirectory() + fd.getFile();
				link2.setText(filePath);
				
				String n2 = link2.getText();
				System.out.println(n2);
				ImageIcon ii2 = new ImageIcon(n2);
				Image img2 = ii2.getImage();
				Image changeImg2 = img2.getScaledInstance(210, 200, Image.SCALE_SMOOTH);
				ImageIcon changeIcon2 = new ImageIcon(changeImg2);
				pic2.setIcon(changeIcon2);
			}
			
		});
		
		btnUp3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				FileDialog fd = new FileDialog(f, "�ҷ�����", FileDialog.LOAD);
				fd.setVisible(true);
				
				String filePath = fd.getDirectory() + fd.getFile();
				link3.setText(filePath);
				
				String n3 = link3.getText();
				System.out.println(n3);
				ImageIcon ii3 = new ImageIcon(n3);
				Image img3 = ii3.getImage();
				Image changeImg3 = img3.getScaledInstance(210, 200, Image.SCALE_SMOOTH);
				ImageIcon changeIcon3 = new ImageIcon(changeImg3);
				pic3.setIcon(changeIcon3);
			}
			
		});
		
		btnUp4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				FileDialog fd = new FileDialog(f, "�ҷ�����", FileDialog.LOAD);
				fd.setVisible(true);
				
				String filePath = fd.getDirectory() + fd.getFile();
				link4.setText(filePath);
				
				String n4 = link4.getText();
				System.out.println(n4);
				ImageIcon ii4 = new ImageIcon(n4);
				Image img4 = ii4.getImage();
				Image changeImg4 = img4.getScaledInstance(210, 200, Image.SCALE_SMOOTH);
				ImageIcon changeIcon4 = new ImageIcon(changeImg4);
				pic4.setIcon(changeIcon4);
			}
			
		});
		
		btnSet.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				link1.setText("");
				link2.setText("");
				link3.setText("");
				link4.setText(""); // textfield ���½�Ű��
				
				pic1.setIcon(null);
				pic2.setIcon(null);
				pic3.setIcon(null);
				pic4.setIcon(null); // pic�� �ִ� ������ ���½�Ű��
				// reset
			}
			
		});
		
		// ���� ĥ�ϱ�
//		Color color = new Color(252, 141, 161);
		p1.setBackground(Color.PINK);
		p2.setBackground(Color.PINK);
		
		p2.add(label2);
		p2.add(btnUp1); // �г�2�� ���ε��ư1 �߰�
		p2.add(link1);
		p2.add(btnUp2); // �г�2�� ���ε��ư2 �߰�
		p2.add(link2);
		p2.add(btnUp3); // �г�2�� ���ε��ư3 �߰�
		p2.add(link3);
		p2.add(btnUp4); // �г�2�� ���ε��ư4 �߰�
		p2.add(link4);
		p2.add(btnSet); // �г�2�� ���¹�ư �߰�
		
		c.add(p1);
		c.add(p2);
		
		setVisible(true);
	}
	
}
