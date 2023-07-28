package com.ivoronline.springboot_cors_destination.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
public class MyController {

  //=======================================================================
  // DESTINATION
  //=======================================================================
  @ResponseBody
  @RequestMapping("/Destination")
  public String destination() {
    return "Hello from Destination Controller";
  }

}