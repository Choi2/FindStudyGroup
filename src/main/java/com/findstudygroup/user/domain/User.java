package com.findstudygroup.user.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class User {
    private Integer no;
    private String email;
    private String password;
}
