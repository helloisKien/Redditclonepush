package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.Instant;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long postId;
    @NotBlank(message = "Post Name cannot be empty or Null")
    private String postName;
    @Nullable
    private String url;
    @Nullable
    @Lob
    private String description;
    private Integer voteCount;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
    private Instant createdDate;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Subreddit subreddit;
}


////////////////////////////// CODE MÌNH VIẾT/////////////////////
//package com.example.springredditclone.model;
//
////import lombok.AllArgsConstructor;
////import lombok.Builder;
////import lombok.Data;
////import lombok.NoArgsConstructor;
//import org.springframework.lang.Nullable;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
//import java.time.Instant;
//
//import static jakarta.persistence.FetchType.LAZY;
//import static jakarta.persistence.GenerationType.SEQUENCE;
//
////@Data
//@Entity
////@Builder
////@AllArgsConstructor
////@NoArgsConstructor
//public class Post {
//    @Id
//    @GeneratedValue(strategy = SEQUENCE)
//    private Long postId;
//    @NotBlank(message = "Post Name cannot be empty or Null")
//    private String postName;
//    @Nullable
//    private String url;
//    @Nullable
//    @Lob
//    private String description;
//    private Integer voteCount;
//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name = "userId", referencedColumnName = "userId")
//    private User user;
//    private Instant createdDate;
//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name = "id", referencedColumnName = "id")
//    private Subreddit subreddit;
//
//    public Long getPostId(){
//        return this.postId;
//    }
//    public void setPostId(Long npostid){
//        this.postId=npostid;
//    }
//
//    public String getPostName(){
//        return this.postName;
//    }
//    public void setPostName(String npostname){
//        this.postName=npostname;
//    }
//
//    public String getUrl(){
//        return this.url;
//    }
//    public void setUrl(String nurl){
//        this.url=nurl;
//    }
//
//    public String getDescription(){
//        return this.description;
//    }
//    public void setDescription(String ndescription){
//        this.description=ndescription;
//    }
//
//    public Integer getVoteCount(){
//        return this.voteCount;
//    }
//    public void setVoteCount(Integer nVotec){
//        this.voteCount=nVotec;
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
//    public Subreddit getSubreddit(){
//        return this.subreddit;
//    }
//    public void setSubreddit(Subreddit nsubreddit){
//        this.subreddit=nsubreddit;
//    }
//
//    public Post(){
//    }
//
//    public Post(Long npostid,String npostname,String nurl,String ndes,Integer nVotec,User nuser,Instant ncdate,Subreddit nsub){
//        this.postId=npostid;
//        this.postName=npostname;
//        this.url=nurl;
//        this.description=ndes;
//        this.voteCount=nVotec;
//        this.user=nuser;
//        this.createdDate=ncdate;
//        this.subreddit=nsub;
//    }
//
//    public static PostBuilder builder() {
//        return new PostBuilder();
//    }
//
//    public static class PostBuilder {
//        private Long postId;
//        private String postName;
//        private String url;
//        private String description;
//        private Integer voteCount;
//        private User user;
//        private Instant createdDate;
//        private Subreddit subreddit;
//
//        PostBuilder() {
//        }
//
//        public PostBuilder postId(Long postId) {
//            this.postId = postId;
//            return this;
//        }
//
//        public PostBuilder postName(String postName) {
//            this.postName = postName;
//            return this;
//        }
//
//        public PostBuilder url(String url) {
//            this.url = url;
//            return this;
//        }
//
//        public PostBuilder description(String description) {
//            this.description = description;
//            return this;
//        }
//
//        public PostBuilder voteCount(Integer voteCount) {
//            this.voteCount = voteCount;
//            return this;
//        }
//
//        public PostBuilder user(User user) {
//            this.user = user;
//            return this;
//        }
//
//        public PostBuilder createdDate(Instant createdDate) {
//            this.createdDate = createdDate;
//            return this;
//        }
//
//        public PostBuilder subreddit(Subreddit subreddit) {
//            this.subreddit = subreddit;
//            return this;
//        }
//
//        public Post build() {
//            return new Post( this.postId, this.postName, this.url, this.description, this.voteCount, this.user, this.createdDate, this.subreddit);
//        }
//
//        public String toString() {
//            return "PostBuilder(postId=" + this.postId + ", postName=" +this.postName+ ", url=" +this.url+ ", description=" +this.description+ ", voteCount=" +this.voteCount+ ", user=" +this.user+ ", createdDate=" +this.createdDate+ ", subreddit=" +this.subreddit+")";
//
////            return "PostBuilder(firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", country=" + this.country + ")";
//        }
//    }
//
//
//}