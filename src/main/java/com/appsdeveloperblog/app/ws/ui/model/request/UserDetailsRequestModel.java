package com.appsdeveloperblog.app.ws.ui.model.request;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class UserDetailsRequestModel {
    @NotNull(message="First name cannot be null.")
    private String FirstName;
    @NotNull(message="Last name cannot be null.")
    private String LastName;
    @NotNull(message="Email cannot be null.")
    @Email
    private String Email;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    } 

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private String Password;
}
