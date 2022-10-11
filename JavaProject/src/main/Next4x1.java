package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Next4x1 extends JFrame{
	public Next4x1(JFrame f, Container c) {
		// TODO Auto-generated constructor stub
		
		
		
		c.setSize(1200, 630);
		c.setBackground(Color.PINK);
		
		//버튼 이름 및 위치 크기
		JButton imgArr = new JButton("컬러(4*1)");
		JButton imgGrey41 = new JButton("흑백(4*1)");
		imgArr.setBounds(50, 185, 250, 45);
		imgGrey41.setBounds(50, 120, 250, 45);
		
		//컬러4x1
        imgArr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					BufferedImage image1 = ImageIO.read(new File("src/img/test01.jpg"));
					BufferedImage image2 = ImageIO.read(new File("src/img/test01.jpg"));
					BufferedImage image3 = ImageIO.read(new File("src/img/test01.jpg"));
					BufferedImage image4 = ImageIO.read(new File("src/img/test01.jpg"));
					
					int width = Math.max(image1.getWidth(), image2.getWidth());
					int height = image1.getHeight() + image2.getHeight() + image3.getHeight() + image4.getHeight();
				   
					BufferedImage mergedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
				   
					Graphics2D graphics = (Graphics2D)mergedImage.getGraphics();
				    
					graphics.setBackground(Color.WHITE);
					graphics.drawImage(image1, 0, 0, null);
					graphics.drawImage(image2, 0, image1.getHeight()+40, null);
					graphics.drawImage(image3, 0, image1.getHeight() + image2.getHeight()+80, null);
					graphics.drawImage(image4, 0, image1.getHeight() + image2.getHeight()+image3.getHeight()+120, null);
				   
					ImageIO.write(mergedImage, "PNG", new File("F:/41.png"));
				   
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("출력이 안됨");
				}
				
				c.removeAll();
				c.setVisible(false);
				new Count(f,c);
				
			}
		});
		
		
		//흑백 4*1
        imgGrey41.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BufferedImage image = null;
				try {
					image = ImageIO.read(new File("src/img/test01.jpg"));
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				for(int y = 0; y < image.getHeight(); y++) {
				   for(int x = 0; x < image.getWidth(); x++) {
				       Color color1 = new Color(image.getRGB(x, y));

				       int Y = (int) (0.2126 * color1.getRed() + 0.7152 * color1.getGreen() + 0.0722 * color1.getBlue());
				       image.setRGB(x, y, new Color(Y, Y, Y).getRGB());
				   }
				}

				try {
					ImageIO.write(image, "png", new File("src/img/test01grey.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					BufferedImage image1 = ImageIO.read(new File("src/img/test01grey.jpg"));
					BufferedImage image2 = ImageIO.read(new File("src/img/test01grey.jpg"));
					BufferedImage image3 = ImageIO.read(new File("src/img/test01grey.jpg"));
					BufferedImage image4 = ImageIO.read(new File("src/img/test01grey.jpg"));
					
					int width = Math.max(image1.getWidth(), image2.getWidth());
					int height = image1.getHeight() + image2.getHeight() + image3.getHeight() + image4.getHeight();
				   
					BufferedImage mergedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
				   
					Graphics2D graphics = (Graphics2D)mergedImage.getGraphics();
				    
					graphics.setBackground(Color.WHITE);
					graphics.drawImage(image1, 0, 0, null);
					graphics.drawImage(image2, 0, image1.getHeight()+40, null);
					graphics.drawImage(image3, 0, image1.getHeight() + image2.getHeight()+80, null);
					graphics.drawImage(image4, 0, image1.getHeight() + image2.getHeight()+image3.getHeight()+120, null);
				   
					ImageIO.write(mergedImage, "PNG", new File("F:/grey41.png"));
				   
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("출력이 안됨");
				}
				
				c.removeAll();
				c.setVisible(false);
				new Count(f,c);
				
				System.out.println("변환완료.");
			}
		});
		
		
		c.add(imgGrey41);
		c.add(imgArr);
		
		
		c.setVisible(true);
	}
}
