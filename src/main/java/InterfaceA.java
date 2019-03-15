public interface InterfaceA { // ISP Violation as absValue is not related to dogBark

    boolean dogBark(int a);

    int absValue = 303; // DIP Adherence


}
