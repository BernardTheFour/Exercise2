package com.mitrais;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Users> users = createUsers();
        showUsers(users);

    }

    public static List<Users> createUsers(){
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
        List<Users> usersList = new ArrayList<>();
        //add
        usersList.add(arel);
        usersList.add(bernard);
        usersList.add(yanglain);
        //System.out.println(usersList.isEmpty());
//        for (Users user : usersList){
//            System.out.println(user.getName());
//        }
        return usersList;
    }

    public static void showUsers(List<Users> users){
        for (Users user : users){
            System.out.println("Id : " + user.getId());
            System.out.println("Name : " + user.getName());
            System.out.println("Point : " + user.getPoint());
            System.out.println("---");
        }
    }
}
