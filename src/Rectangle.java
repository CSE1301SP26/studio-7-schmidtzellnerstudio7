public class Rectangle {
    private int length;
    private int width;
    private int area;
    private int perimeter;

    public Rectangle(int initlength, int initwidth){
        length = initlength;
        width = initwidth;
        area = length * width;
        perimeter = 2 * length + 2 * width;
    }
    public void print(){
        System.out.println("Area is: " + area);
        System.out.println("Perimiter is: " + perimeter);

        if(length == width){
            System.out.println("Shape is a square.");
        }
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(6,3);
        r1.print();
        Rectangle r2 = new Rectangle(5,5);
        r2.print();
    }
}
