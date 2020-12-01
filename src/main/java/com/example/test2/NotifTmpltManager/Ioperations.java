package com.example.test2.NotifTmpltManager;

import java.util.List;

public interface Ioperations {
    void addTemplet(NotificationTemplet t);
    NotificationTemplet getTemplet(String id);
    List<NotificationTemplet> getAllTemplets();
    void deletTemplet(String id);
    void updateTemplet(String  id,NotificationTemplet t);
}
