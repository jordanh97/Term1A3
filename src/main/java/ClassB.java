public class ClassB implements InterfaceA {

    public ClassB(){
    }

    public boolean dogBark(int a) { // Bark is triggered below 50

        if(a < 50)
            return true;
        else
            return false;
    }

    public boolean importantOperation() { // Fragility 2
        if(absValue == 303)
            return true;
        else
            return false;
    }

    public void printX(){ // Needless Repetition

        System.out.print("IF ");
        System.out.print("STAN ");
        System.out.print("GOES ");
        System.out.print("TO ");
        System.out.print("THE ");
        System.out.print("MARKET ");

    }

    public void printY(){ // No Repetition

        System.out.print("IF STAN GOES TO THE MARKET");

    }

    public int printZ(){ // Viscosity

                                                                System.
                    out.
                                                                                    print("IF " +
                "" +
                        "" +
                "" +
                                "STAN GOES " +
                "" +
                "TO THE " +
                "MARKET"
        );
                                                        return


                12;

    }

    public int printV(){ // No Viscosity

        System.out.print("IF STAN GOES TO THE MARKET");
        return 12;

    }


    public int dinosaursComeBackToLife(boolean x){ // Needless Complexity

        if(x == true){
            System.out.println("Here come the dinosaurs!!!");
            return 1;
        }
        else {
            System.out.println("No dinos YAY");
            return 0;
        }

    }

}
