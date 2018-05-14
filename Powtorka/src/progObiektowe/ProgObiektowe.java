package progObiektowe;

public class ProgObiektowe {
    public static void main(String[] args) {


        Monitorek abc = new Monitorek ();
        abc.szerokosc = 124;
        Monitorek abc2 = new Monitorek();
        abc2.wysokosc = 70;
        abc.wlacz();
        abc2.wylacz();

        System.out.println(abc.szerokosc);
        System.out.println(abc2.wysokosc);

        Punkt p = new Punkt(25, 40);
        Punkt p2 = new Punkt(245, 450);

        System.out.println(p.x);
        System.out.println(p2.x);


    }
}
class Monitorek{
    int wysokosc;
    int szerokosc;

    void wlacz(){

    }
    void wylacz(){

    }
}
class Punkt{

    Punkt(){
        System.out.println("Konstruktor Domyslny");
    }
    Punkt(int pierwszy, int drugi){
        x = pierwszy;
        y = drugi;
    }
    int x;
    int y;
}