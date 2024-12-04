package methodoverloading;

class calculatorusingmethodoverloading {

		int add(int a,int b) {
			return a+b;
		}
		int add(int a,int b, int c) {
			return a+b+c;
		}
		float add(int a,float b) {
			return a+b;
			
		}
		float add(float a,float b) {
			return a+b;
			
		}

		  public static void main(String[] args) {
			int i=1,j=2,k=4;
			float l=1.0f,m=4.0f,o=5.0f;
			
					
			calculatorusingmethodoverloading c=new calculatorusingmethodoverloading();
			System.out.println(c.add(i,j,k));
			System.out.println(c.add(i, j));
			System.out.println(c.add(i, m));
			System.out.println(c.add(l, m));
		  }
}


