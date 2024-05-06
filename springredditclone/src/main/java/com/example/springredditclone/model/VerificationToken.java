package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.Instant;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "token")
public class VerificationToken {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String token;
    @OneToOne(fetch = LAZY)
    private User user;
    private Instant expiryDate;
}




//package com.example.springredditclone.model;
//
////import lombok.AllArgsConstructor;
////import lombok.Data;
////import lombok.NoArgsConstructor;
//
//import jakarta.persistence.*;
//import java.time.Instant;
//
//import static jakarta.persistence.FetchType.LAZY;
//import static jakarta.persistence.GenerationType.IDENTITY;
//import static jakarta.persistence.GenerationType.SEQUENCE;
//
////@Data
////@AllArgsConstructor
////@NoArgsConstructor
//@Entity
//@Table(name = "token")
//public class VerificationToken {
//
//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    private Long id;
//    private String token;
//    @OneToOne(fetch = LAZY)
//    private User user;
//    private Instant expiryDate;
//
//    public Long getId(){
//        return this.id;
//    }
//    public void setId(Long nid){
//        this.id=nid;
//    }
//
//    public String getToken(){
//        return this.token;
//    }
//    public void setToken(String to){
//        this.token=to;
//    }
//
//    public Instant getExpiryDate(){
//        return this.expiryDate;
//    }
//    public void setExpiryDate(Instant ex){
//        this.expiryDate=ex;
//    }
//
//    public User getUser(){
//        return this.user;
//    }
//    public void setUser(User nuser){
//        this.user=nuser;
//    }
//
//    public VerificationToken(){
//    }
//
//    public VerificationToken(Long nid,String tok,User us,Instant ex){
//        this.id=nid;
//        this.token=tok;
//        this.user=us;
//        this.expiryDate=ex;
//    }
//}
