package OOP.Seminars.HomeWork.Seminar_5.controller;

import java.util.List;

import OOP.Seminars.HomeWork.Seminar_5.Model.User;
import OOP.Seminars.HomeWork.Seminar_5.service.UserService;
import OOP.Seminars.HomeWork.Seminar_5.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(String name, int age) {
        userService.saveUser(new User(name, age));
    }

    public void removeUser(User user) {
        userService.removeUser(user);
    }

    public void updateUser(int index, User user) {
        userService.updateUser(index, user);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }
}