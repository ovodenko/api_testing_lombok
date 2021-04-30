package services;

import models.api.post.PostRequest;

public interface CreatePostService extends Basic {

  PostRequest createPost(PostRequest post);
}
