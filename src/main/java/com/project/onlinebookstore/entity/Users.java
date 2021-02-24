package com.project.onlinebookstore.entity;

import javax.persistence.*;

@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String Email;
    private String username;
    private String password;

    public Users(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
        this.username = username;
        this.password = password;
    }

    public Users() {
    }

    public Users(Users users) {
        this.id=users.getId();
        this.firstName=users.getFirstName();
        this.lastName=users.getLastName();
        this.Email=users.getEmail();
        this.username=users.getUsername();
        this.password=users.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
