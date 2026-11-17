package com.site.actor_management.Service;

import com.site.actor_management.Repo.ActorRepo;
import com.site.actor_management.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ActorService {
    @Autowired
    private ActorRepo actorRepo;
    public List<Actor> getAllActors(){
        return actorRepo.findAll();

    }
    public Actor getActorById(long id){
        return actorRepo.findById(id).orElse(null);
    }
    // CREATE NEW ACTOR
    public Actor addActor(Actor actor) {
        return actorRepo.save(actor);
    }

    // UPDATE ACTOR
    public Actor updateActor(long id, Actor updatedActor) {

        Actor actor = actorRepo.findById(id).orElse(null);

        if (actor != null) {
            actor.setName(updatedActor.getName());
            actor.setMovieName(updatedActor.getMovieName());

            return actorRepo.save(actor);
        }

        return null;
    }

    // DELETE ACTOR
    public String deleteActor(long id) {

        if (actorRepo.existsById(id)) {
            actorRepo.deleteById(id);
            return "Actor deleted successfully";
        }

        return "Actor not found";
    }


}
