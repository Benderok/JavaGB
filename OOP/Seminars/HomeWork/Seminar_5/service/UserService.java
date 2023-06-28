package OOP.Seminars.HomeWork.Seminar_5.service;

import java.util.List;

import OOP.Seminars.HomeWork.Seminar_5.Model.User;

public interface UserService {
     void saveUser(User user);

     void removeUser(User user);

     void updateUser(int index, User user);

     List<User> getUserList();
}