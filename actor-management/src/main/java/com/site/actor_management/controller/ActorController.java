package com.site.actor_management.controller;

import com.site.actor_management.Service.ActorService;
import com.site.actor_management.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ActorController {
    @Autowired
            private ActorService actorService;



    //Read All Actors
        @GetMapping("/actors")
    public List<Actor> getAllActor(){
        return actorService.getAllActors();
    }

    //Read Actors By Id
    @GetMapping("/actor/{id}")
    public Actor getActorById(@PathVariable long id){
                return actorService.getActorById(id);
            }

    // CREATE NEW ACTOR
    @PostMapping("/actors")
    public Actor addActor(@RequestBody Actor actor) {
        return actorService.addActor(actor);
    }
    // UPDATE ACTOR
    @PutMapping("/actor/{id}")
    public Actor updateActor(@PathVariable long id, @RequestBody Actor updatedActor) {
        return actorService.updateActor(id, updatedActor);

    }


    // DELETE ACTOR
    @DeleteMapping("/actor/{id}")
    public String deleteActorById(@PathVariable long id){

        return actorService.deleteActor(id);
    }
}
