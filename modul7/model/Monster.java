package com.example.modul7.model;

public class Monster {
    private String id;
    private String name;
    private String type;
    private int health;
    private String desc;

    public Monster(String id, String name, String type, int health, String desc) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.health = health;
        this.desc = desc;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public int getHealth() { return health; }
    public String getDesc() { return desc; }
}