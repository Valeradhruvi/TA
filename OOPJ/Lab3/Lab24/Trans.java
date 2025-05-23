public class Trans {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        for (Animal animal : animals) {
            if(animal instanceof Transport){
                ((Transport)animal).deliver();
            }
            System.out.println();
        }
    }    
}

interface Transport{
    public void deliver();
}

abstract class Animal{

}

class Tiger extends Animal{

}

class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel is delivered");
    }
}

class Deer extends Animal{

}

class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Donkey is delivered");
    }
}