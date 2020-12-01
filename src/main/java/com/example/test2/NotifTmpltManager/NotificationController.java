package com.example.test2.NotifTmpltManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class NotificationController {
    private final NotificationService notificationService;

    @Autowired
    public NotificationController( NotificationService ns) {
        this.notificationService=ns;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/ntf")
    public void addnewTemplet(@RequestBody NotificationTemplet t){
        notificationService.addTemplet(t);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/ntf")
    public List<NotificationTemplet> getAllTemplets(){
        return notificationService.getAllTemplet();
    }


    @RequestMapping(method = RequestMethod.GET,value = "/ntf/{id}")
    public NotificationTemplet getTempletById(@PathVariable("id") String id){
        return notificationService.getTemplet(id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/ntf/{id}")
    public void deletTemplet(@PathVariable("id")String id){
        notificationService.deletTemplet(id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/ntf/{id}")
    public void updateTemplate(@PathVariable("id") String id ,@RequestBody NotificationTemplet t){
        notificationService.updateTemplet(id,t);
    }



}
