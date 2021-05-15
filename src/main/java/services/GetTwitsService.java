package services;

import java.io.IOException;
import java.util.List;
import models.api.twit.TwitResponse;

public interface GetTwitsService extends Basic {

  List<TwitResponse> getResponsePosts() throws IOException;
}
