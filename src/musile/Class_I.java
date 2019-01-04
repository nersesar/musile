package musile ;

import java.util.Scanner;   //# 30 . Recursion in Java .


import java.util.ArrayList; // # 31 .Arraylist in Java .
                            // We imported the library for Array without size .
                            
                             // # 32 . LinkedList in Java .
                             // We imported the library for LinkList .

import java.util.LinkedList;
                             // # 34 . ListIterator in Java .  
                             // We imported for "name.hasnext()" and "name.previous()" methods.
                             //# 35 . HashSet in Java .
import java.util.*;          // For a Hashset .

                             // # 38 .  Create a File and Write in it Using PrintWriter and File class . 
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
                                  // # 39 .  How to Read file using Java .
import java.io.BufferedReader;    // For files .
import java.io.FileReader;        // For reading files .
import java.io.IOException;       // For exceptions .

                                  // # 40 . Using Date & Time + formatting Date using SimpleDateFormat .

import java.util.Date;
import java.text.*;

public class Class_I {

	public static void main( String[] args ) {

		
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
		
		System.out.println("Rectangel area =" + Rectangel.area()); // At both have created area() 
		System.out.println("Triangel  area =" + Triangel.area());  // methods which is returning 
		                                                         // area of our "object" .
		
	
		
		
		
		
		
		
		// # 29 . Java interfaces .
		
		Bank jf = new Bank_1();           // You make an object only by subclasses because the main  
		System.out.println(jf.jerk()) ;    // is interface (Bank()) .
		
		
		
		
		
		
		
		
		
		
		
		
		// # 30 . Recursion in Java .
		System.out.println(factorial(10)) ; // Printing out .
		
		
		
		
		
		
		
		
		
		
		
        // # 31 .Arraylist in Java .
		
		int simple_array[]= new int[6];   // These array only can have 6 integers .
		
		
		ArrayList<Integer> array =new ArrayList<Integer>(5); // We declear the array without size ,
		                                                     // 5 is just initial .	
		array.add(10);                                       // We add numbers in array .  
		array.add(11);
		array.add(12);
		array.add(13);
		array.add(14);
		
		for(Integer x : array)                               // We can use faster method for printing out 
	          System.out.println(x);		
		
	    System.out.println("size of array is="+array.size()); // It's printing out the size of "array" array .
		
	    
	    
	   
	    array.remove(4); 	                                  // We removed the 5th integer of array  
		System.out.println("size of array is="+array.size()); // ,and print out the size and numbers 
		for(Integer x : array)                                // again .
	          System.out.println(x);
		
		array.set(0, 456);                                    // Here we set the 0 integer to 456 .
		System.out.println("size of array is="+array.size()); // ,and print out the size and numbers 
		for(Integer x : array)                                // again .
	          System.out.println(x);
		
		array.trimToSize();                                   //
		System.out.println("size of array is="+array.size()); // ,and print out the size and numbers 
		for(Integer x : array)                                // again .
	          System.out.println(x);
		
		array.clear();                                        // These is cleaning all values of array . 
		System.out.println("size of array is="+array.size()); // ,and print out the size and numbers 
		for(Integer x : array)                                // again .
	          System.out.println(x);
		
	
	
	    // # 32 . LinkedList in Java . 
		
		
		LinkedList<String> name = new LinkedList<String>();  // Here we declare an LinkedList .
		System.out.println("First ------------------------");
		name.add("Jons");
		name.add("Mike");
		name.add("Tom");
		name.add("Alik");                                   // Here we declare an names . 
		name.add("Jons");
		name.add("Jonson");
		name.addFirst("1st");
		name.addLast("last");
		System.out.println(name.size());                   // Printing out the size of LikedList .
		name.add(1, "element1");                           // Changing the 1st and 2nd names . 
		name.add(2,"element2");
		
		
		
		for(String x : name )                              //Printing out all elements of LikedList .
			System.out.println(x);
	
		System.out.println("First ------------------------");
	    name.removeFirst();                                // Removing first and last element of LikedList .
	    name.removeLast();                                    
	    System.out.println(name.size());                   //Printing out all elements of LikedList .
	         
		for(String x : name )                              //Printing out all elements of LikedList .
			System.out.println(x);
	         
	
		System.out.println("First ------------------------");
	    name.remove();                                    // Removing all elements of LikedList .
	    for(String x : name )                             //Printing out all elements of LikedList .
			System.out.println(x);
      
	    System.out.println(name.size());                   // Printing out the size of LikedList .
	
	
	
	   // # 33 .  Difference between LinkedList vs ArrayList in Java .
	
	
	    long n = (long)1E6;                         // Here we declare long "n" . 1E6 is 10 powered by 6 .
	    
	    ArrayList arraylist=new ArrayList();        // Create array .
	    long time1 =System.currentTimeMillis();     // Set the time "time1"
	    for(int i=0 ;i<n ;i++)                      // Declaring the array numbers .
	    {
	    	arraylist.add(i);
	    }
	    System.out.println("Insert array list takes "+(System.currentTimeMillis()-time1)+" ms");		
	    // Printing out time that takes to feel the array , "System.currentTimeMillis()-time1"  
	    // it means that we subtract set time "time1" by the current time "System.currentTimeMillis()"
	    // (is a current time ) . 
	    
	    LinkedList linkedlist =new  LinkedList();   // Create linkedlist .
	    long time2 =System.currentTimeMillis();     // Set the time "time2" .
	    for(int i=0 ;i<n ;i++)                      // Declaring the linkedlist numbers .
	    {
	    	linkedlist.add(i);
	    }
	    System.out.println("Insert linkedlist list takes "+(System.currentTimeMillis()-time2)+" ms");	
	    // Printing out time that takes to feel the linkedlist , "System.currentTimeMillis()-time2"  
	    // it means that we subtract set time "time1" by the current time "System.currentTimeMillis()"
	    // (is a current time ) .
	    
	    
	    
	    time1=System.currentTimeMillis();            // Set the time "time1" .
	    array.remove(1E5);                           // Deleting the 1E5 number from array .
	    System.out.println("Delet fornt from array takes "+(System.currentTimeMillis()-time1)+" ms");
	   
	    
	    time2=System.currentTimeMillis();             // Set the time "time2" .
	    linkedlist.remove(1E5);                       // Deleting the 1E5 number from linkedlist .
	    System.out.println("Delet fornt from linkedlist takes "+(System.currentTimeMillis()-time2)+" ms");
	    
	 
	    // Here we are geting the number from the array and linkedlist .
	    
	    //   time1=System.currentTimeMillis();           
	    //   array.get((int)n/4);
	    //  System.out.println("Get  from array takes "+(System.currentTimeMillis()-time1)+" ms");
	    
	    
	    // time2=System.currentTimeMillis();
	    // linkedlist.get((int)n/4);
	    // System.out.println("Get  from linkedlist takes "+(System.currentTimeMillis()-time1)+" ms");
	    
	    
	    // # 34 . ListIterator in Java .
	    
	    ArrayList<String> Bank1 =new ArrayList<String>(); // Declaring an array , and some names .
	    Bank1.add("name_1");      
	    Bank1.add("name_2");
	    Bank1.add("name_3");
	    Bank1.add("name_4");
	    Bank1.add("name_5");
	    
	    
	    ListIterator<String> Bank2= Bank1.listIterator(); // Declaring  ListIterator for Next and previous
	    while(Bank2.hasNext())                            // members . And using boolean we can check if 
	    	System.out.println(Bank2.next());             // array has next member if its true it print's out .
	    	                                               
	    System.out.println("");System.out.println("");
	                      
	    
	    while(Bank2.hasPrevious())                      
	    	System.out.println(Bank2.previous());        // Using boolean we can check if 
	    	                                             // array has previous  member if its true it print's out .
    	                                                 // It's starts form the end .
	    
	  //# 35 . HashSet in Java .
	    
	    
	    HashSet<String> hash =new HashSet<String>();     // Declaring an Hashset, and some names .
	    hash.add("hash_1");
	    hash.add("hash_2");
	    hash.add("hash_3");
	    hash.add("hash_4");
	    hash.add("hash_5");
	    
	    Iterator<String> hash2 =hash.iterator();         // Declaring an iterator , and some names .
	  
	    System.out.println("");System.out.println("");
	    
	    while (hash2.hasNext())                          // Printing out the next values .
	    	System.out.println(hash2.next());
	    
	    name.clear();                                    // It delet's all names in  hashset .
	    
	  
	    
	    
	   // # 36 . Catching and Handling Exceptions in Java using Try Catch Blocks .
	    
	    int name3[] =new int [3];
	     
	    try{                                    // With these function "try{}catch(){}" we can find  
	        int g= 1023/0;                      // an exception like "1032/0" .        
	    	
	    	
	    	
	    	System.out.println(name3[4]);         // We can check it's ArithmeticException or 
	    }catch(ArithmeticException m){            // ArrayIndexOutOfBoundsException or in general
	    	                                      // just Exception .
	    	System.out.println(m);
	    }catch(ArrayIndexOutOfBoundsException m){       
	    	
	    	System.out.println(m);
	    	
	    } catch(Exception m){
	    	
	    	System.out.println(m);
	    	
	    }
	    
	  //  # 37 .  Java Finally block (try-catch-finally Exception Handling in Java ) .
	    
	    
	    System.out.println(returnInt()); // Here we use try catch with finally result .
	    
	    
	  //  # 38 .  Create a File and Write in it Using PrintWriter and File class . 
	    try {                                         // At first we auto-generate the try catch block  
	 File file =new File("new_text_1.txt");           // and imported library for it .
	                                                  // We Create file named "new_text_1.txt" like object 
	                                                  // using method .
	if(!file.exists())                                // We check if file is exist. 
	{
		
			file.createNewFile();
		} 
	
	    PrintWriter pw= new PrintWriter(file);         // Here we crate an object for writing something 
	    pw.println("Hello everyone ");                 // in file  , after writing we close it .
	    pw.println(100000000);
	    pw.close();
	    System.out.println("Finish");
	    
	    
	    }
	    
	    
	    
	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	    
	    
	    
	    
	    
	    
	    
	    
	// # 39 .  How to Read file using Java .
	
	
	BufferedReader num1 = null ;
	
	try{
		num1 = new BufferedReader(new FileReader("C:\\Users\\aramy\\Documents\\GitHub\\musile\\new_text.txt"));
		
		String line;
		
		while((line=num1.readLine()) != null){
			System.out.println(line);
			
		}
		
	}catch(IOException e){
		e.printStackTrace();
		
		
	}finally{
		try {
			num1.close() ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// # 40 . Using Date & Time + formatting Date using SimpleDateFormat .
	
	
	
	Date new_date =new Date();                     // Create an object .
    System.out.println(new_date.toString());       // "toString()" method allows to print out ms from 1970 .  
    System.out.println(new_date.getTime());        // "getTime()" method allows to data of the day . 
    System.out.println(1+new_date.getMonth());     // Prints out the month starts with 0 .
    System.out.println(1900+new_date.getYear());   // Prints out year -1900 .
    System.out.println(new_date.getDay());         // prints day .
    System.out.println(new_date.getHours());       // print out hours .
    
    
    
    SimpleDateFormat neww= new  SimpleDateFormat(" E yyyy/MMMM/dd HH-mm-ss 	"); // Using these method we can 
                                                                                // customize our data output . 
	System.out.println(neww.format(new_date));
	
	
	
	
	
	
	
	
	
	// # 30 . Recursion in Java .

	

	
	while (1>0){
	  System.out.println("Enter the number ");
	  Scanner input = new Scanner(System.in);
      int s;
      s=input.nextInt();
      long time5 =System.currentTimeMillis();
      System.out.println(fibonchi (s));
  	  System.out.println("Counting takes  "+(System.currentTimeMillis()-time5)+" ms");
  	  
  	  
  	  
     
	}
		
	
	    
	    
	    
	    
	     
	     
	
	
	}
		 
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// # 30 . Recursion in Java .
                                           //Here we create method that counts factorial 
	                                       // , and we use Recursion .
	public static int factorial(int N){   
		
			if (N<=1)
				{return 1;}else {return (N*factorial(N-1));}
			               
			
		                                                        } 
	
	
	

	public static int fibonchi (int m1)
	   { 
		
	       
		   if (m1==1 || m1==2){
			   return 1;
			   
		   }else 
		   {  
			return fibonchi(m1-1)+fibonchi(m1-2);
			  
		   
		   }
		  
		   
		  
		    
	   }
	
	
	
	public static void fibonchi_array (int s ,int n)
	   {
		
		
		int simple_array_1[][]= new int[100][100];
		
		
		
		
		for(int i=0 ;i<100;i++){
			
			for(int m=0;m<100;m++){
				
				
			}
			
		}
		
		
		
		
		
	   }
	
	
	
		
	 //  # 37 .  Java Finally block (try-catch-finally Exception Handling in Java ) .

	public static int returnInt(){
		int a=100;
		
		try{
			a=a/0;
			
			return a;
		}catch(Exception b){
			System.out.println("Catch Called");    // At 1st it check all Exceptions .
			System.out.println(b);
			return a;
			
			
		}finally{
			a=1012;
			System.out.println("Finally	 Called"); // 2nd it do finally in any whey  .
			return a;
			
		}
		
		
		
		
	}
	
	
	
	
	
	public static void  method(String name  )  {
		
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
		
		switch (name ){
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










