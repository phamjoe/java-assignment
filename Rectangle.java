
public class Rectangle extends Shape{

	private double length;
	private double width;
	
	public Rectangle() {
		this.length =0.0;
		this.width = 0.0;
	}
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}	
	
	public double getPerimeter(){
		double total = 0.0 ; 
		total = (2* this.length) + (2* this.width) ; 
		return total ; 
	}
	public double getArea(){
		
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return 	"Rectangle length: " + this.length + "\n" +
				"Rectangle width: " + this.width + "\n" +
				"Parameter of rectangle " + this.getPerimeter() + "\n" +
				"Area of rectangle " + this.getArea() + "\n";
	}
	
	public boolean equals(Rectangle obj){
		
		return this.toString().equals(obj.toString());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
