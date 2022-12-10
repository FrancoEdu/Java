package Retangule;

public class Retangule {
    public double width;
    public double height;

    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return 2 * (height + width);
    }

    public double Diagonal(){
        return Math.sqrt(height*height +width*width);
    }

    public String toString(){
        return "Area: " + Area() + "\nPerimeter: " + Perimeter() + "\nDiagonal: " + Diagonal();
    }
}
