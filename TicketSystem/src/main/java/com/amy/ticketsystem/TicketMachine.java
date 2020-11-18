/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amy.ticketsystem;

/**
 *
 * @author Amy
 */
public class TicketMachine {

    //attichbrutes
    private int id;
    private int price; //price of the ticket
    private int total; //total amount of money collected by the machine
    private int balance; //amount customer has paid
    private DestinationStation DestinationStations;
    private Ticket ticket;

    //constructor
    public TicketMachine(int ticketCost){
        price = ticketCost;
        total = 0;
        balance = 0;
    }


    public void printTicket (){
        if (balance >= price){
            System.out.println(ticket);
        }
        else{
            System.out.println("Your card has been declined");
        }
    }



    public int getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    public int getTotal(){
        return total;
    }
    public DestinationStation getDestinationStations() {
        return DestinationStations;
    }


}
