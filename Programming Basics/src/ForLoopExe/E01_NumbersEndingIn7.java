package ForLoopExe;

public class E01_NumbersEndingIn7 {

    public static void main(String[] args) {

        for ( int row = 1; row < 1000; row++ ){
            if ( row % 10 == 7){
                System.out.println(row);
            }
        }

    }
}
