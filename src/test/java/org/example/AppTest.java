package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = myObj.nextLine();
        System.out.println(" Hello, " + name + ", nice to meet you!");

    }
}