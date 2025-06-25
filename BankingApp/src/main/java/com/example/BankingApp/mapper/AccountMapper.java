package com.example.BankingApp.mapper;

import com.example.BankingApp.dto.AccountDto;
import com.example.BankingApp.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
//        Account account = new Account(
//                accountDto.getId(),
//                accountDto.getAccountHolderName(),
//                accountDto.getBalance()

        Account account = new Account(
                 accountDto.id(),
                 accountDto.accountHolderName(),
                 accountDto.balance()

        );
        return account;
    }
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;


    }
}
