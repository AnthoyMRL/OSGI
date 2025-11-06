     package com.example.logger.impl;

     import com.example.logger.LoggerService;
     import org.osgi.service.component.annotations.Component;

     @Component(service = LoggerService.class)
     public class LoggerServiceImpl implements LoggerService {
         @Override
         public void log(String message) {
             System.out.println("INFO: " + message);
         }
     }
     