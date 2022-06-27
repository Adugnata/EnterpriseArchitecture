package bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    private long accountnumber;
    private double balance;
    private Collection<AccountEntryDTO> entryList = new ArrayList<AccountEntryDTO>();
    private CustomerDTO customer;

    public AccountDTO(long accountnr) {
        this.accountnumber = accountnr;
    }

}
