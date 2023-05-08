
public class Car {
	private String model;
	private String[] features;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String model,String...features)
	{
		this.model=model;
		this.features=features;
	}
	public void specs() {
		System.out.println("specs" +model);
		for(String f:features) {
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
		//String[] af= {};
		Car c=new Car("alto","keyless","AC","power window");
		c.specs();
	}
	}

