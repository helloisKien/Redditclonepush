package com.example.springredditclone.dto;

//public class PostResponse{
//
//}
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    private Long id;
    private String postName;
    private String url;
    private String description;
    private String userName;
    private String subredditName;
//    private Integer voteCount;
//    private Integer commentCount;
//    private String duration;
//    private boolean upVote;
//    private boolean downVote;
}
//////////////////////////////
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class PostResponse {
//    private Long id;
//    private String postName;
//    private String url;
//    private String description;
//    private String userName;
//    private String subredditName;
//}
