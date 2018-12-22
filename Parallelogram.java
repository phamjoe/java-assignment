public class Parallelogram extends Shape{
	
	private double height;
	private double length;
	private double width;
	
	public Parallelogram() {
		this.length = 0.0;
		this.width = 0.0;
		this.height = 0.0;
	}
	
	public Parallelogram(double l, double w, double h) {
		this.length = l;
		this.width = w;
		this.height = h;
	}	
	
	public double getPerimeter(){
		 double total = 0.0 ; 
		 total = (2* this.length) + (2* this.width); 
		 
		 return total; 
	}
	public double getArea(){
		double total = 0.0 ; 
		total = this.length * this.height ; 
		return total ; 
	}

	@Override
	public String toString() {
		return 	"Parallelogram length: " + this.length + "\n" +
				"Parallelogram width: " + this.width + "\n" +
				"Parallelogram height: " + this.height + "\n" +
				"Perimeter of Parallelogram " + this.getPerimeter() + "\n" +
				"Area of Parallelogram " + this.getArea() + "\n";
	}

	public boolean equals(Parallelogram obj){
		if(this.toString().equals(obj.toString())){return true ; }
		return false ; 
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}