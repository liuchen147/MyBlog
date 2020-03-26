package com.lc.service;

import com.lc.po.Comment;

import java.util.List;

/**
 * @author liuchen
 * @date 2020/3/25 -12:19
 */
public interface CommentService {

        List<Comment> listCommentByBlogId(Long blogId);

        Comment saveComment(Comment comment);
}
