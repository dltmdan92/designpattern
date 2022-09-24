package me.seungmoo.designpattern.headfirst.ch09.restaurant;

import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.CafeMenu;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.DinerMenu;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.PancakeHouseMenu;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.compositepattern.Menu;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.compositepattern.MenuComponent;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.compositepattern.MenuItem;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeWithIteratorTest {

    @Disabled
    @Test
    @DisplayName("반복자 패턴 테스트")
    void testIteratorPattern() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        //EmployeeWithIterator employeeWithIterator = new EmployeeWithIterator(pancakeHouseMenu, dinerMenu, cafeMenu);

        //employeeWithIterator.printMenu();
    }

    @Test
    @DisplayName("컴포지트 패턴 테스트")
    void testCompositePattern() {
        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요");

        MenuComponent allMenu = new Menu("전체 메뉴", "전체 메뉴");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);
        allMenu.add(dessertMenu);

        dinerMenu.add(new MenuItem(
                "파스타",
                "마리나라 소스 스파게티, 효모빵도 드립니다.",
                true,
                3.89
        ));

        dinerMenu.add(new MenuItem(
                "애플 파이",
                "바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀 있는 애플 파이",
                true,
                1.59
        ));

        EmployeeWithIterator employee = new EmployeeWithIterator(allMenu);

        employee.printMenu();
    }

}