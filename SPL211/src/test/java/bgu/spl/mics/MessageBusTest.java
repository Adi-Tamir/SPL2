package test.java.bgu.spl.mics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.Test;

import java.bgu.spl.mics.*;
import java.util.concurrent.TimeUnit;


import static org.junit.jupiter.api.Assertions.*;

public class MessageBusTest {

    private MessageBusImpl messageBus;

    @BeforeEach
    public void setUp() {
        messageBus = messageBus.getInstance();
    }

    @AfterAll
    public void tearDown() {
        messageBus = messageBus.getInstance();
    }

    @Test
    public void testSubscribeEvent() {

    }

    @Test
    public void testSubscribeBroadcast() {

    }

    @Test
    public void testComplete() {

    }

    @Test
    public void testSendBroadcast() {

    }


    @Test
    public void testSendEvent() {

    }

    @Test
    public void testRegister() {

    }

    @Test
    public void testUnregister() {

    }

    @Test
    public void testAwaitMessage() {

    }
}