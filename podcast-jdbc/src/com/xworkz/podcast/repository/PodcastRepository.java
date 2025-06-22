package com.xworkz.podcast.repository;

import com.xworkz.podcast.dto.PodcastDto;

public interface PodcastRepository {
    public void save(PodcastDto podcastDto);
}
