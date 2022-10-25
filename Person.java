/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.sesi.pkg5;

/**
 *
 * @author Axioo
 */
    public class Person {
    private final String name;
    private String address;
   
   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }
   
   public String getName() {
      return name;
   }
  
   
   public String getAddress() {
      return address;
   }
   
   public void setAddress(String address) {
      this.address = address;
   }
   
    /**
     *
     * @return
     */
    @Override
   public String toString() {
      return name + "(" + address + ")";
   }
}

