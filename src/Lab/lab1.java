package Lab;

public class lab1 {
    public static void main(String[] args) {
        //lab A

        int i = 10;
        long l = 1234567890123456789l;
        double d = 23.1234567890987654323456789;//here,double value -->15digits only going to print but can assign more than tha
        boolean b = true;
        char c = 'A';
        System.out.println("Lab A");
        System.out.println("Printing datatypes");
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);
        System.out.println("");

        //lab B

        final double TAX_RATE=0.18;
        double amount=1000.0;

        var total_value=amount/TAX_RATE;
        System.out.println("Lab 2");
        System.out.println("Tax calculation");
        System.out.println(total_value);
        System.out.println("");
//        TAX_RATE= total_value;-->we cannot reassign a constant var with someother val


    }
}
