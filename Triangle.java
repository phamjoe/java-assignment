class Triangle extends Shape {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    interface Perimeter {
        double Perimeter();
    }

    interface Area {
        double Area();
    }

    public double calculatePerimeter(Perimeter p) {
        return p.Perimeter();
    }

    public double calculateArea(Area a) {
        return a.Area();
    }

    /**
     * Calculating the perimeter of Triangle
     */
    public double getPerimeter() {
        Perimeter p = () -> a + b + c;
        return calculatePerimeter(p);
    }

    /**
     * Calculating the area of Triangle
     */
    public double getArea() {
        double s = (a + b + c) / 2;
        double aa = s * (s - a) * (s - b) * (s - c);
        Area a = () -> Math.sqrt(aa);
        return calculateArea(a);

    }

    @Override
    public String toString() {
        return "a: " + a + ", b: " + b + ", c: "+c;
    }



	public boolean equals(Triangle obj){
		
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