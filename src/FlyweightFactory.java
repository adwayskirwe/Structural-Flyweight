
public class FlyweightFactory {
    private FlyweightInterface flyweight;
    private static FlyweightFactory factory;

    private FlyweightFactory(){

    }

    public static synchronized FlyweightFactory getInstance(){
        if(factory==null){
            System.out.println("Creating factory first time");
            factory=new FlyweightFactory();
            return factory;

        }
        else{
            System.out.println("Just returning existing factory");
            return factory;

        }
    }

    public synchronized FlyweightInterface getFlyweight(){
        if(flyweight==null){
            System.out.println("Creating flyweight first time");
            flyweight= new Flyweight();
            return flyweight;
        }
        else{
            System.out.println("Just returning existing flyweight");
            return flyweight;

        }
    }

    private class Flyweight implements FlyweightInterface{

        private Flyweight(){

        }
        public String getCompany(){
            return "Apple Inc";
        }
        public String getCity(){
            return "Montreal";
        }
        public String getState(){
            return "Quebec";
        }
        public int getZipcode(){
            int a=421201;
            return a;
        }
        public void display(String name,String post){
            System.out.println(name);
            System.out.println(post);
            System.out.println(getCompany());
            System.out.println(getCity());
            System.out.println(getState());
            System.out.println(getZipcode());
        }
    }
}
