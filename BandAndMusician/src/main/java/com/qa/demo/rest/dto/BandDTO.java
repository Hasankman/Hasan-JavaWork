package com.qa.demo.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.qa.demo.persitence.domain.Musician;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BandDTO {
	
    private Long id;

    private String name;

    private List<Musician> musicians = new ArrayList<>();

}