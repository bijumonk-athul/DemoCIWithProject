/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.test;

/**
 *
 * @author Athul
 */
public class PasswordValidator {
    // atleast of length 8 characters
    
    public static boolean isValidLegth(String password)
    {
        if(password.length()>=8)
            return true;
        else 
            return false;
    }
    

}
