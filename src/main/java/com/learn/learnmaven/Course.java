package com.learn.learnmaven;

public class Course {
    private int id;
    private String name;
    private String description;

   public Course(int id, String name, String description){
       super();
       this.id = id;
       this.name = name;
       this.description = description;
   }


    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
       return "Course [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}
