package main.java.com.irinayanushkevich.javacore.chapter_13;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
 */

class SimpleApplet extends Applet {

    public void paint(Graphics g) {
        g.drawString("Simple applet", 20, 20);
    }
}
