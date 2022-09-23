package me.seungmoo.designpattern.headfirst.ch09.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeWithIteratorTest {

    @Test
    @DisplayName("반복자 패턴 테스트")
    void testIteratorPattern() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        EmployeeWithIterator employeeWithIterator = new EmployeeWithIterator(pancakeHouseMenu, dinerMenu);

        employeeWithIterator.printMenu();
    }

}