package me.seungmoo.designpattern.headfirst.ch09.restaurant;

import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.DinerMenu;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.PancakeHouseMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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