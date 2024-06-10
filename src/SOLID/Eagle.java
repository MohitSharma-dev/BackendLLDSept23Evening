package SOLID;

public class Eagle extends Bird implements Flyable{

    FlyingBehaviour flyingBehaviour;

    Eagle(FlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }

    @Override
    public void fly() {
        // think of flying high as a multiple line algo
//        System.out.println("Eagle is flying high");
        flyingBehaviour.makeFly();
    }
}
