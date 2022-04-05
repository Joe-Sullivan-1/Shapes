public class Squares extends Rectangles{
    public Squares(){
        super();
        name = "Square";
        length = 4;
        height = 4;

    }
    public Squares(String name, double length, double width){
        super(name, width, length);
       
    }

    public double squaresLength(){
        return length;
    }
    
    @Override
    public double volume(){
        return length*length;
    }

}
