package com.epam.batrachenko.task9.commands;

import com.epam.batrachenko.task9.service.ProductService;

public class ErrorCommand extends Command {
    public ErrorCommand(ProductService productService) {
        super(productService);
    }

    @Override
    public String execute(String request) {
        return "Error";
    }
}
