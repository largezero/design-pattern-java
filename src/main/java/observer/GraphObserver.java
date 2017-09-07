package observer;

public class GraphObserver implements Observer {
	public void update(NumberGenerator generator) {
		// TODO Auto-generated method stub
		System.out.print("GraphObserver:");
		int cnt = generator.getNumber();
		for(int i=0,j=cnt ; i<j ; i++){
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
