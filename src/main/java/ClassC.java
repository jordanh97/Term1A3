public class ClassC {

    public ClassC(){
    }

    private int absValue = 303; // Rigidity

    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();

    boolean x = classA.dogBark(45);
    boolean y = classB.dogBark(51);


    public boolean bigDogBark(int a) { // Big & Small Dog Bark No Inheritance
        if(a < 50)
            return true;
        else
            return false;
    }

    public boolean smallDogBark(int a) {
        if(a > 50)
            return true;
        else
            return false;
    }

    // ClassC is only responsible for dogBark thus adhering to the SRP


}
