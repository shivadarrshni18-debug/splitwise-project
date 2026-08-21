package Lab;

public class lab2 {
    public static void main(String[] args){
        //Arithmetic
        int a=17;
        int b=5;
        int div=a/b;
        System.out.println("lab A");
        System.out.println("division:"+div);

        double div1=17.0/5;
        System.out.println("Division:"+div1);

        int mod=17%5;
        System.out.println("modulus:"+mod);
        System.out.println(" ");

      //relations and boolean

        int choice = 2;
        System.out.println("lab B");
        System.out.println(choice == 2);
        System.out.println(choice != 3);
        System.out.println(choice >= 1 && choice <= 3);
        System.out.println(" ");

        //if/elseif

        int choice1 = 2;
        System.out.println("lab c");
        if (choice1 == 1) {
            System.out.println("Add");
        } else if (choice1 == 2) {
            System.out.println("View");
        } else if (choice1 == 3) {
            System.out.println("Exit");
        } else {
            System.out.println("Invalid");
        }
        System.out.println(" ");

        //switch

        int ch = 2;

        String message = switch (ch) {
            case 1 -> "Add";
            case 2 -> "View";
            case 3 -> "Exit";
            default -> "Invalid";
        };
        System.out.println("lab D");
        System.out.println(message);
        System.out.println("");
          //loop
        // 1. Print numbers 1 to 5 using for
        System.out.println("lab E");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println(" ");

//2. Print numbers 5 down to 1 using while
        int i = 5;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
