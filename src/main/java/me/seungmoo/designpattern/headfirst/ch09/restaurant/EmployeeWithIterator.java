package me.seungmoo.designpattern.headfirst.ch09.restaurant;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.Menu;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.MenuItem;

import java.util.Iterator;

@RequiredArgsConstructor
public class EmployeeWithIterator {
    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

        System.out.println("메뉴\n----\n아침 메뉴");
        printMenu(pancakeIterator);
        System.out.println("\n점심 메뉴");
        printMenu(dinerIterator);
    }

    /**
     * iterator 패턴 덕분에 반복문을 한번만 선언하면 된다.
     * iterator 패턴으로 컬렉션 호출 부분이 캡슐화되었다.
     * 사용자는 메뉴 항목의 컬렉션이 어떤 식으로 저장되는지 전혀 알 필요가 없다.
     * 사용자는 iterator 라는 인터페이스만 알면 된다.
     *
     * @param iterator
     */
    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
