//общий класс животного.
//данный клас можно "вставлять" в классы реальных животных
class Animal  {
    String movBehavior;
    String talkBehavior;
    public Animal() {
        movBehavior = "Передвигаюсь";
        talkBehavior = "Издаю звуки";
    }
    public String move() {return movBehavior;}
    public String talk() {return talkBehavior;}
}
//класс кошек. имеет в свое составе( включает в себя) поле - животного
class Cats   {
    private Animal anim;
    private String movBehavior;
    private String talkBehavior;

    public Cats(){
        movBehavior = " по деревям";
        talkBehavior = " мяуканьем";
        anim = new Animal();
    }
    public String move() {
        return anim.move() + movBehavior;
    };
    public String talk(){
        return anim.talk() + talkBehavior;
    };
}
//класс собак. имеет в свое составе( включает в себя) поле - животного
class Dogs   {
    private Animal anim;
    private String movBehavior;
    private String talkBehavior;

    public Dogs(){
        movBehavior = " на четырех лапах";
        talkBehavior = " гавканьем";
        anim = new Animal();
    }
    public String move() {
        return anim.move() + movBehavior;
    };
    public String talk(){
        return anim.talk() + talkBehavior;
    };
}
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.getClass() + ": " + a.move() + ", "+ a.talk());
        System.out.println("-----------------------");

        Cats b = new Cats();
        System.out.println(b.getClass() + ": " + b.move() + ", "+ b.talk());
        System.out.println("-----------------------");

        Dogs c = new Dogs();
        System.out.println(c.getClass() + ": " + c.move() + ", "+ c.talk());
        System.out.println("-----------------------");
    }
}
