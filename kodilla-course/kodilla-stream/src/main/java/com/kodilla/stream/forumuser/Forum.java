package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(01, "username1", 'M', 2000, 6,6, 22));
        theForumUserList.add(new ForumUser(02, "username2", 'F', 1995, 1,1, 1));
        theForumUserList.add(new ForumUser(03, "username3", 'M', 1990, 2,15, 0));
        theForumUserList.add(new ForumUser(04, "username4", 'F', 2003, 7,30, 100));
        theForumUserList.add(new ForumUser(05, "username5", 'M', 1985, 8,11, 11));
        theForumUserList.add(new ForumUser(06, "username6", 'F', 2005, 9,9, 37));
        theForumUserList.add(new ForumUser(07, "username7", 'M', 1997, 12,1, 9));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
