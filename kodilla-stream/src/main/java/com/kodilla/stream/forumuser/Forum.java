package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {
    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "User1", 'M', LocalDate.of(1950,1,1), 0 ));
        listOfUsers.add(new ForumUser(2, "User2", 'F', LocalDate.of(1950,1,1), 5 ));
        listOfUsers.add(new ForumUser(3, "User3", 'M', LocalDate.of(1950,1,1), 5 ));
        listOfUsers.add(new ForumUser(4, "User4", 'M', LocalDate.of(1950,1,1), 5 ));
        listOfUsers.add(new ForumUser(5, "User5", 'F', LocalDate.of(2000,1,1), 5 ));
        listOfUsers.add(new ForumUser(6, "User6", 'M', LocalDate.of(2000,1,1), 5 ));
        listOfUsers.add(new ForumUser(7, "User7", 'F', LocalDate.of(2000,1,1), 5 ));
        listOfUsers.add(new ForumUser(8, "User8", 'F', LocalDate.of(2000,1,1), 0 ));
        listOfUsers.add(new ForumUser(9, "User9", 'M', LocalDate.of(2000,1,1), 0 ));
        listOfUsers.add(new ForumUser(10, "User10", 'M', LocalDate.of(2000,1,1), 0 ));
    }


    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfUsers);
    }


}
