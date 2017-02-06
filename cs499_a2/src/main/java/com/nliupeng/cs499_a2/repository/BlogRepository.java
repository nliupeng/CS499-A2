package com.nliupeng.cs499_a2.repository;

import com.nliupeng.cs499_a2.domain.Blog;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Blog entity.
 */
@SuppressWarnings("unused")
public interface BlogRepository extends JpaRepository<Blog,Long> {

    @Query("select blog from Blog blog where blog.user.login = ?#{principal.username}")
    List<Blog> findByUserIsCurrentUser();

}
