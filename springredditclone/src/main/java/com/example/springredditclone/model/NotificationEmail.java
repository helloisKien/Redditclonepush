package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEmail {
    private String subject;
    private String recipient;
    private String body;
}


////////////////////////////// CODE MÌNH VIẾT/////////////////////
//package com.example.springredditclone.model;
//
////import lombok.AllArgsConstructor;
////import lombok.Data;
////import lombok.NoArgsConstructor;
//
//import java.time.Instant;
//
////@Data
////@AllArgsConstructor
////@NoArgsConstructor
//public class NotificationEmail {
//    private String subject;
//    private String recipient;
//    private String body;
//
//    public String getSubject(){
//        return this.subject;
//    }
//    public void setSubject(String sub){
//        this.subject=sub;
//    }
//
//    public String getRecipient(){
//        return this.recipient;
//    }
//    public void setRecipient(String re){
//        this.recipient=re;
//    }
//
//    public String getBody(){
//        return this.body;
//    }
//    public void setBody(String bo){
//        this.body=bo;
//    }
//
//    public NotificationEmail(){
//    }
//
//    public NotificationEmail(String sub,String re,String bo){
//        this.subject=sub;
//        this.recipient=re;
//        this.body=bo;
//
//    }
//}