

import processing.core.PApplet;

public class BallAnimation extends PApplet {
    Ball[] balls; 

    public static void main(String[] args) {
        PApplet.main("BallAnimation");
    }

    public void settings() {
        size(800, 400); // Set the canvas size
    }

    public void setup() {
        // Initialize balls with their heights and speeds
        balls = new Ball[]{
            new Ball(this, 1.0f / 5, 1),
            new Ball(this, 2.0f / 5, 2),
            new Ball(this, 3.0f / 5, 3),
            new Ball(this, 4.0f / 5, 4)
        };
    }

    public void draw() {
        background(220); 
        
        for (Ball ball : balls) {
            ball.move();
            ball.display();
        }
    }
}

class Ball {
    PApplet p; 
    float x; 
    float y; 
    int speed; 
    float radius = 30; 

    // Constructor
    public Ball(PApplet p, float heightFraction, int speed) {
        this.p = p;
        this.x = 0; 
        this.y = heightFraction * p.height; 
        this.speed = speed;
    }

    // Method to move the ball
    public void move() {
        x += speed; 
        if (x > p.width) {
            x = 0; 
        }
    }

    // Method to display the ball
    public void display() {
        p.fill(50 + speed * 50, 100, 200); 
        p.ellipse(x, y, radius, radius); 
    }
}
