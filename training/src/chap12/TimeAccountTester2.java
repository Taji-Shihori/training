package chap12;

import chap10.Account;

class TimeAccountTester2 {

	static int compBalance(Account a, Account b) {
		if(a.getBalance() > b.getBalance())
			return 1;
		else if(a.getBalance() < b.getBalance())
			return -1;
		return 0;
	}

	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);
		TimeAccount2 nakata = new TimeAccount2("仲田真二", "654321", 200, 500);

		switch(compBalance(adachi, nakata)) {
		case  0 : System.out.println("足立君と仲田君の預金残高は同じ。"); break;
		case  1 : System.out.println("足立君のほうが預金残高が多い。"); break;
		case -1 : System.out.println("仲田君のほうが預金残高が多い。"); break;
		}
	}

}
