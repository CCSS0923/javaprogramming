package OOP;

public class tv01 {
    public static class Tv {
        String model;
        String color;
        int size;
        boolean power;
        int channel;
        int volume;

        void power() { power = true; }
        void channelUp() { ++channel; }
        void channelDown() { --channel; }
        void volumeUp() { ++volume; }
        void volumeDown() { --volume; }
    }

    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        t1.model = "Ultra";
        t1.size = 64;
        t1.color = "black";
        t1.channel = 9;
        t1.volume = 5;
        
        t2.model = "Eicono";
        t2.size = 32;
        t2.color = "white";
        t2.channel = 7;
        t2.volume = 15;

        System.out.println("이 TV는 " + t1.model + "이며, " + "색상은 " + t1.color + "입니다");
        System.out.println("현재 channel은 " + t1.channel);
        System.out.println("현재 Volume은 " + t1.volume);
        System.out.println();
        
        t1.color = "white";
        t1.channelUp();
        t1.volumeUp();
        
        System.out.println("이 TV는 " + t1.model + "이며, " + "색상은 " + t1.color + "입니다");
        System.out.println("현재 channel은 " + t1.channel);
        System.out.println("현재 Volume은 " + t1.volume);
        System.out.println();
        
        System.out.println("이 TV는 " + t2.model + "이며, " + "색상은 " + t2.color + "입니다");
        System.out.println("현재 channel은 " + t2.channel);
        System.out.println("현재 Volume은 " + t2.volume);
        System.out.println();
    }
}
