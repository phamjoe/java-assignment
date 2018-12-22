
public class Circle extends Shape{
	 double Pi = 3.14;
     double radius;
	
	public Circle() {
		this.radius = 0.0;
	}
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double getPerimeter(){	
		double total = 0.0 ; 
		total = 2 * Pi * this.radius ; 
		return total ; 
	}
	public double getArea(){
		double total =0.0 ; 
		total = Pi * this.radius * this.radius ; 
		return total;
	}

	@Override
	public String toString() {
		return 	"Circle's radius: " + this.radius + "\n" +
				"Perimeter of circle " + this.getPerimeter() + "\n" +
				"Area of circle " + this.getArea() + "\n";
	}

	public boolean equals(Circle obj){
		if(this.toString().equals(obj.toString()) == true )
		{
			return true ;
		}
		
		return false ; 
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}