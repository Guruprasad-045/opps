package polymorphism;

public class planesobject {
	public static void main(String[] args) {
		cargoplane c=new cargoplane();
		passengerplane p=new passengerplane();
		plane ref;
		ref=c;
		ref.takeoff();
		
		ref.fly();
		ref.land();
		((cargoplane)ref).carrycargo();
		
		ref=p;
		ref.takeoff();
		ref.fly();
		ref.land();
;			((passengerplane)ref).carrypassenger();
	}
	
		

}
