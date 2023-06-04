package com.example.Amira201811086;

import static org.junit.Assert.assertEquals;

import com.example.Amira201811086.user.User;

import org.junit.Test;

public class UserTest {

    @Test
    public void validUserTypeTest() {
        User user = new User("Noor", "201811095@gcet.edu.om", "9025255322", "Muscat", "employer");

        user.setUserType("employee");
        assertEquals("employee", user.getUserType());
    }

    @Test
    public void validUserLocationTest() {
        User user = new User("Marwan", "201811062@gcet.edu.om",
                "9025255322", "Muscat", "employer");

    }

    @Test
    public void validUserNameTest() {
        User user = new User("Amira", "201811086@gcet.edu.om",
                "79155817", "Muscat", "employer");

        user.setFullName("Ali");
        assertEquals("Ali", user.getFullName());
    }

    @Test
    public void validUserEmailTest() {
        User user = new User("Amira", "201811086@gcet.edu.om",
                "79155817", "Muscat",  "employer");

        user.setEmail("201811086@gcet.edu.om");
        assertEquals("201811086@gcet.edu.om", user.getEmail());
    }

    @Test
    public void validUserPhoneTest() {
        User user = new User("Amira", "201811086@gcet.edu.om",
                "79155817", "Muscat", "employer");

        user.setPhone("79155817");
        assertEquals("79155817", user.getPhone());
    }
}

