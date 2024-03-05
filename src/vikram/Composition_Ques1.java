/*Create classes Engine and Car. Use composition to model the relationship between Car and Engine, 
  where Car has a field of type Engine. Implement methods to start the engine and drive the car.
 */





package vikram;


class Engine {
	
	public boolean isStart;
	
	public void start(boolean isStart) {
		if(!isStart) {
			isStart=true;
			System.out.println("Engine is running");
		}else {
			System.out.println("Engine is already running");
		}
	}
	
	public void stop(boolean isStart) {
		if(isStart) {
			isStart=false;
			System.out.println("Engine has stopped now.");
		}else {
			System.out.println("Engine is already stopped");
		}
	}
	
	
}


class Car {
	
private String carName;
private Engine engine;

public Car(String carName, Engine engine) {
	this.carName=carName;
	this.engine=engine;
}


	
	
}








public class Composition_Ques1 {

	public static void main(String[] args) {
		
		
		
		
	}
	
}
