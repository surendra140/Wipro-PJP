
public class Box {
    double width, height, depth;

    Box(int w, int h, int d)
    {
        this.height = h;
        this.depth = d;
        this.width = w;
    }

    double getVolume(){
        return width*height*depth;
    }

    public static void main(String[] args){
        Box box = new Box(10,20,30);
        System.out.println("The Volume of Box is: "+box.getVolume());
    }
}
