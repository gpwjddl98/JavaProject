package main;



import java.awt.Frame;


public class Thread_Image implements Runnable{
	
	Frame f;
	
	public Thread_Image(Frame f) {
		this.f =f;
		
	}
	
	

	@Override
	public void run() {

		int num = 1;
		
		Page1 p1 = new Page1(f);
		Page2 p2 = new Page2(f);
		Page3 p3 = new Page3(f);
		

		
		while(p1.exitThread&&p2.exitThread&&p3.exitThread) {
			
			
			
			try {
				f.removeAll();
				
			
			switch(num++) {
				
				
				case 1: 
					p1 = new Page1(f);
					num = 2;
					
				break;
					
				case 2:
					p2 = new Page2(f);
					num = 3;
					
				break;
				
				case 3:
					p3 = new Page3(f);
					num = 1;
					
				break;
			
			}//switch
			
			Thread.sleep(3000);
			
			} catch (InterruptedException e) {
				
				
			}//catch
		}//while	
	}//run

}
