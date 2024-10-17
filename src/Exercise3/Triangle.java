package Exercise3;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    //constructors

    public Triangle(){
        this.side1 = 3.0;
        this.side2 = 3.0;
        this.side3 = 3.0;
    }

    public Triangle (double side1, double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //setters

    public void setSide1(double side1){this.side1 = side1;}
    public void setSide2(double side2){this.side2 = side2;}
    public void setSide3(double side3){this.side3 = side3;}

    //getters

    public double GetSide1(){return this.side1;}
    public double GetSide2(){return this.side2;}
    public double GetSide3(){return this.side3;}

    //checkSides method

    boolean checkSides() throws IllegalTriangleSideException {
            if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
                return true;
            }else {
                throw new IllegalTriangleSideException("Hey! The sides don't form a Triangle!");
            }
        }

}
