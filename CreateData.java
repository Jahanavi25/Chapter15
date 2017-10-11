package org.files;

import java.io.FileNotFoundException;
import java.util.Formatter;

import org.files2.Account;

public class CreateData {
	public static void main(String args[]) throws FileNotFoundException{
		TransactionRecord tr = new TransactionRecord(100,27.14);
		TransactionRecord tr1 = new TransactionRecord(300,62.11);
		TransactionRecord tr2 = new TransactionRecord(400,100.56);
		TransactionRecord tr3 = new TransactionRecord(900,82.17);
		TransactionRecord tr4 = new TransactionRecord(300,83.89);
		TransactionRecord tr5 = new TransactionRecord(700,80.78);
		TransactionRecord tr6 = new TransactionRecord(700,1.53);
		
		
		Account a = new Account(100,"Alan","Jones",348.17);
		Account a1 = new Account(300,"Mary","Smith",27.19);
		Account a2 = new Account(500,"sham","sharp",0.0);
		Account a3 = new Account(700,"suzy","green",-14.22);
		
		Account[] ar = {a,a1,a2,a3};
		TransactionRecord[] trr = {tr,tr1,tr2,tr3,tr4,tr5,tr6};
		
		
		Formatter outOldMaster = new Formatter("oldmast.txt");
		for(Account account:ar){
			outOldMaster.format("%d %s %s %.2f%n",account.getAccount(), account.getFirstName(), account.getLastName(), account.getBalance());
		}
			
		Formatter outTrans = new Formatter("trans.txt");
		for(TransactionRecord transactionrecord:trr){
			outTrans.format("%d  %.2f%n",transactionrecord.getAccountNumber(), transactionrecord.getAmount());
		}
		outOldMaster.close();
		outTrans.close();
		
		}


}
