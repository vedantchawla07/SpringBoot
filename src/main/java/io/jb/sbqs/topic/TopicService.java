package io.jb.sbqs.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =  new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework descriptioin"),
                new Topic("java", "core java", "Core java description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")));
    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){


        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//
//        for(Topic topic: topics){
//            if(topic.getId().equals(id))
//                return topic;
//        }
//        return null;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i = 0; i < topics.size(); i++){
            if(topics.get(i).getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {

        for(int i = 0; i < topics.size(); i++){
            if(topics.get(i).getId().equals(id)){
                topics.remove(i);
                return;
            }
        }
    }
}
