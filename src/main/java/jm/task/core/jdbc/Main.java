package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Pam", "Param", (byte) 64);
        userService.saveUser("Pam", "Param", (byte) 64);
        userService.saveUser("Pam", "Param", (byte) 64);
        userService.saveUser("Pam", "Param", (byte) 64);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
