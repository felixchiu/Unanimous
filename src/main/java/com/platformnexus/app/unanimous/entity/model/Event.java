package com.platformnexus.app.unanimous.entity.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by felixchiu on 3/13/16.
 */
@Data
public class Event {

    private String eventCode;

    private String creatorEmail;

    private Date createdDate;

    private String topic;


}
