package splitwiseconsole;

public class Splitwiswapp {
    public static void main(String[] args){

        // var declaration
        final String EXPENSE_DESCRIPTION="Dinner";
        final double TOTAL_AMOUNT=1200.0;
        final int NUMBER_OF_PEOPLE=4;
        double individualShare;
        System.out.println("===Splitwise Console Backend===");
        System.out.println("");
        individualShare=TOTAL_AMOUNT/NUMBER_OF_PEOPLE;//calculating for per person
        System.out.print("Expense description:");
        System.out.println(EXPENSE_DESCRIPTION);
        System.out.print("Total amount:");
        System.out.println(TOTAL_AMOUNT);
        System.out.print("Number of people:");
        System.out.println(NUMBER_OF_PEOPLE);
        System.out.print("Each person should pay:");
        System.out.println(individualShare);

        System.out.println("");
        System.out.println("Feature status: Basic calculation completed.");
    }

}
