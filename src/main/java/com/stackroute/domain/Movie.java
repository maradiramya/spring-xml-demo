package com.stackroute.domain;

public class Movie {

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    Actor actor;



    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }


}
