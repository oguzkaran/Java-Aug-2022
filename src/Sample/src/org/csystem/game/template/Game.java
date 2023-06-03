package org.csystem.game.template;

public abstract class Game {
    public abstract void begin();
    public abstract void play();
    public abstract void pause();
    public abstract void load();
    public abstract void end();

    public final void run()
    {
        begin();

        //...

        load();
        play();

        //...

        pause();
        end();
    }
}
