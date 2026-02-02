/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author msi
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    

    @Test
    public void testIsValidLengthGood() {
        System.out.println("isValidLengthGood");
        
        String password ="mylongpassword";
        boolean expResult = true;
        assertEquals(expResult, PasswordValidator.isValidLegth(password));
       
    }
    
}
