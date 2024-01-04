package com.blog.service;

import com.blog.dto_payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    void deleteComment(long commentId);


    List<CommentDto> getCommentsByPostId(long postId);

    List<CommentDto> getAllCommets();


    CommentDto updateComment(long commentId, CommentDto commentDto);
}
