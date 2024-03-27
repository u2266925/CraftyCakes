package CraftyCakes;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Team {

    private ArrayList<Employee> teams;
    public Team() {
        this.teams = new ArrayList<>();
    }

    public ArrayList<Employee> getTeams() {
        return teams;
    }

    public void addEmployee(Employee e){
        teams.add(e);
    }

    public void printTableHeader(){
        System.out.println("____________________________________________");
        System.out.println("|    EMPLOYEE   | CAKES COVERED |   WAGES  |");
        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|‾‾‾‾‾‾‾‾‾‾|");
    }

    public void printTable(){
        for (Employee e : teams){
            if (e instanceof QualityControl){
                e.display();
            } else {
                e.display();
            }
        }
    }

    public void printTableFooter(){
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

    public double getTotalWages(){
        double total = 0;
        for (Employee e : teams){
            total += e.calculateWage();
        }
        return total;
    }

    public int getTotalCakesCovered(){
        int total = 0;
        for (Employee e : teams){
            total += e.getCakesCovered();
        }
        return total;
    }

    public void sortTeam(){
        Collections.sort(teams);
    }
}