import java.util.ArrayList;
import java.util.Scanner;

public class Main_prog {

    // List declarations
    private ArrayList<Double> Income_list = new ArrayList<>();
    private ArrayList<String> Source_list = new ArrayList<>();
    private ArrayList<Double> Expenditure_list = new ArrayList<>();
    private ArrayList<String> Category_list = new ArrayList<>();

    // Calculate total income
    public double getTotalIncome() {
        double totalIncome = 0.0;
        for (double inc : Income_list) {
            totalIncome += inc;
        }
        return totalIncome;
    }

    // Calculate total expenditure
    public double getTotalExpenditure() {
        double totalExpenses = 0.0;
        for (double exp : Expenditure_list) {
            totalExpenses = totalExpenses + exp;
        }
        return totalExpenses;
    }

    // Add income
    public void addIncome(double amount, String source) {
        Income_list.add(amount);
        Source_list.add(source);
    }

    // Add expenditure
    public void addExpense(double expense, String category) {
        Expenditure_list.add(expense);
        Category_list.add(category);
    }

    public static void main(String[] args) {
        Main_prog tracker = new Main_prog();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expenditure");
            System.out.println("3. Get Total Income");
            System.out.println("4. Get Total Expenditure");
            System.out.println("5. Exit");
            System.out.println("6. Total Savings");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the source of income: ");
                    String source = sc.nextLine();
                    System.out.print("Enter the amount of income: ");
                    double amount = sc.nextDouble();
                    tracker.addIncome(amount, source);
                    System.out.println("Income added successfully.");
                    break;

                case 2:
                    System.out.print("Enter the category of expenditure: ");
                    String category = sc.nextLine();
                    System.out.print("Enter the amount of expenditure: ");
                    double expense = sc.nextDouble();
                    tracker.addExpense(expense, category);
                    System.out.println("Expenditure added successfully.");
                    break;

                case 3:
                    double totalIncome = tracker.getTotalIncome();
                    System.out.println("Total Income: " + totalIncome);
                    break;

                case 4:
                    double totalExpenses = tracker.getTotalExpenditure();
                    System.out.println("Total Expenditure: " + totalExpenses);
                    break;

                
                case 5:
                    double totalSavings = 0.0;
                    totalSavings = tracker.getTotalIncome() - tracker.getTotalExpenditure();
                    System.out.println("Total Savings: " + totalSavings);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
        } while (choice != 5);

        sc.close();
    }
}