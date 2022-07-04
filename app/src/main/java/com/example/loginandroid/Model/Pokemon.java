package com.example.loginandroid.Model;

import java.util.List;

public class Pokemon {

    private int id;
    private String name;
    private int height;
    private Species species;
    private Sprites sprites;
    private List<Stats> stats;
    private int weight;

    public Pokemon(){

    }
    public Pokemon(int id, String name, int height, Species species, Sprites sprites, List<Stats> stats, int weight) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.species = species;
        this.sprites = sprites;
        this.stats = stats;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<Stats> getStats() {
        return stats;
    }

    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
