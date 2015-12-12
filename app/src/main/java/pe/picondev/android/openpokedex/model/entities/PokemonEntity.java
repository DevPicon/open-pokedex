package pe.picondev.android.openpokedex.model.entities;

import java.io.Serializable;

/**
 * Created by Armando on 12/12/2015.
 */
public class PokemonEntity implements Serializable {

    private String id;
    private String name;
    private String hp;
    private String attack;
    private String defense;
    private String speed;
    private String speedAttack;
    private String speedDefense;
    private String type;
    private String spriteUrl;
    private String artworkUrl;

    public String getArtworkUrl() {
        return artworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        this.artworkUrl = artworkUrl;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSpeedAttack() {
        return speedAttack;
    }

    public void setSpeedAttack(String speedAttack) {
        this.speedAttack = speedAttack;
    }

    public String getSpeedDefense() {
        return speedDefense;
    }

    public void setSpeedDefense(String speedDefense) {
        this.speedDefense = speedDefense;
    }

    public String getSpriteUrl() {
        return spriteUrl;
    }

    public void setSpriteUrl(String spriteUrl) {
        this.spriteUrl = spriteUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
