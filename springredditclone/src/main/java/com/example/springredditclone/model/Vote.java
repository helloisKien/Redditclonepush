package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Vote {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long voteId;
    private VoteType voteType;
    @NotNull
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "postId", referencedColumnName = "postId")
    private Post post;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
}



//package com.example.springredditclone.model;
//
////import lombok.AllArgsConstructor;
////import lombok.Builder;
////import lombok.Data;
////import lombok.NoArgsConstructor;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;
//
//import java.time.Instant;
//
//import static jakarta.persistence.FetchType.LAZY;
//import static jakarta.persistence.GenerationType.SEQUENCE;
//
////@Data
////@AllArgsConstructor
////@NoArgsConstructor
//@Entity
////@Builder
//public class Vote {
//    @Id
//    @GeneratedValue(strategy = SEQUENCE)
//    private Long voteId;
//    private VoteType voteType;
//    @NotNull
//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name = "postId", referencedColumnName = "postId")
//    private Post post;
//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name = "userId", referencedColumnName = "userId")
//    private User user;
//
//    public Long getVoteId(){
//        return this.voteId;
//    }
//    public void setVoteId(Long vid){
//        this.voteId=vid;
//    }
//
//    public VoteType getVoteType(){
//        return this.voteType;
//    }
//    public void setVoteType(VoteType nvtype){
//        this.voteType=nvtype;
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
//    public Vote(){
//    }
//
//    public Vote(Long vid,VoteType vtype,Post npost,User nu){
//        this.voteId=vid;
//        this.voteType=vtype;
//        this.post=npost;
//        this.user=nu;
//    }
//
//    public static VoteBuilder builder() {
//        return new VoteBuilder();
//    }
//
//    public static class VoteBuilder {
//        private Long voteId;
//        private VoteType voteType;
//        private Post post;
//        private User user;
//
//
//        VoteBuilder() {
//        }
//
//        public VoteBuilder voteId(Long voteId) {
//            this.voteId = voteId;
//            return this;
//        }
//
//        public VoteBuilder voteType(VoteType voteType) {
//            this.voteType = voteType;
//            return this;
//        }
//
//        public VoteBuilder post(Post post) {
//            this.post = post;
//            return this;
//        }
//
//        public VoteBuilder user(User user) {
//            this.user = user;
//            return this;
//        }
//
//
//        public Vote build() {
//            return new Vote( this.voteId, this.voteType, this.post, this.user);
//        }
//
//        public String toString() {
//            return "VoteBuilder(voteId=" + this.voteId + ", voteType=" +this.voteType+ ", post=" +this.post+ ", user=" +this.user+ ")";
//
////            return "PostBuilder(firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", country=" + this.country + ")";
//        }
//    }
//}