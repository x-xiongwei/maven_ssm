package com.maven.ssm.po;

public class Student {
    private Integer id;

    private String name;

    private String kecheng;

    private Double chengji;

    private Integer banji;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getKecheng() {
        return kecheng;
    }

    public void setKecheng(String kecheng) {
        this.kecheng = kecheng == null ? null : kecheng.trim();
    }

    public Double getChengji() {
        return chengji;
    }

    public void setChengji(Double chengji) {
        this.chengji = chengji;
    }

    public Integer getBanji() {
        return banji;
    }

    public void setBanji(Integer banji) {
        this.banji = banji;
    }
}