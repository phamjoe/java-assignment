
public class Square extends Shape{

	private double length;
	
	public Square() {

		this.length = 0.0;
	}
	
	public Square(double l) {
		this.length = l;
	}	
	
	public double getPerimeter(){
		double total = 0.0 ; 
		total = 4 * this.length ; 
		return total ; 
	}
	public double getArea(){
		double total = 0.0 ; 
		total = this.length * this.length ; 
		return total ;
	}

	@Override
	public String toString() {
		return 	"Square length: " + this.length + "\n" +
				"Parameter of Square " + this.getPerimeter() + "\n" +
				"Area of Square " + this.getArea() + "\n";
	}
	
	public boolean equals(Square obj){
		
		if(this.toString().equals(obj.toString()) == true ){
				return true ;
			}
		
		return false ;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}