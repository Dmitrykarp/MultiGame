package ru.karpenkodi.game.gfx;

public class Font {
    private static String chars="АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ0123456789.,:;'\"!?()-=+/       ";
    public static void render(String msg, Screen screen, int x, int y, int colour){
        msg = msg.toUpperCase();

        for (int i=0; i<msg.length(); i++){
            int charIndex = chars.indexOf(msg.charAt(i));
            if (charIndex >= 31) charIndex +=1;
            if (charIndex >=0) screen.render(x + (i*8), y, charIndex + 24*31 -8, colour); //TODO
        }
    }
}
