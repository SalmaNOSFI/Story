package com.example.applicationpfe.module;

import java.util.Date;

public class Story {
    String id, idUser, content;
    Date creatDate;

    public Story(String id, String idUser, String content, Date creatDate) {
        this.id = id;
        this.idUser = idUser;
        this.content = content;
        this.creatDate = creatDate;
    }

    public String getId() {
        return id;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getContent() {
        return content;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }
}
