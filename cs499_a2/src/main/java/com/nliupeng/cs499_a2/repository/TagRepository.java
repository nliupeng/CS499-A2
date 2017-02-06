package com.nliupeng.cs499_a2.repository;

import com.nliupeng.cs499_a2.domain.Tag;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Tag entity.
 */
@SuppressWarnings("unused")
public interface TagRepository extends JpaRepository<Tag,Long> {

}
