package com.bsptechs;

import com.bsptechs.dao.impl.UserRoleDAO;
import com.bsptechs.dao.inter.IUserRoleDAO;
import com.bsptechs.entities.UserRole;
import com.bsptechs.service.inter.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author sarkhanrasullu
 */
@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private IUserService userService;

    public static void main(String[] args) throws Exception {
//        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(Main.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }

    // Put your logic here.
    @Override
    public void run(String... args) {
        try {
            IUserRoleDAO us = new UserRoleDAO();
            int a = us.insert(new UserRole(25,"Adam"));
            System.out.println(a);
           
            
               
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        System.exit(0);
    }
}
