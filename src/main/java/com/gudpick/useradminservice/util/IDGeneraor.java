/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudpick.useradminservice.util;

/**
 *
 * @author Indu
 */
public final class IDGeneraor {
    static int i;
    public static final int generateId()
    {
        return i++;
    }
}
