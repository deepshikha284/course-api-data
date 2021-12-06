package io.javabrains.courseapidata.topic;

import javax.persistence.*;

@Entity
@Table(name = "topic")
public class Topic {

    @Id
    private String topicId;
    private String topicName;
    private String topicDesc;

    public String getTopicId(){
        return this.topicId;
    }
    public void setTopicId(String topicId){
        this.topicId = topicId;
    }
    public String getTopicName(){
        return topicName;
    }
    public void setTopicName(String topicName){
        this.topicName = topicName;
    }
    public String getTopicDesc(){
        return topicDesc;
    }
    public void setTopicDesc(String topicDesc){
        this.topicDesc = topicDesc;
    }
}
