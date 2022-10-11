package main;

import java.awt.Color;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.*;
import java.awt.event.*;




public class FirstFrame {
	
	public static void main(String[] args) throws IOException {
		JFrame f = new JFrame();
		f.setBounds(10, 10, 800, 800);
		f.setLayout(null);
		
		
		JButton ImgGrey = new JButton(" 흑백변환");
		JButton PageNxt = new JButton("다음 단계로 이동");
		ImgGrey.setBounds(520, 120, 250, 45);
		PageNxt.setBounds(520, 185, 250, 45);
		
		
		
		
//		ImgGrey.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				BufferedImage image = null;
//				try {
//					image = ImageIO.read(new File("src/img/test03.jpg"));
//				} catch (IOException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}
//
//				for(int y = 0; y < image.getHeight(); y++) {
//				   for(int x = 0; x < image.getWidth(); x++) {
//				       Color color1 = new Color(image.getRGB(x, y));
//
//				       int Y = (int) (0.2126 * color1.getRed() + 0.7152 * color1.getGreen() + 0.0722 * color1.getBlue());
//				       image.setRGB(x, y, new Color(Y, Y, Y).getRGB());
//				   }
//				}
//
//				try {
//					ImageIO.write(image, "png", new File("output.png"));
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				
//				System.out.println("변환완료.");
//			}
//		});
		
		
		PageNxt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ImageOption();
				f.setVisible(false);
			}
		});
		
		
		
		
		
	
		
		
		f.setVisible(true);
		//f.add(ImgGrey);
		f.add(PageNxt);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
	