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
import java.util.Date;

/**
 * the ticket class represents a underground train ticket. 
 * It contains information such as dates and number of zones.
 * 
 * @author Amy
 */

public class Ticket {
    
    //id for the previous tickets
    private static int previousId = 0; // shared by all objects created of this class

    //the ticket ID
    private final int id; 
    //the tickets date of issue 
    public final Date dateOfIssue;
    //the tickets date of expiry 
    public final Date dateOfExpiry;
    //the number of zones the ticket can access
    private final int numOfZones;

    /**
     * 
     * @param dateOfIssue is the date at which the ticket was issue
     * @param dateOfExpiry is the date at which the ticket expires 
     * @param numOfZones the number of zones the ticket can enter 
     */
    public Ticket(Date dateOfIssue, Date dateOfExpiry, int numOfZones) {
        this.id = previousId + 1;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
        this.numOfZones = numOfZones;
        System.out.println("hello world");

        // update previous id because a new ticket has been created
        previousId = this.id;

    }



    /**
     * Returns the id of the ticket.
     * 
     * @return id 
    }
    
    /**
     * Returns the date of issue
     * 
     * @return dataOfIssue of the ticket 
     */
    public Date getDateOfIssue() {
        return dateOfIssue;
    }
    
    /**
     * Returns the date of expiry 
     * 
     * @return dateOfExpiry of the ticket
     */
    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }
    
    /**
     * Returns the number of zones
     * 
     * @return numOfZone of the ticket
     */
    public int getNumOfZones() {
        return numOfZones;
    }

}
