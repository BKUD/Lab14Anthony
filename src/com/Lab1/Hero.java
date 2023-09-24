package com.Lab1;

public class Hero {
    private Movement movement;

    public Hero (Movement movement) {
        this.movement = movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public void move() {
        movement.move();
    }
}
