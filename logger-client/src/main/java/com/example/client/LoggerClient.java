     package com.example.client;

     import com.example.logger.LoggerService;
     import org.osgi.service.component.annotations.Activate;
     import org.osgi.service.component.annotations.Component;
     import org.osgi.service.component.annotations.Reference;

     @Component
     public class LoggerClient {

         @Reference
         private LoggerService loggerService;

         @Activate
         public void start() {
             loggerService.log("Cliente iniciado y loggeando un mensaje de prueba.");
         }
     }
     