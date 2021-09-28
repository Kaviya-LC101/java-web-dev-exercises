package exercises.technology;

public class Main {
    public static void main(String[] args){
        Computer dell= new Computer("Window",120,4);
        Laptop  lennova=new Laptop("Window",120,4,true);
        SmartPhone samsung= new SmartPhone("Android",120,10,"White" );
        System.out.println("Computer Id: "+dell.getUniId());
        System.out.println("Laptop Id: "+lennova.getUniId());
        System.out.println("Smartphone Id: "+samsung.getUniId());


    }

}
