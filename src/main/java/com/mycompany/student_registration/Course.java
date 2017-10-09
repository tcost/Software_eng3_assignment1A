package com.mycompany.student_registration;
import org.joda.time.LocalDate;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Course {
    private String CourseName;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private ArrayList <Module> ModuleList;
    
    public Course(String cName, LocalDate sDate, LocalDate eDate, ArrayList<Module> modList)
    {
        CourseName = cName;
        StartDate = sDate;
        EndDate = eDate;
        ModuleList = modList;
                   
        
    }
    public String getCourseName()
    {
        return CourseName;
    }
    public LocalDate getStartDate()
    {
        return StartDate;
    }
    
    public LocalDate getEndDate()
    {
        return EndDate;
    }
            
    public ArrayList <Module> getModuleList()
    {
        return ModuleList;
    }
    
    public String toString()
    {
        String s1 = getCourseName() + "Contains the modules" + getModuleList();
        for (Module module:getModuleList())
        {
            s1 += "Module" + module.getModuleName() + "Contains the Students" + module.StudentList();
        }
        return s1;
    }
    
    
}   
