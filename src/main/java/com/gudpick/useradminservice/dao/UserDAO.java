/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudpick.useradminservice.dao;

import com.gudpick.useradminservice.dto.User;
import com.gudpick.useradminservice.util.IDGeneraor;

/**
 *
 * @author Indu
 */
public class UserDAO {
    public int create(User user)
    {
        int id=IDGeneraor.generateId();
        //save user to db
        return id;
    }
}
