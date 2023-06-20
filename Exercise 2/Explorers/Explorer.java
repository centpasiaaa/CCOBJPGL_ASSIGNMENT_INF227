package Explorers;

import Planets.Mars;
import Planets.Mercury;
import Planets.Planet;
import Planets.Saturn;
import Planets.Earth;

public interface Explorer {

    void visit(Saturn saturn);

    void visit(Mars mars);

    void visit(Mercury mercury);

    void visit(Earth earth);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}