package com.example.test2.NotifTmpltManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class NotificationService {
    private  Ioperations operations;

    @Autowired
    public NotificationService( @Qualifier("memoryDB") Ioperations operations) {
        this.operations = operations;
    }


    public void addTemplet(NotificationTemplet t){
        operations.addTemplet(t);
    }

    public NotificationTemplet getTemplet(String id){
        return operations.getTemplet(id);
    }
    public List<NotificationTemplet> getAllTemplet() {
        return operations.getAllTemplets();
    }

    public void deletTemplet(String id) {
        operations.deletTemplet(id);
    }

    public void updateTemplet(String id ,NotificationTemplet templet){
        operations.updateTemplet(id,templet);
    }
}
