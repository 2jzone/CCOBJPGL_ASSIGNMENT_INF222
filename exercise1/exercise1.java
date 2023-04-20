public class exercise1 {
    //assumpiton
    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;
    public static void main(String[] args) throws Exception {

        //precondition
        assert iWillBehave == true : "Sit down be humble - kendrick";

        College();

        //postcondition
        assert iWillGraduate == true : "Better luck next time! You got this!";

    }

    static void College(){

        iWillGraduate = false;
    
    }
    
}
