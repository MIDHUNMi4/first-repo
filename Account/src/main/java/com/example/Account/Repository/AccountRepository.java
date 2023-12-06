package com.example.Account.Repository;

import com.example.Account.Model.AccountModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<AccountModel,String> {
    public AccountModel findByaccountid(int accountid);
    //public AccountModel deleteById(int accountid);
}