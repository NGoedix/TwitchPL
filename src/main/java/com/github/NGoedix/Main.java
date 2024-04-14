package com.github.NGoedix;

import com.github.NGoedix.twitchpl.StreamNotFound;
import com.github.NGoedix.test.StreamQuality;
import com.github.NGoedix.test.TwitchUtil;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String stream = "illojuan";


        try {
            List<StreamQuality> qualities = TwitchUtil.getVod("2116939083");
//            List<StreamQuality> qualities = TwitchUtil.getStream(stream);

            for (StreamQuality quality : qualities)
                System.out.println(quality.getUrl());

            System.out.println(qualities);
        } catch (TwitchUtil.StreamNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}
