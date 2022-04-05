public class Rectangles extends Shapes{
    String name;
    double width;
    double length;
    
    public Rectangles(){
        super();
        name = "Rectangle";
        length = 4;
        width = 10;

    }
    public Rectangles(string name, double width, double length){
        this.name = name;
        this.width = width;
        this.length = length;
    }


    public double rectangleLength(){
        return length;

    }

    public double rectangleWidth(){
        return width;
    }

    @Override
    public double area(){
        return width*length;
    }


    }


