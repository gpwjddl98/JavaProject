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
		
		setSize(1200, 630); // 프레임 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Select2x2");
		setResizable(false); //생성된 프레임의 사이즈 변경을 막는다.
		
		c.setLayout(new GridLayout(1, 2)); // 화면 나누기
		
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Dimension screenSize = tk.getScreenSize(); // 화면 크기 구하기
		
		System.out.println(screenSize);
		
		setLocation(screenSize.width/2-600, screenSize.height/2-315); // 사용자 화면의 정중앙에 위치
		
		// 패널1 : 사진이 보이는 곳
		p1 = new JPanel();
		p1.setLayout(null);
		
		// 글씨추가 -> 사진보기
		f1 = new Font("맑은 고딕", Font.BOLD, 35);
		label1 = new JLabel("사진보기");
		label1.setFont(f1);
		label1.setForeground(Color.WHITE);
		label1.setBounds(15, 10, 160, 80);
				
		// 버튼으로 사진이 들어갈 틀을 만듬
		pic1 = new JButton("사진1");
		pic1.setBounds(100, 80, 200, 200);
				
		pic2 = new JButton("사진2");
		pic2.setBounds(300, 80, 200, 200);
				
		pic3 = new JButton("사진3");
		pic3.setBounds(100, 280, 200, 200);
				
		pic4 = new JButton("사진4");
		pic4.setBounds(300, 280, 200, 200);
				
		btnOk = new JButton("완료(OK)");
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
		
		// 패널2 : 사진을 선택하는 곳
		p2 = new JPanel();
		p2.setLayout(null); // 패널의 배치관리자를 지정하지 않음
		
		// 글씨추가 -> 사진선택
		label2 = new JLabel("사진선택");
		label2.setFont(f1);
		label2.setForeground(Color.WHITE);
		label2.setBounds(15, 10, 160, 80);
		
		btnUp1 = new JButton("사진선택1");
		btnUp1.setBounds(450, 80, 100, 50);
		link1 = new JTextField();
		link1.setBounds(100, 80, 350, 50);
		
		btnUp2 = new JButton("사진선택2");
		btnUp2.setBounds(450, 180, 100, 50);
		link2 = new JTextField();
		link2.setBounds(100, 180, 350, 50);
		
		btnUp3 = new JButton("사진선택3");
		btnUp3.setBounds(450, 280, 100, 50);
		link3 = new JTextField();
		link3.setBounds(100, 280, 350, 50);
		
		btnUp4 = new JButton("사진선택4");
		btnUp4.setBounds(450, 380, 100, 50);
		link4 = new JTextField();
		link4.setBounds(100, 380, 350, 50);
		
		btnSet = new JButton("다시선택(RESET)");
		btnSet.setBounds(150, 500, 300, 50);
		
		// 버튼 - 액션리스너
		btnUp1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				FileDialog fd = new FileDialog(f, "불러오기", FileDialog.LOAD);
				fd.setVisible(true); // 파일열기
				
				String filePath = fd.getDirectory() + fd.getFile(); // 파일 주소 읽어오기
				link1.setText(filePath); // textfield에 주소 출력시키기
				
				// 링크 가져와서 읽고 pic1에 사진 출력
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
				
				FileDialog fd = new FileDialog(f, "불러오기", FileDialog.LOAD);
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
				
				FileDialog fd = new FileDialog(f, "불러오기", FileDialog.LOAD);
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
				
				FileDialog fd = new FileDialog(f, "불러오기", FileDialog.LOAD);
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
				link4.setText(""); // textfield 리셋시키기
				
				pic1.setIcon(null);
				pic2.setIcon(null);
				pic3.setIcon(null);
				pic4.setIcon(null); // pic에 있는 사진들 리셋시키기
				// reset
			}
			
		});
		
		// 배경색 칠하기
//		Color color = new Color(252, 141, 161);
		p1.setBackground(Color.PINK);
		p2.setBackground(Color.PINK);
		
		p2.add(label2);
		p2.add(btnUp1); // 패널2에 업로드버튼1 추가
		p2.add(link1);
		p2.add(btnUp2); // 패널2에 업로드버튼2 추가
		p2.add(link2);
		p2.add(btnUp3); // 패널2에 업로드버튼3 추가
		p2.add(link3);
		p2.add(btnUp4); // 패널2에 업로드버튼4 추가
		p2.add(link4);
		p2.add(btnSet); // 패널2에 리셋버튼 추가
		
		c.add(p1);
		c.add(p2);
		
		setVisible(true);
	}
	
}
