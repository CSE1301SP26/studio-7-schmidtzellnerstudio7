package studio7;

public class die {

    private int sides;

    public die(int initsides){
        sides = initsides;
   

    }
    public int result(){
      return((int)(Math.random() * sides + 1));
    }
    public void print(){
        System.out.println(result());

    }
    public static void main(String[] args){
      die roll1 = new die(6);
      roll1.print();

    }
}
