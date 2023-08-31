package com.gradle.tutorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestCalculator {
    @Test void TestGetNum1() {
        Calculator c = new Calculator();
        assertEqual(c.getNum1(), "Hello, please enter the first integer number for the calculator.");
    }
}