package com.BankingManagementSystem.dao;

public interface Bankdao {
   public void createNewCustAcc();  //  add data on database table throw the hibernate 
   public void updateCustDetails();  // update the database
   public void closeCustAcc();  // delete a particular row from the database table
   public void displayAccDetails();  // fetch the data from the table and display
}