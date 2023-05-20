package org.csystem.app.game.combat;

import org.csystem.app.game.combat.color.Color;
import org.csystem.app.game.combat.enemy.Enemy;
import org.csystem.util.string.StringUtil;
import org.csystem.util.thread.ThreadUtil;

import java.util.Arrays;
import java.util.Random;

public class StoreEnemiesToArrayDemoApp {
    private static void run()
    {
        Random r = new Random();
        Enemy [] enemies = new Enemy[10];
        Color [] colors = Color.values();
        int idx = 0;


        for (;;) {
            Enemy enemy = new Enemy();

            enemy.setName(StringUtil.getRandomTextEN(r, r.nextInt(5, 11)))
                    .setColor(colors[r.nextInt(colors.length)]);

            if (enemies.length == idx)
                enemies = Arrays.copyOf(enemies, enemies.length * 2);

            enemies[idx++] = enemy;

            ThreadUtil.sleep(1000);

            System.out.println("---------------------------------------------");
            System.out.printf("Size:%d, Capacity:%d%n", idx, enemies.length);
            for (int i = 0; i < idx; ++i)
                System.out.println(enemies[i].toString());
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
