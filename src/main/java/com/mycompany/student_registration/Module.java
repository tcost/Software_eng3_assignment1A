package com.mycompany.student_registration;


import java.util.ArrayList;
import org.joda.time.LocalDate;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Module {
    
    private String ModuleName;
    private ArrayList<Student> StudentList;
    private int ID;
	
    public Module (String modName, int id , ArrayList<Student> studList)
    {
        ModuleName = modName;
        ID = id;
        StudentList = studList;
        
    }
    
    public String getModuleName()
    {
    return ModuleName;
    }
    
    public ArrayList<Student> StudentList()
    {
	return StudentList;
    }

    
    public int getID() 
    {
        return ID;
    }
        
    public String toString() 
    {
    return ModuleName;
    }
}

