class Boxdetails{
    double width;
    double height;
    double depth;
    double area;
    void get_data(double x, double y , double z){
        width = x;
        height =y;
        depth = z;

    }double AreaofBox(){
        area = width*height*depth;
        return area;
    }
}


public class Box {

    public static void main(String[] args) {
        Boxdetails b = new Boxdetails();
        b.get_data(10, 22 ,30);
       
        System.out.println( b.AreaofBox());
    }
}