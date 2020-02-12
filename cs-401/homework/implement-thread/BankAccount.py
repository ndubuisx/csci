# Name: Emmanuel Ndubuisi
# Threading Classwork 

# importing the threading module 
import threading 

class BankAccount:
  def __init__(self, balance):
    self.balance = balance

  def get_balance(self):
    return self.balance

  def put_balance(self, balance):
    self.balance = balance

  def withdraw(self, amount):
    balance = self.get_balance()
    balance = balance - amount
    self.put_balance(balance)

    return balance

if __name__ == "__main__": 
	bank_account = BankAccount(1000)

	# creating thread 
	t1 = threading.Thread(target=bank_account.withdraw, args=(100,)) 
	t2 = threading.Thread(target=bank_account.withdraw, args=(100,)) 

	# starting thread 1 
	t1.start() 
	# starting thread 2 
	t2.start() 

	# wait until thread 1 is completely executed 
	t1.join() 
	# wait until thread 2 is completely executed 
	t2.join() 

	# both threads completely executed 
	print("Done!") 
