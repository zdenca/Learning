package org.learning;

/**
 * Created by Zdenca on 4/27/2017.
 */
public class Champion {
    private String name;
    private int life;
    private int maxLife;
    private int attack;
    private int defense;
    private Cube cube;
    private String message;

    public Champion(String name, int life, int attack, int defense, Cube cube) {
        this.name = name;
        this.life = life;
        this.maxLife = life;
        this.attack = attack;
        this.defense = defense;
        this.cube = cube;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLastMessage() {
        return message;
    }

    public boolean isAlive() {
        if (life > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String imageLife() {
        String s = "[";
        int sum = 20;
        double count = Math.round((double) life / maxLife * sum);
        if ((count == 0) && (isAlive())) {
            count = 1;
        }
        for (int i = 0; i < count; i++) {
            s += "#";
        }
        for (int i = 0; i < sum - count; i++) {
            s += " ";
        }
        s += "]";
        return s;
    }

    public void attack(Champion infighter) {
        int hit = attack + cube.throwCube();
        setMessage(String.format("%s attack with hit %s hp", name, hit));
        infighter.defense(hit);
    }

    public void defense(int hit) {
        int injury = hit - (defense + cube.throwCube());
        if (injury > 0) {
            life -= injury;
            message = (String.format("%s he wounded %s hp", name, injury));
            setMessage(message);
            if (life <= 0) {
                life = 0;
                message += " and he died";
            }

        } else {
            message = String.format("%s resisted", name);
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
