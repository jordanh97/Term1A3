public class ClassA implements InterfaceA {

    private String type;
    private String id;
    public String concreteString = "This";

    public ClassA(){

    }

    public boolean dogBark(int a) { // Bark is triggered above 50 DIP Adherence
        if(a > 50)
            return true;
        else
            return false;
    }

    public boolean tennisChampion(int a) { // Tennis Champion Status
        if(a == 1)
            return true;
        else
            return false;
    }

    // Having both dogBark and tennisChampion methods in the same class violates the SRP

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public int getAbsValue(){ // Non Rigidity
        return absValue;
    }

    public boolean importantOperation() { // Fragility 1
        if(absValue == 303)
            return true;
        else
            return false;
    }

    public ClassA (Builder builder) { // OCP Adherence
        this.id = builder.id;
        this.type = builder.type;

    }

    public static class Builder {
        private String id;
        private String type;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder type(String value) {
            this.type = value;
            return this;
        }

        public ClassA build() {
            return new ClassA(this);
        }
    }

}
