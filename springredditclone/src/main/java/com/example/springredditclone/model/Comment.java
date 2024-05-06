package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.time.Instant;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    @NotEmpty
    private String text;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "postId", referencedColumnName = "postId")
    private Post post;
    private Instant createdDate;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
}

////////////////////////////// CODE MÌNH VIẾT/////////////////////
//package com.example.springredditclone.model;
//
////import lombok.AllArgsConstructor;
////import lombok.Builder;
////import lombok.Data;
////import lombok.NoArgsConstructor;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotEmpty;
//import java.time.Instant;
//
//import static jakarta.persistence.FetchType.LAZY;
//import static jakarta.persistence.GenerationType.SEQUENCE;
//
////@Data
////@AllArgsConstructor
////@NoArgsConstructor
////@Builder
//@Entity
//public class Comment {
//    @Id
//    @GeneratedValue(strategy = SEQUENCE)
//    private Long id;
//    @NotEmpty
//    private String text;
//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name = "postId", referencedColumnName = "postId")
//    private Post post;
//    private Instant createdDate;
//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name = "userId", referencedColumnName = "userId")
//    private User user;
//
//    public Long getId(){
//        return this.id;
//    }
//    public void setId(Long nid){
//        this.id=nid;
//    }
//
//    public String getText(){
//        return this.text;
//    }
//    public void setText(String ntext){
//        this.text=ntext;
//    }
//
//    public Post getPost(){
//        return this.post;
//    }
//    public void setPost(Post npost){
//        this.post=npost;
//    }
//
//    public User getUser(){
//        return this.user;
//    }
//    public void setUser(User nuser){
//        this.user=nuser;
//    }
//
//    public Instant getCreatedDate(){
//        return this.createdDate;
//    }
//    public void setCreatedDate(Instant date){
//        this.createdDate=date;
//    }
//
//    public Comment(){
//    }
//
//    public Comment(Long nid,String text,Post npost,Instant date,User us){
//        this.id=nid;
//        this.text=text;
//        this.post=npost;
//        this.createdDate=date;
//        this.user=us;
//
//    }
//
//    public static ComBuilder builder() {
//        return new ComBuilder();
//    }
//
//    public static class ComBuilder {
//        private Long id;
//        private String text;
//        private Post post;
//        private Instant createdDate;
//        private User user;
//
//        ComBuilder() {
//        }
//
//        public ComBuilder id(Long id) {
//            this.id = id;
//            return this;
//        }
//
//        public ComBuilder text(String text) {
//            this.text = text;
//            return this;
//        }
//
//        public ComBuilder post(Post post) {
//            this.post = post;
//            return this;
//        }
//
//        public ComBuilder createdDate(Instant createdDate) {
//            this.createdDate = createdDate;
//            return this;
//        }
//
//        public ComBuilder user(User user) {
//            this.user = user;
//            return this;
//        }
//
//        public Comment build() {
//            return new Comment( this.id, this.text, this.post, this.createdDate, this.user);
//        }
//
//        public String toString() {
//            return "ComBuilder(id=" + this.id + ", text=" +this.text+ ", post=" +this.post+ ", createdDate=" +this.createdDate+ ", user=" +this.user+")";
//
////            return "PostBuilder(firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", country=" + this.country + ")";
//        }
//    }
//}
