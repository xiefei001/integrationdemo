package de.swm.integration.lab8;

import java.util.concurrent.Future;

/**
 * Created by xie on 2016/3/4.
 */
public interface PigLatinService {

    // synchronous
    //String translate(String english);

    // asynchronous
    Future<String> translate(String english);
}
