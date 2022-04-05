public class Cubes extends Squares{
    
    double height;
    public Cubes(){    
        super();
        name = "Cube";
        length = 4;
        height = 4;
        }

    public Cubes(String name, double length, double height){
        super(name, length, height);
    }
    @Override
    public double volume(){
        return length*length*height;
    }
}