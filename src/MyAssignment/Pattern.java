package MyAssignment;

public class Pattern {
    public static void main(String[] args) {
    int stars=4;
        for (int i = 0; i < stars; i++) {
             for(int j=0 ; j<=i ; j++){
                 System.out.print(" * ");
             }
            System.out.println();
        }
     }
}