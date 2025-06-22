package com.xworkz.podcast.runner;

import com.xworkz.podcast.dto.PodcastDto;
import com.xworkz.podcast.service.PodcastService;
import com.xworkz.podcast.service.PodcastServiceImpl;

public class PodcastRunner {
    public static void main(String[] args) {
        PodcastDto podcastDto=new PodcastDto(3,"sadguru","sadguru appa","spirtuality");
        PodcastService podcastService=new PodcastServiceImpl();
        podcastService.save(podcastDto);
    }
}
