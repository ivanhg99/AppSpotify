package com.example.spotify;

public class PlaylistClase {
    String nompl;
    int id;

    public PlaylistClase(String nompl, int id) {
        this.nompl = nompl;
        this.id = id;
    }

    public PlaylistClase(String nompl) {
        this.nompl = nompl;
    }

    public String getNompl() {
        return nompl;
    }

    public void setNompl(String nompl) {
        this.nompl = nompl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
