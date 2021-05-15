package org.example;

import impl.CreateTwitServiceImpl;
import impl.GetPostServiceImpl;
import java.io.IOException;
import java.util.List;
import models.api.twit.TwitRequest;
import models.api.twit.TwitResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;
import services.CreateTwittService;
import services.GetTwitsService;

/** Unit test for simple App. */
public class AppTest {

  @Test
  public void createTwitTest() {
    TwitRequest newPost =
        TwitRequest.builder()
            .userId(999)
            .id(RandomUtils.nextInt())
            .title(RandomStringUtils.randomAlphabetic(5))
            .body(RandomStringUtils.randomAlphabetic(10))
            .build();

    CreateTwittService authService = new CreateTwitServiceImpl();
    TwitRequest postCreated = authService.createTwit(newPost);
    Assert.assertNotNull(postCreated.getTitle());
    Assert.assertEquals(999, postCreated.getUserId());
  }

  @Test
  public void getPostsTest() throws IOException {
    GetTwitsService getPostsService = new GetPostServiceImpl();
    List<TwitResponse> postResponse = getPostsService.getResponsePosts();
    Assert.assertNotNull(postResponse.get(0).getTitle());
    Assert.assertNotNull(postResponse.get(1).getBody());
  }
}
