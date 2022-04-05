public class App{

    public static void main(String[] args) throws Exception{
        Rectangles myRectangle = new Rectangles();
        Squares mySquare = new Squares();
        Cubes myCube = new Cubes();
        System.out.println(myRectangle.length());
        System.out.println(myRectangle.width());
        System.out.println(mySquare.length());
        System.out.println(myCube.volumme());

    }

}