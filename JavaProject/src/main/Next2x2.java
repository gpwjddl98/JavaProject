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
import javax.swing.JPanel;

public class Next2x2 extends JPanel{
	
	Next2x2(JFrame f, Container c) {
//		MyFrame2x2 mf = new MyFrame2x2();
		
		c.setLayout(null);
		c.setSize(1200, 630); // 프레임 크기
		c.setBackground(Color.PINK);
		
		
		
		
		JButton imgArr2 = new JButton("컬러(2*2)");
		JButton ImgGrey22 = new JButton(" 흑백 (2*2)");
		imgArr2.setBounds(50, 185, 250, 45);
		ImgGrey22.setBounds(50, 120, 250, 45);
		
		
		c.add(imgArr2);
        c.add(ImgGrey22);
        c.setVisible(true);
		
		//이미지 합치기 2*2
        imgArr2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					BufferedImage image1 = ImageIO.read(new File("src/image/test01.jpg"));
					BufferedImage image2 = ImageIO.read(new File("src/image/test01.jpg"));
					BufferedImage image3 = ImageIO.read(new File("src/image/test01.jpg"));
					BufferedImage image4 = ImageIO.read(new File("src/image/test01.jpg"));
					
					int width = image1.getWidth() + image2.getWidth();
					int height = image1.getHeight()+image2.getHeight();
				   
					BufferedImage mergedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
				   
					Graphics2D graphics = (Graphics2D)mergedImage.getGraphics();
				    
					graphics.setBackground(Color.WHITE);
					graphics.drawImage(image1, 0, 0, null);
					graphics.drawImage(image2, 0, image1.getHeight()+40, null);
					graphics.drawImage(image3, image1.getWidth()+40, 0 , null);
					graphics.drawImage(image4, image2.getWidth()+40 ,image3.getHeight()+40, null);
				   
					ImageIO.write(mergedImage, "PNG", new File("C:/22.png"));
				   
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
		
		
		//흑백사진 만들기 이벤트 2*2
        ImgGrey22.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BufferedImage image = null;
				try {
					image = ImageIO.read(new File("src/image/test01.jpg"));
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
					ImageIO.write(image, "png", new File("src/image/test01grey.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					BufferedImage image1 = ImageIO.read(new File("src/image/test01.jpg"));
					BufferedImage image2 = ImageIO.read(new File("src/image/test01.jpg"));
					BufferedImage image3 = ImageIO.read(new File("src/image/test01.jpg"));
					BufferedImage image4 = ImageIO.read(new File("src/image/test01.jpg"));
					
					int width = image1.getWidth() + image2.getWidth();
					int height = image1.getHeight()+image2.getHeight();
				   
					BufferedImage mergedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
				   
					Graphics2D graphics = (Graphics2D)mergedImage.getGraphics();
				    
					graphics.setBackground(Color.WHITE);
					graphics.drawImage(image1, 0, 0, null);
					graphics.drawImage(image2, 0, image1.getHeight()+40, null);
					graphics.drawImage(image3, image1.getWidth()+40, 0 , null);
					graphics.drawImage(image4, image2.getWidth()+40 ,image3.getHeight()+40, null);
				   
					ImageIO.write(mergedImage, "PNG", new File("C:/grey22.png"));
				   
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
		
//        f.setLayout(null);
        
        

		
	}


}
