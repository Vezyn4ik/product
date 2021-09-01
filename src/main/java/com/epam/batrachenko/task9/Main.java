package com.epam.batrachenko.task9;

import com.epam.batrachenko.task9.controller.Server;
import com.epam.batrachenko.task9.controller_factory.HttpControllerFactory;
import com.epam.batrachenko.task9.controller_factory.TcpControllerFactory;
import com.epam.batrachenko.task9.util.Constants;

public class Main {

    public static void main(String... args) {
        new Server(Constants.TCP_PORT).start(new TcpControllerFactory());
        new Server(Constants.HTTP_PORT).start(new HttpControllerFactory());
    }
}
