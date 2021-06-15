package com.xhx.service;

import com.xhx.po.Comment;

import java.util.List;

/**
 * Created by xhx on 2021/3/22.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
