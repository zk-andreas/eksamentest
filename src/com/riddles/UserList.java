package com.riddles;

import java.util.ArrayList;
import java.util.Collections;

public class UserList{
    private ArrayList<User> tmpUser = new ArrayList<>();
    private ArrayList<User> userArr = new ArrayList<>();

    public void runProgram(){
        User minUser = new User("Andreas","Bergmann", "andreas.bergmann3@gmail.com", 22338114);
        User minUser2 = new User("Andrea","Bergmann", "andreas.bergmann3@gmail.com", 22338114);
        User minUser3 = new User("Andreas","Bergman", "andreas.bergmann4@gmail.com", 22338114);
        addUser(minUser);
        addUser(minUser2);
        addUser(minUser3);
        sorterList();
    }
    public void addUser(User user){
        if(userArr.contains(user)){
            System.out.println("Findes allerede");
        }else{
            userArr.add(user);
            System.out.println(user);
        }
    }
    public ArrayList<User> sorterList(){
       tmpUser.add(new User("Daniel","Courtney", "andreas.bergmann3@gmail.com", 22338114));
       tmpUser.add(new User("Andreas","Bergmann", "andreas.bergmann4@gmail.com", 22338114));
       Collections.sort(tmpUser);
       for(User user : tmpUser){
           System.out.println(user.getFornavn() + " " + user.getEfternavn());
       }

       return tmpUser;
    }



}
