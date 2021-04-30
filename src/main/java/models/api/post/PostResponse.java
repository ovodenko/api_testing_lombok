package models.api.post;

import lombok.Getter;

@Getter
public class PostResponse {
  private int id;
  private String title;
  private String body;
  private int userId;
}
