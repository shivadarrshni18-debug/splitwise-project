package splitwiseconsole;

import java.util.Scanner;



    public class Splitwiswapp {
        // Splitwiswapp nu oru class create panrom

        public static void main(String[] args) {
            // Program execution inga irundhu start aagum

            final String EXPENSE_DESCRIPTION="Dinner";
            //expense oda description set panro as constant

            final double TOTAL_AMOUNT=1200.0;

            final int NUMBER_OF_PEOPLE = 4;
            // Expense-a share panra people count 4 nu set panrom as constant

            final double INDIVIDUAL_SHARE = TOTAL_AMOUNT / NUMBER_OF_PEOPLE;
            // Total amount-a 4 people-ku divide panni,
            // each person evlo pay pannanum nu calculate panrom

            final int MENU_ADD_EXPENSE = 1;
            // Add expense option-ku 1 nu value kudukrom

            final int MENU_VIEW_EXPENSE = 2;
            // View expense option-ku 2 nu value kudukrom

            final int MENU_EXIT = 3;
            // Exit option-ku 3 nu value kudukrom

            Scanner sc = new Scanner(System.in);
            // User kitta irundhu input vaanga Scanner  create panrom

            boolean running = true;
            // Program running-la irukkanum nu true set panrom

            while (running) {
                // running true-ah irukkura varaikkum indha loop repeat aagum

                System.out.println("=== Splitwise Console Backend ===");
                // Program title-a display panrom

                System.out.println();
                // Oru blank line print panrom

                System.out.println("1. Add expense");
                // Add expense option-a display panrom

                System.out.println("2. View expenses");
                // View expenses option-a display panrom

                System.out.println("3. Exit");
                // Exit option-a display panrom

                System.out.print("Enter choice: ");
                // User kitta choice kekrom

                int choice = sc.nextInt();
                // User enter panra number-a choice variable-la store panrom

                switch (choice) {
                    // User select panna choice-ku based-a case execute aagum

                    case MENU_ADD_EXPENSE -> {
                        // User 1 select pannina indha block execute aagum

                        System.out.println("Recording expense (sample data)...");
                        // Expense record panrom nu message display panrom

                        System.out.println("Expense saved: "
                                + EXPENSE_DESCRIPTION
                                + " | amount=" + TOTAL_AMOUNT
                                + " | people=" + NUMBER_OF_PEOPLE);
                        // Expense description, total amount,
                        // people count ellathayum display panrom
                    }

                    case MENU_VIEW_EXPENSE -> {
                        // User 2 select pannina indha block execute aagum

                        System.out.println("--- Expense Summary ---");
                        // Expense summary heading-a display panrom

                        System.out.println("Description: " + EXPENSE_DESCRIPTION);
                        // Expense enna nu description display panrom

                        System.out.println("Total amount: " + TOTAL_AMOUNT);
                        // Total expense amount-a display panrom

                        System.out.println("People : " + NUMBER_OF_PEOPLE);
                        //  people count-a display panrom

                        System.out.println("Each pays : " + INDIVIDUAL_SHARE);
                        // Ovorutharum evlo pay pannanum nu display panrom

                        System.out.println();
                        // Oru blank line print panrom
                    }

                    case MENU_EXIT -> {
                        // User 3 select pannanga-na indha block execute aagum

                        running = false;
                        // running false aakrom
                        // Adhanala while loop stop aagum
                    }

                    default -> {
                        // 1, 2, 3 thavira vera number kudutha idhu execute aagum

                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        // Wrong choice kuduthuta error message display panrom

                        System.out.println();
                        // Oru blank line print panrom
                    }
                }
                // Switch statement mudiyudhu
            }
            // While loop mudiyudhu

            System.out.println("Goodbye! Thank you for using Splitwise Console Backend.");
            // Program exit aagumbodhu goodbye message display panrom

            sc.close();
            // Scanner-a close panrom
        }
        // Main method mudiyudhu
}
// Class mudiyudhu
