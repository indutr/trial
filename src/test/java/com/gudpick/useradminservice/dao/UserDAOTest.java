/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudpick.useradminservice.dao;

import com.gudpick.useradminservice.dto.User;
import com.gudpick.useradminservice.util.IDGeneraor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.powermock.api.mockito.PowerMockito.*;


/**
 *
 * @author Indu
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(IDGeneraor.class)
public class UserDAOTest {
    
    public UserDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class UserDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        User user = new User();
        UserDAO instance = new UserDAO();
        int expResult = 1;
        mockStatic(IDGeneraor.class);
        when(IDGeneraor.generateId()).thenReturn(1);
        int result = instance.create(user);
        assertEquals(expResult, result);
        verifyStatic(IDGeneraor.class);
    }
    
}
