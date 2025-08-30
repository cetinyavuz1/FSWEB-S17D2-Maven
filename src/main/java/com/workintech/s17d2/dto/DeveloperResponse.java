package com.workintech.s17d2.dto;

import com.workintech.s17d2.model.Developer;

public record DeveloperResponse(Developer developer, int status, String message) {
}
