package com.site.actor_management.controller;

import com.site.actor_management.model.Actor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/actor")
public class ActorController {
    List<Actor> actors = new ArrayList<>();
    public ActorController() {
        actors.add(new Actor(1, "John Doe", "The Great adventure"));
        actors.add(new Actor(2, "Jane Smith", "Mystery Island"));
    }
    //Read All Actors
        @GetMapping
    public List<Actor> getActorDetails(){
        return actors;
    }

    //Read Actors By Id
    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable int id){
        for (Actor actor : actors){
            if ( actor.getId() == id){
                return actor;
            }
        }
        return null;
    }
    // CREATE NEW ACTOR
    @PostMapping
    public Actor addActor(@RequestBody Actor actor) {
        actors.add(actor);
        return actor;
    }
    // UPDATE ACTOR
    @PutMapping("/{id}")
    public Actor updateActor(@PathVariable int id, @RequestBody Actor updatedActor) {

        for (Actor actor : actors) {
            if (actor.getId() == id) {

                actor.setName(updatedActor.getName());
                actor.setMovieName(updatedActor.getMovieName());

                return actor;
            }
        }

        return null;
    }

    // DELETE ACTOR
    @DeleteMapping("/{id}")
    public String deleteActorById(@PathVariable int id){
        for (Actor actor : actors){
            if ( actor.getId() == id) {
                actors.remove(actor);
                return "Actor deleted successfully";
            }
            }
        return "Actor not found";
    }
}
