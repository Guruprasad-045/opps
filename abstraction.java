package abstraction;

abstract class Bird {
	 abstract void eat();
	 abstract void fly();
}
  abstract class eagle extends Bird{
	@Override
	void fly() {
		System.out.println("eagle is flies height");
		
	}
}
  class serpenteagle extends eagle{
	  @Override
	void eat() {
		System.out.println("serpenteagle hunts over mountains and eats");
		
	}
  }
  public class abstraction {
		public static void main(String[] args) {
			serpenteagle se=new serpenteagle();
			se.fly();
			se.eat();
		}
  }


	 
