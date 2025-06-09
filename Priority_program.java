package javaprograms;

public class Priority_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread lowPriorityThread=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("low priority thread"+ i);
			}
		});
		Thread highPriorityThread=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("high priority thread"+ i);
			}
		});
		lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
		highPriorityThread.setPriority(Thread.MAX_PRIORITY);
		
		lowPriorityThread.start();
		highPriorityThread.start();		

	}

}