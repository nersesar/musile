package musile;

public class Cube {
	int x , y , z;
	public int V(){return x*y*z;}; // It's a method which is returning the value .
	
	Cube(){
		x=20;                // Here we create constructor by default .
		y=12;                // In constructor can't return something it only can get some value .
		z=43;                // Constructor name can only be it's class name in these example it's "Cube" .
		}
	Cube (int x1, int y1 , int y2 ){
		
		x=x1;
		y=y1;                 // Here we set some variables in constructor.
		z=y2;
			
		
	}

}
