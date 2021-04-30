package models.api.post;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostRequest {
  private int id;
  private String title;
  private String body;
  private int userId;

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getBody() {
    return body;
  }

  public int getUserId() {
    return userId;
  }
}
