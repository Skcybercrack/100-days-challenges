public class AccountHolder1 implements Runnable {
	private account account;

	public AccountHolder1(account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			makedeposit(2000);
			if (account.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	private synchronized void makedeposit(int deposit) {
		
			System.out.println(Thread.currentThread().getName()	+ " is going to deposit $"+deposit);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ex) {
			}
			account.deposit(deposit);
			System.out.println(Thread.currentThread().getName()	+ " completes the deposite of $"+deposit);
		System.out.println("balance is "	+ Thread.currentThread().getName() + " to withdraw "+ account.getBalance());

		}
	}

