//Big Dog Inheritance

public class ClassB implements InterfaceA{

    public void ClassB(){
    }

    public boolean bark(int a) {
        if(a < 50)
            return true;
        else
            return false;
    }

    private int size = 1;
}
