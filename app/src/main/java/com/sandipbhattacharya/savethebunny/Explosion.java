
// "explosion.java" falls under the package "com.sandipbhattacharya.savethebunny"
package com.sandipbhattacharya.savethebunny;

// provides connection to the Android system and the resources of the project
import android.content.Context;
// bitmap that is composed of a matrix of dots can be used
import android.graphics.Bitmap;
// creates a bitmap object with an image
import android.graphics.BitmapFactory;

public class Explosion {

    // create an array called "explosion" of type "Bitmap" which can store 4 elements
    Bitmap explosion[] = new Bitmap[4];
    // create a variable named "explosionFrame" that will be used as a parameter to the function below (getExplosion)
    int explosionFrame = 0;
    // create two variables - explosionX and explosionY
    int explosionX, explosionY;

    // explode(0,1,2,3) are png images of different designs (under main>res>drawable-v24)
    public Explosion(Context context){
        explosion[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explode0);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explode1);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explode2);
        explosion[3] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explode3);
    }

    // create a function called "getExplosion" that gets an int as a parameter and return a specific kind of explosion design based on that int (used as index)
    public Bitmap getExplosion(int explosionFrame){
        return explosion[explosionFrame];
    }
}
