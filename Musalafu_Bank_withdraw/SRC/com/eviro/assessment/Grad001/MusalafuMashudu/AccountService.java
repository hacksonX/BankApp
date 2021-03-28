
package com.eviro.assessment.grad001.MusalafuMashudu;

import java.math.BigDecimal;

/**
 * @Musalafu Mashudu
 *
 */

public interface AccountService {
 
	public void withdraw(String AccNum,BigDecimal WithdrawAmount) throws AccountNotFoundException, WithdrawalAmountTooLargeException;

	
}
