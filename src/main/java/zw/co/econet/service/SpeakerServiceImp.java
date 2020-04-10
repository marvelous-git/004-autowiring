package zw.co.econet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zw.co.econet.model.Speaker;
import zw.co.econet.repository.SpeakerRepository;
import zw.co.econet.repository.SpeakerRepositoryImp;

import java.util.List;
@Component("service")
public class SpeakerServiceImp implements SpeakerService {
    @Autowired
    private SpeakerRepository repo;


    public void setRepo(SpeakerRepository repo) {
        System.out.println("setter method called...");
        this.repo = repo;
    }

    public SpeakerServiceImp(SpeakerRepository repo) {
        System.out.println("constructor called...");
        this.repo = repo;
    }

  /*  public SpeakerServiceImp() {
       System.out.println("no arg constructer called...");
    }

   */

    @Override
    public List<Speaker> findAll(){
        return repo.findSpeaker() ;
    }
}
