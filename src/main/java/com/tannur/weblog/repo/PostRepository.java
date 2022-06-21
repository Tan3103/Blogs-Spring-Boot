package com.tannur.weblog.repo;

import com.tannur.weblog.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
