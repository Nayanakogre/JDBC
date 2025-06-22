package com.xworkz.podcast.service;

import com.xworkz.podcast.dto.PodcastDto;
import com.xworkz.podcast.repository.PodcastRepository;
import com.xworkz.podcast.repository.PodcastRepositoryImpl;

public class PodcastServiceImpl implements PodcastService{
    PodcastRepository podcastRepository=new PodcastRepositoryImpl();
    @Override
    public void save(PodcastDto podcastDto) {
        if(podcastDto!=null)
        {
            System.out.println("proced");
            podcastRepository.save(podcastDto);
        }
        else {
            System.out.println("dto is null");
        }
    }
}
