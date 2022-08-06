package com.Bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InvoiceServiceTest {

    /**
     * Step1: Calculate Fare
     * Given distance and time, the invoice generator should return the total fare for the journey
     */
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
       InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
       double distsnce = 2.0;
       int time = 5;
       double fare = invoiceGenerator.calculateFare(distsnce, time);
       Assertions.assertEquals(25,fare,0.0);
    }
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5,fare,0.0);
    }
}
