package CraftyCakes;

import java.text.NumberFormat;
import java.util.Locale;

public class CraftyCakes {
    public static void main(String[] args) {

        // 40%
        NumberFormat money = NumberFormat.getCurrencyInstance(Locale.UK);

        Employee bob = new Employee("Bob", 100);
        System.out.println(bob.getEmployeeName() + " " + money.format(bob.calculateWage()));
        System.out.println();

        // 50%
        Employee steve = new Employee("Steve", 75);
        Employee sarah = new Employee("Sarah", 50);
        System.out.println(steve.getEmployeeName() + " " + money.format(steve.calculateWage()));
        System.out.println(sarah.getEmployeeName() + " " + money.format(sarah.calculateWage()));
        System.out.println();

        // 60%
        Employee andrew = new Employee("Andrew",162);
        Employee hafsa = new Employee("Hafsa",34);
        Employee ayub = new Employee("Ayub",193);
        Employee amaan = new Employee("Amaan",309);
        Employee gary = new Employee("Gary",49);
        Employee diane = new Employee("Diane",217);
        QualityControl rabia = new QualityControl("Rabia", 385);

        Team team = new Team();

        team.addEmployee(andrew);
        team.addEmployee(hafsa);
        team.addEmployee(ayub);
        team.addEmployee(amaan);
        team.addEmployee(gary);
        team.addEmployee(diane);
        team.addEmployee(rabia);

        andrew.increaseCakes(32);
        andrew.decreaseCakes(16);
        hafsa.increaseCakes(44);
        hafsa.decreaseCakes(21);
        ayub.increaseCakes(102);
        ayub.decreaseCakes(12);
        amaan.increaseCakes(56);
        amaan.decreaseCakes(1);
        gary.increaseCakes(62);
        gary.decreaseCakes(11);
        diane.increaseCakes(10);
        diane.decreaseCakes(2);

        team.sortTeam();

        team.printTableHeader();
        team.printTable();
        team.printTableFooter();

        System.out.println("Total Wages: " + money.format(team.getTotalWages()));
        System.out.println("Total Cakes Covered: " + team.getTotalCakesCovered());

        // 70%
        // added increase/decrease methods to alter the value for cakes before being printed out by the for loop

        // 80%
        // sorted cakes covered into alphabetical order if they happen to have the same number of cakesCovered
        // sorted cakes covered into descending order using comparable -> return e.cakesCovered - this.cakesCovered

        // 90%
        // Added Rabia to the team as a QC checker
        // Implemented QC title
        // carried out an @Override on calculateWages() in the Employee class so that they earn additional 12%



    }
}