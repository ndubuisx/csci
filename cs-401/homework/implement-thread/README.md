# Homework 1 - Threading in Python

Suppose that you and your significant other share a bank account with a balance of $1000. Then you each go to separate ATM machines and simultaneously withdraw $100 from the account.
 
**Thread-A (You)**
``` python
withdraw (account, amount):
    balance = get_balance(account)
    balance = balance – amount
    put_balance(account, balance)
    return balance
```

**Thread-B (Your significant)**
``` python
withdraw (account, amount):
    balance = get_balance(account)
    balance = balance – amount
    put_balance(account, balance)
    return balance
```
 

Separate thread for each person to do withdrawals and these threads run on the same bank machine.
a) Implement the above problem with the choice of your programming language? (7 points)
b) Explain what’s the problem with this implementation? (3 points)