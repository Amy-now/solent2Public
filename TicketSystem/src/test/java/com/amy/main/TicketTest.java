/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amy.main;

import org.junit.Test;
import com.amy.ticketsystem.Ticket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class TicketTest {

    private static Ticket first_ticket; //final means its assigned once never changed
    private static Date dateOfIssue;
    private static Date dateOfExpiry;

    @BeforeClass //@Before used on a method cause it makes the java code in this methon run before.
    public static void beforeEachTest() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        dateOfIssue = sdf.parse("01-01-2020"); //.parse makes a string into a date
        dateOfExpiry = sdf.parse("02-02-2020");
        first_ticket = new Ticket(dateOfIssue, dateOfExpiry, 6);

    }

    @Test
    public void getId() {
        assertEquals(1, first_ticket.getId());
    }

    @Test
    public void getDateOfIssue() {
        assertEquals(dateOfIssue, first_ticket.getDateOfIssue());
    }

    @Test
    public void getDateOfExpiry() {
        assertEquals(dateOfExpiry, first_ticket.getDateOfExpiry());
    }

    @Test
    public void getNumOfZones() {
        assertEquals(6, first_ticket.getNumOfZones());
    }
}
