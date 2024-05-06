package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import java.time.Instant;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long userId;
    @NotBlank(message = "Username is required")
    private String username;
    @NotBlank(message = "Password is required")
    private String password;
    @Email
    @NotEmpty(message = "Email is required")
    private String email;
    private Instant created;
    private boolean enabled;
}


//package com.example.springredditclone.model;
//
////import lombok.AllArgsConstructor;
////import lombok.Data;
////import lombok.NoArgsConstructor;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotEmpty;
//import java.time.Instant;
//
//import static jakarta.persistence.GenerationType.SEQUENCE;
//
////@Data
////@AllArgsConstructor
////@NoArgsConstructor
//@Entity
//public class User {
//    @Id
//    @GeneratedValue(strategy = SEQUENCE)
//    private Long userId;
//    public Long getUserId(){
//        return this.userId;
//    };
//    public void setUserId(Long newVal){
//        this.userId=newVal;
//    };
//
//    @NotBlank(message = "Username is required")
//    private String username;
//    public String getUsername(){
//        return this.username;
//    };
//    public void setUsername(String newUname){
//        this.username=newUname;
//    };
//
//    @NotBlank(message = "Password is required")
//    private String password;
//    public String getPassword(){
//        return this.password;
//    };
//    public void setPassword(String newPassword){
//        this.password=newPassword;
//    };
//
//    @Email
//    @NotEmpty(message = "Email is required")
//    private String email;
//    public String getEmail(){
//        return this.email;
//    };
//    public void setEmail(String newMail){
//        this.email=newMail;
//    };
//
//    private Instant created;
//    public Instant getCreated(){
//        return this.created;
//    };
//    public void setCreated(Instant newCre){
//        this.created=newCre;
//    };
//
//    private boolean enabled;
//    public boolean getEnabled(){
//        return this.enabled;
//    };
//    public void setEnabled(boolean newEna){
//        this.enabled=newEna;
//    };
//
//    public User(){
//    };
//
//    public User(Long userId,String username,String password,String email,Instant created,boolean enabled){
//        this.userId=userId;
//        this.username=username;
//        this.password=password;
//        this.email=email;
//        this.created=created;
//        this.enabled=enabled;
//    };
//}