package com.tannur.weblog.repo;

import com.tannur.weblog.model.Post;
import com.tannur.weblog.model.User;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    Post findByAuthor(User user);
}
