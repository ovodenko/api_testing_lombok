package models.api.twit;

import lombok.Getter;

@Getter
public class TwitResponse {
  private int id;
  private String title;
  private String body;
  private int userId;
}
