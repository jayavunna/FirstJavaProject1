package LoveProgramming;

//I would like to display four lines of stars each row 10stars
import javax.swing.plaf.synth.SynthScrollBarUI;

public class LoopClass {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("*******");
        for (i = i; i < 4; i++) {
            //       System.out.println(i);
            System.out.println("**********");

        }
//***********************************************************************

        for (int k = 0; k <= 5; k++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //   ============================================================
        int n = 5;
        for (int m = 0; m <= 5; m++) {
            for (int l = 0; l < n; l++) {
                System.out.print(" ");
            }
            n--;
            for (int l = 0; l <= m; l++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}


