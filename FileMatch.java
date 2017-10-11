package org.files;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Formatter;
import java.util.Scanner;

public class FileMatch {
	
	public static void main(String args[]) throws IOException{
		
		Scanner inOldMaster= new Scanner(Paths.get("oldmast.txt"));
		Scanner inTransaction= new Scanner(Paths.get("trans.txt"));
		Formatter outlog = new Formatter("log.txt");

		
		List<Account> accounts = new ArrayList<Account>();
		while(inOldMaster.hasNext()){
		Account account = new Account();
		account.setAccount(inOldMaster.nextInt());
		account.setFirstName(inOldMaster.next());
		account.setLastName(inOldMaster.next());
		account.setBalance(inOldMaster.nextDouble());
		accounts.add(account);
		}
		
		
		
		while(inTransaction.hasNext()){
		TransactionRecord transaction = new TransactionRecord();
		transaction.setAccountNumber(inTransaction.nextInt());
		transaction.setAmount(inTransaction.nextDouble());
		boolean isAccountMatch=false;
		for(Account account: accounts){
			if(account.getAccount()==transaction.getAccountNumber()){
				account.combine(transaction);
				isAccountMatch=true;
			}
		}	
		if(!isAccountMatch){
			outlog.format("%s %n", "Unmatched transaction record for account number.."+transaction.getAccountNumber());
		}
		}
	
		
		
		Formatter newMaster = new Formatter("newmast.txt");
		for(Account account:accounts){
			newMaster.format("%d %s %s %.2f%n",account.getAccount(), account.getFirstName(), account.getLastName(), account.getBalance());
		}
		newMaster.close();
		outlog.close();
		
		
	}
		
	}


