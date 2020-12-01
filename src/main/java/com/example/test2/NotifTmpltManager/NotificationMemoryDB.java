package com.example.test2.NotifTmpltManager;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository("memoryDB")
public class NotificationMemoryDB implements Ioperations{
    private List<NotificationTemplet> DB=new ArrayList<>(Arrays.asList(
            new NotificationTemplet("mail","Dear {x} , your booking of the {y} is confirmed. thanks for using our store :)"),
            new NotificationTemplet("sms","Dear {x} , your booking of the {y} is confirmed. thanks for using our store :)") ));

    @Override
    public void addTemplet(NotificationTemplet t) {
        DB.add(t);
    }

    @Override
    public NotificationTemplet getTemplet(String id) {
        return DB.stream().filter(t -> t.getId().equals(id) ).findFirst().get();
    }

    @Override
    public List<NotificationTemplet> getAllTemplets() {
        return DB;
    }

    @Override
    public void deletTemplet(String id) {
        DB.removeIf(t->t.getId().equals(id));
    }

    @Override
    public void updateTemplet(String id ,NotificationTemplet templet) {

        for (int i=0;i<DB.size();i++){
            NotificationTemplet t= DB.get(i);
            if(t.getId().equals(id)){
                DB.set(i,templet);
                return;
            }

    }}

}
