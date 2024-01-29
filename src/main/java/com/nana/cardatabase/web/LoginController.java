package com.nana.cardatabase.web;


import com.nana.cardatabase.domain.AccountCredentials;
import com.nana.cardatabase.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    //@Autowired
  //  private JwtService jwtService;

   // @Autowired
   //AuthenticatcationManager authenticatcationManager;
    @RequestMapping(value = "/login",method= RequestMethod
            .POST)
    public ResponseEntity<?> getToken(@RequestBody
                AccountCredentials credentials) {


        //Generate token and it in the response authorization
        UsernamePasswordAuthenticationToken creds =
                new UsernamePasswordAuthenticationToken(
                        credentials.getUsername(),
                        credentials.getPassword());

       // Authentication auth =
               // authenticationManager.authenticate(creds);
        //header
       // String jwts= jwtService.getToken(auth.getName());

        //Build response with the generated token
       // return ResponsEntity.ok()
              //  .header;

        return null;
    }
}
