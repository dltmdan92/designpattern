package me.seungmoo.designpattern.headfirst.ch10;

import lombok.ToString;
import me.seungmoo.designpattern.headfirst.ch10.states.StateCode;

@ToString(onlyExplicitlyIncluded = true)
public class GumballMachine {

    @ToString.Include
    private StateCode state = StateCode.SOLD_OUT;
    @ToString.Include
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = StateCode.NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case HAS_QUARTER -> System.out.println("동전은 한 개만 넣어주세요.");
            case NO_QUARTER -> {
                state = StateCode.HAS_QUARTER;
                System.out.println("동전이 투입되었습니다.");
            }
            case SOLD_OUT -> System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
            case SOLD -> System.out.println("알맹이를 내보내고 있습니다.");
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case HAS_QUARTER -> {
                System.out.println("동전이 반환됩니다.");
                state = StateCode.NO_QUARTER;
            }
            case NO_QUARTER -> System.out.println("동전을 넣어주세요.");
            case SOLD -> System.out.println("이미 알맹이를 뽑으셨습니다.");
            case SOLD_OUT -> System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        }
    }

    public void turnCrank() {
        switch (state) {
            case SOLD -> System.out.println("손잡이는 한 번만 돌려 주세요.");
            case NO_QUARTER -> System.out.println("동전을 넣어 주세요.");
            case SOLD_OUT -> System.out.println("매진되었습니다.");
            case HAS_QUARTER -> {
                System.out.println("손잡이를 돌리셨습니다.");
                state = StateCode.SOLD;
                dispense();
            }
        }
    }

    private void dispense() {
        switch (state) {
            case SOLD -> {
                System.out.println("알맹이를 내보내고 있습니다.");
                count--;
                if (count == 0) {
                    System.out.println("더 이상 알맹이가 없습니다.");
                    state = StateCode.SOLD_OUT;
                } else {
                    state = StateCode.NO_QUARTER;
                }
            }
            case NO_QUARTER -> System.out.println("동전을 넣어 주세요.");
            case SOLD_OUT -> System.out.println("매진입니다.");
            case HAS_QUARTER -> System.out.println("알맹이를 내보낼 수 없습니다.");
        }
    }
}
