//Small Dog Inheritance

import java.util.*;

public class ClassA implements InterfaceA {

    private String type;
    private String id;

    ClassA(){
    }

    public boolean bark(int a) {
        if(a > 50)
            return true;
        else
            return false;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClassA (Builder builder) {
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
