package com.database.service;
import com.database.entities.Post;
import com.database.payload.PostDTO;
import com.database.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void savePost(PostDTO postDTO) {
        Post post = new Post(postDTO.getTitle(), postDTO.getContent());
        postRepository.save(post);
    }
}
