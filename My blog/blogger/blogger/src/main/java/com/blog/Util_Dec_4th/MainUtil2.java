package com.blog.Util_Dec_4th;

import com.blog.dto_payload.PostDto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil2 {
    public static void main(String[] args) {

     //   MainUtil2 main=new MainUtil2();
        Post post1=new Post();
        post1.setId(1);
        post1.setTitle("aaa");
        post1.setContent("aaaa");


        Post post2=new Post();
        post2.setId(2);
        post2.setTitle("bbb");
        post2.setContent("bbbb");


        Post post3=new Post();
        post3.setId(3);
        post3.setTitle("ccc");
        post3.setContent("cccc");

        List<Post> posts= Arrays.asList(post3,post2,post1);
       // List<PostDto>dtos=posts.stream().map(main::mapToDto).collect(Collectors.toList());//use method reference//lambda expression  //called a method two semicoln
        List<PostDto>dtos=posts.stream().map(MainUtil2::mapToDto).collect(Collectors.toList());
        System.out.println(dtos);


    }
       //PostDto mapToDto(Post post){

   static PostDto mapToDto(Post post){
        PostDto dto=new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        return dto;
    }

}
