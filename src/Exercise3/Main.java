package Exercise3;

public class Main {
    public static void main(String [] args){
        try{
            Triangle triangle1 = new Triangle(3.0,4.0,5.0);
            System.out.println("Triangle 1 is valid " + triangle1.checkSides());

            Triangle triangle2 = new Triangle(6.9,4.5,6.9);
            System.out.println("Triangle 2 is valid " + triangle2.checkSides());

            Triangle triangle3 = new Triangle(1.0,2.0,3.0);
            System.out.println("Triangle 3 is invalid." + triangle3.checkSides());


        }catch (IllegalTriangleSideException e){
            System.out.println("Hey, this triangle isn't valid!");
        }


    }
}
