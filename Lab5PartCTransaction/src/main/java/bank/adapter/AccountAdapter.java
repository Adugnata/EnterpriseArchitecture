package bank.adapter;

import bank.domain.Account;
import bank.domain.AccountEntry;
import bank.dto.AccountDTO;
import bank.dto.AccountEntryDTO;

import java.util.*;

public class AccountAdapter {
    public static Account getAccountFromAccountDTO(AccountDTO accountDto){
        Account account = new Account();
        account.setAccountnumber(accountDto.getAccountnumber());
        account.setCustomer(CustomerAdapter.getCustomerFromCustomerDTO(accountDto.getCustomer()));
        for (AccountEntryDTO accountEntryDto : accountDto.getEntryList()){
            account.getEntryList().add(AccountEntryAdapter.getAccountEntryFromAccountEntryDTO(accountEntryDto));
        }
        return account;
    }

    public static AccountDTO getAccountDTOFromAccount(Account account){
        AccountDTO accountDto = new AccountDTO();
        accountDto.setAccountnumber(account.getAccountnumber());
        accountDto.setBalance(account.getBalance());
        accountDto.setCustomer(CustomerAdapter.getCustomerDTOFromCustomer(account.getCustomer()));
        account.getEntryList()
                .forEach(accountEntry-> accountDto
                        .getEntryList()
                        .add(AccountEntryAdapter.getAccountEntryDTOFromAccountEntry(accountEntry)));
        return accountDto;
    }

    public static List<AccountDTO> getAccountDTOListFromAccountList(List<Account> accountList){
        List<AccountDTO> accountDTOList = new ArrayList<AccountDTO>();
        accountList.forEach(account->accountDTOList.add(getAccountDTOFromAccount(account)));
        return accountDTOList;
    }
}
