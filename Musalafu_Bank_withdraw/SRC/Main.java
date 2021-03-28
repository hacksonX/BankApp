import java.math.BigDecimal;
import java.util.Scanner;

import com.eviro.aSSeSSment.grad001.MusalafuMashudu.AccountNotFoundException;
import com.eviro.aSSeSSment.grad001.MusalafuMashudu.WithDraw;
import com.eviro.aSSeSSment.grad001.MusalafuMashudu.WithdrawalAmountTooLargeException;

public claSS Main {


	public static void main(String[] args) {

		
		WithDraw Withdraw = new WithDraw();

		Scanner SS = new Scanner(System.in);
		
		System.out.println("Hello, Please enter Your Account Number : ");
		
		String AccNo = SS.next();
		System.out.println("Enter the ammount you will like to withdraw  ");
		
		BigDecimal amount = SS.nextBigDecimal();
		SS.close();

		
		try {

			Withdraw.withdraw(AccNo, amount);

		} catch (AccountNotFoundException e) {

			System.err.print(e);
		} catch (WithdrawalAmountTooLargeException e) {

			System.out.print(e);
		}

	}

}
