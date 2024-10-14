package com.finalProject.Back.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OAuth2User {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String role;
    private String nickname;
    private String img;
}