package com.pti.mall.entity;


public class UmsRole {

    private int id;
    private String name;
    private String description;
    private int admin_count;
    private String create_time;
    private int status;
    private int sort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAdmin_count() {
        return admin_count;
    }

    public void setAdmin_count(int admin_count) {
        this.admin_count = admin_count;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }


    public UmsRole() {
    }

    @Override
    public String toString() {
        return "UmsRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", admin_count=" + admin_count +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                ", sort=" + sort +
                '}';
    }

    public UmsRole(int id, String name, String description, int admin_count, String create_time, int status, int sort) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.admin_count = admin_count;
        this.create_time = create_time;
        this.status = status;
        this.sort = sort;
    }
}
