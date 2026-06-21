public class IT26101535Lab2Q1{
	public static void main(String[] args){
		double  perimeter = 100;// assuming perimeter = 100
		
		//length Calculation
		double length = (perimeter * 2)/7;
		
		//Width Calculation
		double width = (3.0/4.0)*length;
		
		//Output
		System.out.println("Lengh of the fence: "+length);
		System.out.println("Width of the fence: "+width);
		
	}
} 

public class IT26101535Lab2Q2{
	public static void main(String[] args) {
		//assume side length 
		double side = 10;
		double pi = 3.14;
		
		//Perimeter of the square
		double perimeter = 4*side;
		
		//Radius of the Circle
		double radius = perimeter/(2*pi);
		
		//Output
		System.out.println("Radius of the Circle Fence: "+radius);
		
	}
}

public class IT26101535Lab2Q3{
	public static void main(String[] args){
		//known sides
		double sideA = 3.0;
		double sideB = 4.0;
		
		//calculate the hypotenuse
		double hypotenuse = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2));
		
		//Display the Results
		System.out.println("Length of the Hypotenuse: "+ hypotenuse);
	}
}