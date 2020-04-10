package zw.co.econet.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import zw.co.econet.model.Speaker;

import java.util.ArrayList;
import java.util.List;
@Repository("repo")
public class SpeakerRepositoryImp implements SpeakerRepository {


    private Speaker speaker;

   /* public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    } */
    @Autowired
    public SpeakerRepositoryImp(Speaker speaker) {
        this.speaker = speaker;
        System.out.println(this.speaker);
    }



    @Override
    public List<Speaker> findSpeaker(){
        List<Speaker> speakers = new ArrayList<>();

        speaker.setFname("Marvelous");
        speaker.setLname("Mashamba");
        speakers.add(speaker);

        return speakers;
    }

}
