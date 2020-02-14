package com.jetlight.amine_smahi.inssen;

public class Member {
    private String Name;
    private String Email;
    private Long Phone;

    public Member() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(Long phone) {
        Phone = phone;
    }
}