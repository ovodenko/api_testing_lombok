package services;

import models.api.twit.TwitRequest;

public interface CreateTwittService extends Basic {

  TwitRequest createTwit(TwitRequest post);
}
