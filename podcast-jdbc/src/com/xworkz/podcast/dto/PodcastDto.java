package com.xworkz.podcast.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class PodcastDto {
    private Integer id;
    private String host;
    private String platform;
    private String topic;
}
