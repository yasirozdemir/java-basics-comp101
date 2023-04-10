public class SalaryChallenge {
    public static int employeesYearlySalary(int hoursPerWeek,
                                            int moneyPerHour,
                                            int vocationHours) {
        int salary = 52 * (hoursPerWeek * moneyPerHour) - 52 * (vocationHours * moneyPerHour);
        return salary;
    }
    public static void main(String [] args) {
        int YearlySalary = employeesYearlySalary(56, 15, 8);
        System.out.println(YearlySalary);
    }
}
