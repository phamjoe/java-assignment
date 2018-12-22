
import java.util.Arrays;

class Picture {

    private Shape[] pic;

    Shape[] picture = {new Circle(6), new Triangle(2,4,6), new Rectangle(14, 5), new Square(5), new Parallelogram(3, 5, 1)};

    Picture() {
        pic = null;
    }


    public Picture(Shape[] picture) {
        this.pic = picture;
    }

    int picturePerimeter () {
        int result = 0;
        for( Shape x : picture)
            result += x.getPerimeter();
        return result;
    }

    int pictureArea () {
        int result = 0;
        for( Shape x : picture)
            result += x.getArea();
        return result;
    }

    public static void main(String[] args) {
        Picture f = new Picture();
        System.out.println("Perimeter: " + f.picturePerimeter());
        System.out.println("Area: " + f.pictureArea());
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(picture);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Picture other = (Picture) obj;
        if (!Arrays.equals(picture, other.picture))
            return false;
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Picture [picture=" + Arrays.toString(picture) + "]";
    }
}
