package org.sk.streams;

import org.sk.streams.data.Users;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorMinor {
    public static void main(String args[]) {
        List<Users> users = Arrays.asList(
                new Users(1, "Alice",15),
                new Users(2, "Bob",21),
                new Users(3, "Charlie",17),
                new Users(4, "David",32)
        );
       Map<Boolean , List<Users>> partionData = users.stream().collect(Collectors.partitioningBy(
                    user -> user.getAge() > 18
            ));
        System.out.println("Partition Data: "+partionData);
    }

}
