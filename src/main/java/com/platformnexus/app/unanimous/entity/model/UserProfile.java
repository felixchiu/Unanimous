package com.platformnexus.app.unanimous.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by felixchiu on 3/13/16.
 */
@Entity(name="userProfile")
@Table(name="user_profile", schema = "unanimous")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserProfile {

    @Id
    @Column(name="email")
    private String email;

    @Column(name="nick_name")
    private String nickName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="first_name")
    private String firstName;
}
