
public class Client {
    public static void main(String[]args){
        FlyweightFactory f=FlyweightFactory.getInstance();
        FlyweightInterface fi=f.getFlyweight();
        fi.display("Adway Kirwe","Coder");
        fi.display("Tanmay Kirwe","Coder");

        FlyweightFactory f1=FlyweightFactory.getInstance();
        FlyweightInterface fi1=f.getFlyweight();
    }
}
