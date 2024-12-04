package inheritance;


	/
	class Animal {
	    void eat() {
	        System.out.println("This animal eats food.");
	    }

	    void sleep() {
	        System.out.println("This animal sleeps.");
	    }
	}

	
	class Dog extends Animal{
		@Override
		void eat() {
			// TODO Auto-generated method stub
	System.out.println("dog eats bones");
		}
	    void bark() {
	        System.out.println("The dog barks.");
	    }
	}

	
	class Puppy extends Dog {
		@Override
		void eat() {
			// TODO Auto-generated 
			System.out.println("puppy drinks milk");
		}
	    void weep() {
	        System.out.println("The puppy weeps.");
	    }
	}

	
	class Cat extends Animal {
		@Override
		void eat() {
			// TODO Auto-generated method stub
			System.out.println("cat eats fish");
		}
	    void meow() {
	        System.out.println("The cat meows.");
	    }
	}

	
	public class FullInheritance {
	    public static void main(String[] args) {
	        
	      
	        Dog dog = new Dog();
	        dog.eat();
	        dog.sleep();
	        dog.bark(); 
	        

	        Puppy puppy = new Puppy();
	        puppy.eat();
	        puppy.sleep();
	        puppy.weep();  

	        Cat cat = new Cat();
	        cat.eat();   
	        cat.sleep(); 
	        cat.meow();  

	        
	    }
	}



