package OOP.Seminars.HomeWork.Seminar_5.controller;

import OOP.Seminars.HomeWork.Seminar_5.service.UserBalanceService;
import OOP.Seminars.HomeWork.Seminar_5.service.UserBalanceServiceImpl;

public class UserBalanceController {
    private UserBalanceService userBalanceService = new UserBalanceServiceImpl();

    public int getBalance(int index) {
        return userBalanceService.getBalance(index);
    }

    public int withdrawal(int index, int amount) {
        return userBalanceService.withdrawal(index, amount);
    }

    public void payment(int index, int amount) {
        userBalanceService.payment(index, amount);
    }
}