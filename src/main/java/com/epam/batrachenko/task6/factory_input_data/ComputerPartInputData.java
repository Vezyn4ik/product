package com.epam.batrachenko.task6.factory_input_data;

import com.epam.batrachenko.task1.Entity.ComputerPart;
import com.epam.batrachenko.task1.Entity.Product;
import com.epam.batrachenko.task6.constants.Constants;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.Scanner;

public class ComputerPartInputData extends ProductInputData {
    private static final Logger log = LoggerFactory.getLogger(ComputerPartInputData.class);

    @Override
    public Product inputDataFromConsole() {
        Scanner sc = new Scanner(System.in);
        Product p = super.inputDataFromConsole();
        log.trace(Constants.INPUT_CATEGORY);
        String category = sc.nextLine();
        log.trace(Constants.INPUT_PURPOSE);
        String purpose = sc.nextLine();
        return new ComputerPart(p.getName(), p.getPrice(), p.getCountry(), category, purpose);
    }

    @Override
    public String toString() {
        return Constants.COMPUTER_PART;
    }
}

