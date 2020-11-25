package test.java.bgu.spl.mics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.Test;

import java.bgu.spl.mics.MessageBusImpl;
import java.util.concurrent.TimeUnit;


import static org.junit.jupiter.api.Assertions.*;

public class MessageBusTest {

    private MessageBusImpl messageBus;

    @BeforeEach
    public void setUp(){
        messageBus = messageBus.getInstance();
    }



}