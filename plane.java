package polymorphism;



class plane {
	void takeoff() {
		System.out.println("plane is taking off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane is landig");
	}
	}


class cargoplane extends plane{
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("cargoplane is flying low height");
	}
	void carrycargo() {
		System.out.println("cargoplane is carrying cargo");
	}
}
class passengerplane extends plane{
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("passengerplane is flying medium height");
	}
	void carrypassenger() {
		System.out.println("passengerplane is carring passangers");
	}
}


	


