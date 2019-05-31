package cn.lx.bm.model;

import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String phone;

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
}