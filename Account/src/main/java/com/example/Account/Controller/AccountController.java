package com.example.Account.Controller;

import com.example.Account.Model.AccountModel;
import com.example.Account.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private final AccountRepository repo = null;

    @Value("${greeting.message}")
    private String greetingMessage;
    @GetMapping("/greeting")
    public String getGreeting() {
        return greetingMessage;
    }


    @GetMapping("/value")
    public String getEnv() {
        // Retrieve the value from the environment variable
        String myValue = System.getenv("MY_ENV_VARIABLE");
        // Return the value in the response
        return "Value from Environment Variable: " + myValue;
    }


    @GetMapping("/SelectAll")
    public List<AccountModel> SelectAll() {
        return repo.findAll();
    }

    @GetMapping(path = "/Select/{accountid}")
    public AccountModel Select(@PathVariable int accountid){
        return repo.findByaccountid(accountid);
    }

    @PostMapping("/Save")
    public String Save(@RequestBody AccountModel account){
        repo.save(account);
        return "Saved successfully";
    }

    @PostMapping(path ="/Update")
    public String Update(@RequestBody AccountModel account) {
        try {
            AccountModel old=repo.findByaccountid(account.getAccountid());

            repo.delete(old);
            repo.save(account);
        }
        catch (Exception e ){
            return "error: there is issue while updating "+ e.getMessage();
        }
        return "Updated successfully";
    }




    @PostMapping(path ="/Delete/{accountid}")
    public String Delete(@PathVariable int accountid) {
        AccountModel Account=repo.findByaccountid(accountid);
        try {
            repo.delete(Account);
        }
        catch (Exception e ){

            return "error: there is issue while deleting ";

        }

        return "Delete successfully";
    }




}