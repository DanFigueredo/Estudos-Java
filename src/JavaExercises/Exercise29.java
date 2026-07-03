package JavaExercises;

import JavaExercises.Domain.FamilyTicket;
import JavaExercises.Domain.HalfTicket;
import JavaExercises.Domain.Ticket;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket(20,"Lego Ninjago", true);
        ticket.calculatePrice();
        ticket.showData();

        System.out.println("\n");

        Ticket halfTicket = new HalfTicket(20, "A espera de um milagre",true);
        halfTicket.showData();

        System.out.println("\n");

        Ticket familyTicket = new FamilyTicket(20,"Até o ultimo homem", false,4);
        familyTicket.showData();


    }
}
