package com.lc.dao;

import com.lc.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liuchen
 * @date 2020/3/25 -12:22
 */
public interface CommentRepository extends JpaRepository<Comment,Long> {

        List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);

}
