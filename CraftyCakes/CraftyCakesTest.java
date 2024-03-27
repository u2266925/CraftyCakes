package CraftyCakes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.text.NumberFormat;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;

public class CraftyCakesTest {

    NumberFormat money = NumberFormat.getCurrencyInstance(Locale.UK);
    Team team;

    @BeforeEach
    void setUp(){
        Employee andrew = new Employee("Andrew",162);
        Employee hafsa = new Employee("Hafsa",34);
        Employee ayub = new Employee("Ayub",193);
        Employee amaan = new Employee("Amaan",309);
        Employee gary = new Employee("Gary",49);
        Employee diane = new Employee("Diane",217);
        QualityControl rabia = new QualityControl("Rabia", 385);

        team = new Team();

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
    }

    @Test
    void getTotalCakesCovered(){
        int i = team.getTotalCakesCovered();
        assertEquals(1529, i);
    }

    @Test
    void getTotalWages(){
        double d = team.getTotalWages();
        assertEquals(money.format(219.18), money.format(d));
    }

    @Test
    void calculateWage(){
        // Employee calculateWage method
        Employee bob = new Employee("Bob", 100);
        double d = bob.calculateWage();
        assertEquals(money.format(12.5), money.format(d));

        // Quality Control calculateWage method
        QualityControl rabia = new QualityControl("Rabia", 385);
        double d1 = rabia.calculateWage();
        assertEquals(money.format(61.88), money.format(d1));
    }


    @Test
    void increaseCakes(){
        Employee andrew = new Employee("Andrew",162);
        andrew.increaseCakes(32);
        int i = andrew.getCakesCovered();
        assertEquals(194, i);
    }

    @Test
    void decreaseCakes(){
        Employee andrew = new Employee("Andrew",162);
        andrew.decreaseCakes(16);
        int i = andrew.getCakesCovered();
        assertEquals(130, i);
    }
}
