package encapsulation;

class encapsulationexample {

		private int id;
		private String name;
		private long  num;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getNum() {
			return num;
		}
		public void setNum(long num) {
			this.num = num;
		}
}

public class main {

	
	public static void main(String[] args) {

			encapsulationexample c=new encapsulationexample();
			c.setId(1);
			c.setName("guru");
			c.setNum(887665435);
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getNum());
		
	}
}


