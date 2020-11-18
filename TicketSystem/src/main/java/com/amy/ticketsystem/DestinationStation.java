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
public class DestinationStation {

    private int zoneNumber;
    private String name;

    public DestinationStation (String name, int zoneNumber){
        this.name = name;
        this.zoneNumber = zoneNumber;
    }

    public String getName(){
        return name;
    }
    public int getZoneNumber(){
        return zoneNumber;
    }


}