package com.mycompany.student_registration;


import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */

   
    
public class Student {
     private String FirstName;
      private String Surname;
      private String DateOfBirth;
      private int Age;
      public int Id;
      public String Username; 
      private LocalDate lod;
      
      
      public Student(int studID, String fname, String lname, String DOB, int age)
      {
          
          FirstName = fname;
          Surname = lname;
          DateOfBirth = DOB;
          Id = studID;
          Age = age;
          setUsername();
      }
      
      public String getFirstName()
      {
          return FirstName;
      }
       
      public String getSurname()
      {
          return Surname;
      }
      public String getDateOfBirth()
      {
          return DateOfBirth;
      }
      public int getId()
      {
          return Id;
      }
      
      
      public void setUsername()
      {
          Username = FirstName + Age;
      }
      public String getUsername()
      {
          return Username;
      }
          public String toString(){
              return ""+Id;
          }
}
