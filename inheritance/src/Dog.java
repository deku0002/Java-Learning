public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt","Big",50);
    }

    public Dog(String type,double weight){
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type,double weight,String earShape,String tailShape){
        super(type,weight<15?"Small":(weight<35?"Medium":"Large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString(){
        return "Dog{"+
                "earShape='"+earShape+'\''+
                "tailShape='"+tailShape+'\''+"} "
                +super.toString();
    }

    @Override
    public void makeNoise(){
        if(type=="Wolf"){
            System.out.println("Ow Woooo!");
        }
        else
         bark();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        if(speed=="slow"){
            walk();
            wagTail();
        }
        else {
            bark();
            run();
        }
        System.out.println();
    }

    public void bark(){
        System.out.println("Woof! ");
    }
    public void run(){
        System.out.println("Dog Running ");
    }
    public void walk(){
        System.out.println("Dog Walking ");
    }
    public void wagTail(){
        System.out.println("Tail Wagging ");
    }
}
