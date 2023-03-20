package com.ligang.principles.demo1;

public class client {
    public static void main(String[] args) {
        SougouInput input = new SougouInput();

        DefaultSkin skin = new DefaultSkin();

        input.setSkin(skin);
        input.display();

    }
}
