package com.example.test2.NotifTmpltManager;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NotificationTemplet {
    private String id;
    private String content;

    public NotificationTemplet(@JsonProperty("id") String id, @JsonProperty("content")String content) {
        this.id = id;
        this.content = content;
    }



    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
