package impl;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import models.api.post.PostResponse;
import services.GetPostsService;

public class GetPostServiceImpl implements GetPostsService {

  @Override
  public List<PostResponse> getResponsePosts() throws IOException {

    RestAssured.defaultParser = Parser.JSON;
    ObjectMapper objectMapper = new ObjectMapper();

    String url = URL_EXTERNAL_MOCK + "/posts";

    Response response = given().contentType(ContentType.JSON).get(url);

    String json = response.asString();
    Gson gson = new Gson();
    PostResponse[] empObject = gson.fromJson(json, PostResponse[].class);

    List<PostResponse> postResponseList = Arrays.asList(empObject);

    // List<String> jsonResponseRoot = response.jsonPath().getList("$");

    return postResponseList;
  }
}
