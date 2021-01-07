package chap12;

import chap10.Account;

class TimeAccount2 extends Account {
	private long timeBalance;

	TimeAccount2(String name, String no, long balance, long timeBalance){
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	long getTimeBalance() {
		return timeBalance;
	}

	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}
