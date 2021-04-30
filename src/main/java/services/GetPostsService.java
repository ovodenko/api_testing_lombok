package services;

import java.io.IOException;
import java.util.List;
import models.api.post.PostResponse;

public interface GetPostsService extends Basic {

  List<PostResponse> getResponsePosts() throws IOException;
}
