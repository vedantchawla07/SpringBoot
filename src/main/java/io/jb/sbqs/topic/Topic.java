package io.jb.sbqs.topic;

public class Topic {
    private String id;
    private String name;
    private String description;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        //System.out.println("getId called once");
        return id;
    }


    public String getName() {
        //System.out.println("getName called Once");
        return name;
    }

    public String getDescription() {
        //System.out.println("getDescption called once");
        return description;
    }
}
