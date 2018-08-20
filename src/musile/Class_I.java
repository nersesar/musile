package musile ;

public class Class_I {

	public static void main(String[] args) {

		
	    System.out.println("NAME:    LASTNAME:   Phone_number:    Age:   "); // These is just some printout .
	    System.out.println("");
	  
	    method("mike");                                         
	    method("hayk");         // Here we are searching for some names , and we are useing "method" method .
	    method("alik");         
	    method("valod");        // If  "Valod" is not in list .
	    
	    // The last 3 lines is about printing out data that we entered in "method" method .
	    /* In these program we have created "Stydrnt" class ,and use it for creating 
	     * an independent objects like "mike" , "hayk" , "alik" in "method" method , and after all we set 
	     * the characteristics of  objects , and print it out . 
	     */
	   
	    
	    Cube m1=new Cube();                   // Here we use constructor by default here ,name the object "m1" , from "Cube" class .
		Cube m2=new Cube(10,10,10);           // Also we use constructor  ,for seting  some variables in "m2" object.
		
		System.out.println(m2.V());           //We use a "V()" method from "Cube" class . 
		System.out.println(m1.V());           
		
		
		
		gg object1 =new gg();                             // If our method is just public "nonstatic" we should apply to some 
		object1.somethingelse("Hello world nonstatic ");  // object for accessing the method that we are what in class .
		                                                  // The class name is "gg" .  
		
		
		gg.something("Hello world static");   // Because we declared  that our method is static , therefore we access it 
		                                      // directly from the class which we call "gg" .
		
	
		gg.variable1=1090;                    // If variable is declared as static we can access it 
		System.out.println(gg.variable1);     // directly from the class which we call "gg" .
		                                      // Or by creating some instance .
	/*	gg X2 =new gg();
		X2.variable1=100;
		System.out.println(X2.variable1); */
		
		Cube2 Z1 =new Cube2();
		System.out.println(Z1.Hello());
		Cube2 Z2 =new Cube2();
		System.out.println(Z2.Hello());    
		Cube2 Z3 =new Cube2();
		System.out.println(Z3.Hello());
		
		System.out.println(Cube2.Hello());
		
	
		priv m3 = new priv();
        m3.setName("Hambal");
		m3.setM(100);
		System.out.println(m3.getName()+ "    "+ m3.getM());
		
		
		
		
		// Here we trying to use basics of  inheritance .
		
		Cube4 Rectangel = new Cube4();      // Here we create 2 object buy 2 separate classes          
		Cube5 Triangel = new Cube5();       // (Cube4 and Cube5) , and that 2 classes are 
		                                    //  extended by class "Cube3" . 
		Rectangel.set_value(10,10);         // Here we use extended method "set_value", and 
		Triangel.set_value(100,100);        // set values for objects .
		
		System.out.println("Rectangel area ="+Rectangel.area()); // At both have created area() 
		System.out.println("Triangel  area ="+Triangel.area());  // methods which is returning 
		                                                         // area of our "object" .
		
	
		
		
		
		
		
		
		
		
		
	    
	public static void method(String name  )  {
		
		Stydrnt mike = new Stydrnt();  // Declare mike as object.
		Stydrnt hayk = new Stydrnt();  // Declare hayk as object.
		Stydrnt alik = new Stydrnt();  // Declare alik as object.

		mike.setAge(25);	
		hayk.setAge(45);               // Here we set the ages.
		alik.setAge(32);
		
	    mike.setPhone_number(347323232);
		hayk.setPhone_number(665487489);  // Here we set the phone numbers .
		alik.setPhone_number(154484936);
		
		mike.setName("MIKE");
		hayk.setName("HAYK");            // Here we set the names.
		alik.setName("Alik");

		mike.setLastname("MATEVOSYAN");
		hayk.setLastname("HARUTUNYAN");  // Here we set the lastnames.
		alik.setLastname("GRIGORYAN");
		
		switch(name){
		case "mike" :
	    System.out.println(mike.getName()+"     "+mike.getLastname()+"  "+mike.getPhone_number()+"        "+mike.getAge());
	                    break;
		case "hayk" :
	    System.out.println(hayk.getName()+"     "+hayk.getLastname()+"  "+hayk.getPhone_number()+"        "+hayk.getAge());
	                    break;
		case "alik":
	    System.out.println(alik.getName()+"     "+alik.getLastname()+"   "+alik.getPhone_number()+"        "+alik.getAge());
		                break;
		default :
			System.out.println("  There is no " +name +" name  in list ");
			
		}
	}
	
	

	
	
	
	

}











