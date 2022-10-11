package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ImageOption extends JFrame{
	ImageOption(){
//		MyFrame2x2 mf = new MyFrame2x2();
		
		//super("프레임 배열");
		JPanel jPanel = new JPanel();
		JButton imgArr = new JButton("이미지 붙이기(4*1)");
		JButton imgArr2 = new JButton("이미지 붙이기(2*2)");
		JButton ImgGrey = new JButton(" 흑백변환");
		JButton PageNxt = new JButton("다음 단계로 이동");
		
		//버튼의 위치와 크기
		setBounds(360,225,1200,630);
		imgArr.setBounds(520, 120, 250, 45);
		imgArr2.setBounds(520, 185, 250, 45);
		ImgGrey.setBounds(520, 120, 250, 45);
		PageNxt.setBounds(520, 185, 250, 45);
		
		
	 	Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
	        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
	        
        //이미지 합치기 4x1
	        imgArr.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						BufferedImage image1 = ImageIO.read(new File("src/image/test01.jpg"));
						BufferedImage image2 = ImageIO.read(new File("src/image/test01.jpg"));
						BufferedImage image3 = ImageIO.read(new File("src/image/test01.jpg"));
						BufferedImage image4 = ImageIO.read(new File("src/image/test01.jpg"));
//						System.out.println(mf.link1.getText());
						
						int width = Math.max(image1.getWidth(), image2.getWidth());
						int height = image1.getHeight() + image2.getHeight() + image3.getHeight() + image4.getHeight();
					   
						BufferedImage mergedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
					   
						Graphics2D graphics = (Graphics2D)mergedImage.getGraphics();
					    
						graphics.setBackground(Color.WHITE);
						graphics.drawImage(image1, 0, 0, null);
						graphics.drawImage(image2, 0, image1.getHeight()+40, null);
						graphics.drawImage(image3, 0, image1.getHeight() + image2.getHeight()+80, null);
						graphics.drawImage(image4, 0, image1.getHeight() + image2.getHeight()+image3.getHeight()+120, null);
					   
						ImageIO.write(mergedImage, "PNG", new File("F:/ge17.png"));
					   
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						System.out.println("출력이 안됨");
					}
					
					
				}
			});
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
					   
						ImageIO.write(mergedImage, "PNG", new File("C:/ge18.png"));
					   
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						System.out.println("출력이 안됨");
					}
					
				}
			});
	        
	        //흑백사진 만들기 이벤트
	        ImgGrey.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					BufferedImage image = null;
					try {
						image = ImageIO.read(new File("src/img/test03.jpg"));
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
						ImageIO.write(image, "png", new File("output.png"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					System.out.println("변환완료.");
				}
			});
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        add(jPanel);
	        jPanel.add(imgArr2);
	        jPanel.add(imgArr);
	        jPanel.add(ImgGrey);
			
	}
	
	
}
