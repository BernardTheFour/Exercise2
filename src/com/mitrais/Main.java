package com.mitrais;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Users> users = createUsers();
        showUsers(users);

        Transaction transaction = new Transaction();

        transaction.SendPoint(users.get(0), users.get(1), 100, 12, 1,2020);
        transaction.SendPoint(users.get(1), users.get(2), 500, 15, 4,2020);
        transaction.SendPoint(users.get(1), users.get(0), 750, 21, 3,2020);
        transaction.SendPoint(users.get(2), users.get(0), 400, 11, 6,2020);
        transaction.SendPoint(users.get(0), users.get(1), 650, 5, 7,2020);
        transaction.SendPoint(users.get(0), users.get(2), 50, 8, 11,2020);

        System.out.println("\n----- Show History-----");
        transaction.PrintHistory();

        System.out.println("\n----- Show User-----");
        showUsers(users);
    }

    public static Set<Users> createUsers(){
        Users arel = new Users();
        arel.setId(1);
        arel.setName("Arel");
        arel.setPoint(2000);

        Users bernard = new Users();
        bernard.setId(2);
        bernard.setName("Bernard");
        bernard.setPoint(2000);

        Users yanglain = new Users();
        yanglain.setId(3);
        yanglain.setName("dia");
        yanglain.setPoint(1000);
        Set<Users> usersList = new HashSet<>();
        //add
        usersList.add(arel);
        usersList.add(bernard);
        usersList.add(yanglain);

        return usersList;
    }

    public static void showUsers(Set<Users> users){
        for (Users user : users){
            System.out.println("Id : " + user.getId());
            System.out.println("Name : " + user.getName());
            System.out.println("Point : " + user.getPoint());
            System.out.println("---");
        }
    }
}
