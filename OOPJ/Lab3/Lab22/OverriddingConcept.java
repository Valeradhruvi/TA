public class OverriddingConcept {
    public static void main(String[] args) {
        Human human = new Human();

        human.Language();


        //if you want language method of Life
        Life l1 = new Life();
        l1.Language();
    }    
}

class Life{
    public void Language(){
        System.out.println("Every Life speaks on its own language.");
    }
}

class Human extends Life{
    public void Language(){
        System.out.println("Every Human speaks its own language.");
    }
}