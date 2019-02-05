package com.imladyartist;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( new TokenReq().reqUrl.equals("https://oauth.vk.com/authorize" + "?client_id=6457262"
                + "&scope=messages"
                + "&redirect_uri=https://oauth.vk.com/blank.html"
                + "&response_type=token"
                + "&v=5.74") );
    }
}
