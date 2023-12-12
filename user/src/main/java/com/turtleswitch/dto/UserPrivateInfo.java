package com.turtleswitch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPrivateInfo {
    private int year;
    private Date birthday;
    private String phoneNo;
    private String email;
}
