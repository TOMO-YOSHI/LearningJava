import java.util.Scanner;

public class Salary {
	
	public static void salaryCalcu (double workHoursPerWeek, double moneyPerHour, double vacationDays) {
		double salaryPerWeek = workHoursPerWeek * moneyPerHour;
		double salaryPerYear = salaryPerWeek * 52;
		System.out.println(salaryPerYear);
		double salaryPerYearMinusVacation = salaryPerYear - moneyPerHour * vacationDays * 8;
		System.out.println(salaryPerYearMinusVacation);
	}

	public static void main(String[] args) {
		salaryCalcu(40, 15, 8);
	}

}
