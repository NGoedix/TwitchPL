package com.github.NGoedix;

import com.github.NGoedix.twitchpl.StreamNotFound;
import com.github.NGoedix.twitchpl.StreamQuality;
import com.github.NGoedix.twitchpl.TwitchUtil;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String stream = "ibai";

        try {
            List<StreamQuality> qualities = TwitchUtil.getStream(stream);

            for (StreamQuality quality : qualities)
                System.out.println(quality.getUrl());
        } catch (StreamNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}
