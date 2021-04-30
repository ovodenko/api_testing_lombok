package impl;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.api.post.PostRequest;
import services.CreatePostService;

public class CreatePostServiceImpl implements CreatePostService {

  private final String POST_CREATION = "/posts";

  @Override
  public PostRequest createPost(PostRequest post) {
    String url = URL_EXTERNAL_MOCK + POST_CREATION;
    Response r = given().contentType(ContentType.JSON).body(post).post(url);
    if (r.statusCode() == 201) {
      return r.as(PostRequest.class);
    }
    return null;
  }
}
