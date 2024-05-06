package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Subreddit {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    @NotBlank(message = "Community name is required")
    private String name;
    @NotBlank(message = "Description is required")
    private String description;
    @OneToMany(fetch = LAZY)
    private List<Post> posts;
    private Instant createdDate;
    @ManyToOne(fetch = LAZY)
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
//import jakarta.validation.constraints.NotBlank;
//import java.time.Instant;
//import java.util.List;
//
//import static jakarta.persistence.FetchType.LAZY;
//import static jakarta.persistence.GenerationType.SEQUENCE;
//
////@Data
////@AllArgsConstructor
////@NoArgsConstructor
//@Entity
////@Builder
//public class Subreddit {
//    @Id
//    @GeneratedValue(strategy = SEQUENCE)
//    private Long id;
//    @NotBlank(message = "Community name is required")
//    private String name;
//    @NotBlank(message = "Description is required")
//    private String description;
//    @OneToMany(fetch = LAZY)
//    private List<Post> posts;
//    private Instant createdDate;
//    @ManyToOne(fetch = LAZY)
//    private User user;
//
//    public Long getId(){
//        return this.id;
//    }
//    public void setId(Long nid){
//        this.id=nid;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//    public void setName(String nname){
//        this.name=nname;
//    }
//
//    public List<Post> getPosts(){
//        return this.posts;
//    }
//    public void setPosts(List<Post> nposts){
//        this.posts=nposts;
//    }
//
//    public String getDescription(){
//        return this.description;
//    }
//    public void setDescription(String ndescription){
//        this.description=ndescription;
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
//    public void setCreatedDate(Instant nCdate){
//        this.createdDate=nCdate;
//    }
//
//    public Subreddit(){
//    }
//
//    public Subreddit(Long nid,String nname,String ndes,List<Post> nposts,Instant ncdate,User nuser){
//        this.id=nid;
//        this.name=nname;
//        this.description=ndes;
//        this.posts=nposts;
//        this.createdDate=ncdate;
//        this.user=nuser;
//    }
//
//    public static SubBuilder builder() {
//        return new SubBuilder();
//    }
//
//    public static class SubBuilder {
//        private Long id;
//        private String name;
//        private String description;
//        private List<Post> posts;
//        private Instant createdDate;
//        private User user;
//
//        SubBuilder() {
//        }
//
//        public SubBuilder id(Long id) {
//            this.id = id;
//            return this;
//        }
//
//        public SubBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public SubBuilder posts(List<Post> posts) {
//            this.posts = posts;
//            return this;
//        }
//
//        public SubBuilder description(String description) {
//            this.description=description;
//            return this;
//        }
//
//        public SubBuilder createdDate(Instant createdDate) {
//            this.createdDate = createdDate;
//            return this;
//        }
//
//        public SubBuilder user(User user) {
//            this.user = user;
//            return this;
//        }
//
//        public Subreddit build() {
//            return new Subreddit( this.id, this.name, this.description, this.posts, this.createdDate, this.user);
//        }
//
//        public String toString() {
//            return "SubBuilder(id=" + this.id + ", name=" +this.name+ ", description=" +this.description+ ", posts=" +this.posts+ ", createdDate=" +this.createdDate+ ", user=" +this.user+")";
//
////            return "PostBuilder(firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", country=" + this.country + ")";
//        }
//    }
//
//}
