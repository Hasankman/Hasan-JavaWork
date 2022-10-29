package com.qa.demo.rest.dto;

import com.qa.demo.persitence.domain.Band;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MusicianDTO {

    private Long id;

    private String name;

    private Integer strings;

    private String type;

    private Band band;

}