package org.example;

import impl.CreatePostServiceImpl;
import impl.GetPostServiceImpl;
import java.io.IOException;
import java.util.List;
import models.api.post.PostRequest;
import models.api.post.PostResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;
import services.CreatePostService;
import services.GetPostsService;

/** Unit test for simple App. */
public class AppTest {

  @Test
  public void createPostTest() {
    PostRequest newPost =
        PostRequest.builder()
            .userId(999)
            .id(RandomUtils.nextInt())
            .title(RandomStringUtils.randomAlphabetic(5))
            .body(RandomStringUtils.randomAlphabetic(10))
            .build();

    CreatePostService authService = new CreatePostServiceImpl();
    PostRequest postCreated = authService.createPost(newPost);
    Assert.assertNotNull(postCreated.getTitle());
    Assert.assertEquals(999, postCreated.getUserId());
  }

  @Test
  public void getPostsTest() throws IOException {
    GetPostsService getPostsService = new GetPostServiceImpl();
    List<PostResponse> postResponse = getPostsService.getResponsePosts();
    Assert.assertNotNull(postResponse.get(0).getTitle());
    Assert.assertNotNull(postResponse.get(1).getBody());
  }
}
