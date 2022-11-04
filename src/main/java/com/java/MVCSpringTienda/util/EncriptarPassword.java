
package com.java.MVCSpringTienda.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    public static void main(String[] args) {
        String password="12345";
        System.err.println("passoword  "+password);
        System.err.println("password encriptado  "+ EncriptarPassword(password));
        
    }
    
    public static String EncriptarPassword(String password){
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
