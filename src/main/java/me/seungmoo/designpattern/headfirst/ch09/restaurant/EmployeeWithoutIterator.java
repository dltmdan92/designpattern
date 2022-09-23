package me.seungmoo.designpattern.headfirst.ch09.restaurant;

import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.DinerMenu;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.MenuItem;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.PancakeHouseMenu;

import java.util.List;

public class EmployeeWithoutIterator {

    /**
     * 메뉴에 있는 모든 항목을 출력
     */
    public void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        // List와 Array의 반복분 구현에는 차이점이 있다. --> 이거를 캡슐화해보자. 반복자 패턴으로
        // List는 size(), get()
        // Array는 length, [i]
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }

    /**
     * 아침 식사 항목만 출력
     */
    public void printBreakfastMenu() {

    }

    /**
     * 점심 식사 항목만 출력
     */
    public void printLunchMenu() {

    }

    /**
     * 채식주의자용 메뉴 항목만 출력
     */
    public void printVegetarianMenu() {

    }

    /**
     * 해당 항목이 채식주의자용이면 true를 리턴하고 그렇지 않으면 false를 리턴
     * @return boolean
     */
    public boolean isItemVegetarian(String name) {
        return true;
    }

}
