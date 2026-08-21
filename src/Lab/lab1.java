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
        System.out.println("Lab B");
        System.out.println("Tax calculation");
        System.out.println(total_value);
        System.out.println("");
//        TAX_RATE= total_value;-->we cannot reassign a constant var with some other val

        //lab C

        double doubleValue=9.7;
        //casting-->explicit conversion

        double changeInt=(int)doubleValue;//it doesnot round off it because we are trying to take int part
        double changeRoundof=(int)Math.round(doubleValue);//it round off the value

        System.out.println("Lab C");
        System.out.println(changeInt);
        System.out.println(changeRoundof);
        System.out.println("");

        //lab D
        int value1=5;
        int value2=2;
        int div1=value1/value2;//it stores only the before part of decimal
        System.out.println("Lab D");
        System.out.println(div1);
        double div2=value1/value2;//it displays with fraction part
        System.out.println(div2);
        System.out.println(" ");
    }


}
