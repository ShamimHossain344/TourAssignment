class TourExpense {
    private String expenseType;
    private double cost;
    private String date;

    // Constructor
    public TourExpense(String expenseType, double cost, String date) {
        this.expenseType = expenseType;
        this.cost = cost;
        this.date = date;
    }

    // Getter methods
    public String getExpenseType() {
        return expenseType;
    }

    public double getCost() {
        return cost;
    }

    public String getDate() {
        return date;
    }

    // Method to display expense details
    public void displayExpense() {
        System.out.println("Date: " + date + ", Expense Type: " + expenseType + ", Cost: $" + cost);
    }
}

public class TourExpenseCalculator {
    public static void main(String[] args) {

        TourExpense[] expenses = {
                new TourExpense("Food", 25.50, "2023-11-01"),
                new TourExpense("Transportation", 15.00, "2023-11-01"),
                new TourExpense("Accommodation", 75.00, "2023-11-01"),
                new TourExpense("Sightseeing", 40.00, "2023-11-02"),
                new TourExpense("Food", 30.00, "2023-11-02"),
                new TourExpense("Transportation", 20.00, "2023-11-02")
        };

        System.out.println("Tour Expenses:");
        calculateAndDisplayExpenses(expenses);
    }

    public static void calculateAndDisplayExpenses(TourExpense[] expenses) {
        double totalCost = 0.0;
        String currentDate = "";

        for (TourExpense expense : expenses) {
            totalCost += expense.getCost();

            if (!expense.getDate().equals(currentDate)) {
                currentDate = expense.getDate();
                System.out.println("\nExpenses for " + currentDate + ":");
            }

            expense.displayExpense();
        }

        System.out.println("\nTotal Cost of the Tour: $" + totalCost);
    }
}
