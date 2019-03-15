public class Main {

    public static void main (String[] args){

        ClassA ca = new ClassA();

        // PLK Violation

        boolean x = ca.dogBark(51);
        boolean y = ca.tennisChampion(2);

        if(x)
            System.out.print("The dog barks");
        else
            System.out.print("The dog does not bark");


        // PLK Adherence

        boolean z = ca.dogBark(51);

        if(z)
            System.out.print("The dog barks");
        else
            System.out.print("The dog does not bark");

    }

}
