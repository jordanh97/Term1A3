public class ClassD extends ClassA {

    public ClassD(){

    }

    private int absValue = 303; // Rigidity
    private int ts;

    public boolean dogBark(int a) {
        return super.dogBark(a);
    }


    public int getAbsValue() {
        return absValue;
    }

    public boolean isConcreteString(){          // DIP Violation
        if (concreteString.equals("This")){     
            return true;
        }
        else {
            return false;
        }
    }

    public void setTs(int ts) { // OCP Non Adherence
        this.ts = ts;
    }
}
