

class OS{
	private String name;
	private int size;
	public OS(String name, int size) {
		
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
}
	class charger{
		private String brand;
		private float voltage;
		public charger(String brand, float voltage) {
			
			this.brand = brand;
			this.voltage = voltage;
		
			// TODO Auto-generated constructor stub
		}
		public String getBrand() {
			return brand;
		}
		public float getVoltage() {
			return voltage;
		
	}
}
class Agregationcomposition {
	OS os = new OS("android",512);
	void hasA(charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}

//public class Mobile2{
	public static void main(String[] args) {
		charger c = new charger("vivo",24.5f);
		Agregationcomposition m = new Agregationcomposition();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasA(c);
		m=null;
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	} 
}


