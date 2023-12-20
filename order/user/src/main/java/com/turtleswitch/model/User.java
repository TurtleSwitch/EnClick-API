package com.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name="USER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name="USER_ID")
    private String userId;

    @Column(name="NICK_NM")
    private String nickNm;
    @Column(name="NM")
    private String nm;
    @Column(name="AGE")
    private String age;
    @Column(name="EMAIL")
    private String email;
    @Column(name="BIRTH_YEAR")
    private int birthYear;
    @Column(name="BIRTH_DT")
    private Date birthDt;
    @Column(name="GENDER")
    private String gender;
    @Column(name="PHONE_NUM")
    private String phoneNum;
    @Column(name="PROFILE_PIC_URL")
    private String profilePicUrl;
    @Column(name="REGISTER_DT")
    private LocalDateTime registerDt;
    @Column(name="LAST_LOGIN_DT")
    private LocalDateTime lastLoginDt;
    @Column(name="USED_YN")
    private char usedYn;
    @Column(name="REGI_DT", updatable=false)
    @CreationTimestamp
    private LocalDateTime regiDt;
    @Column(name="UPDA_DT", insertable=false)
    @UpdateTimestamp
    private LocalDateTime updaDt;
}
