package com.artisan.gallery_backend.dto;

import com.artisan.gallery_backend.model.UserRole;

// The fix is here: Replaced @Data with explicit getters and setters.
public class SignUpRequest {
    private String fullName;
    private String email;
    private String password;
    private UserRole role;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
