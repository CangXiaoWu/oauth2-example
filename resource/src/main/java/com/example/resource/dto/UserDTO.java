package com.example.resource.dto;

/**
 * @author xuan
 * @create 2018-10-19 22:27
 **/
public class UserDTO {

    private String id;
    private String name;

    public UserDTO() {

    }

    public UserDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
