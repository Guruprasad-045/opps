package interfaces;

interface interfacing {
	void add();
	void sub();

class mycalculator implements interfacing{
	@Override
	public void add() {
	int a=10;
	int b=23;
	System.out.println(a+b);
}
	@Override
	public void sub() {
		int a=12;
		int b=5;
		System.out.println(a-b);
		
	}
}

	public static void main(String[] args) {
		
	mycalculator mc=new mycalculator();
		 
		 mc.add();
		 mc.sub();
		 
	}
}




	


