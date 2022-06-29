package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Alex", "Brodyaga", (byte) 20);
        userService.saveUser("Zloy", "Antonov", (byte) 25);
        userService.saveUser("Kocherizhka", "Stalker", (byte) 31);
        userService.saveUser("Maslina", "Slovlena", (byte) 38);

        for (User arg: userService.getAllUsers()) {
            System.out.println(arg);
        }

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();





    }
}
