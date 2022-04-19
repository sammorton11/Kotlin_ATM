//Bank App
var balance = 100

fun main() {
    println("Welcome to Kotlin Bank")
    var b = BankAccount()
    b.menu()
}


class BankAccount{
    
    fun deposit(){

    println("Enter amount to deposit:")
    val user = readln()
    val amount = user.toInt()
    balance += amount
    println("Deposited: $amount Balance: $balance")
    menu()

    }

    fun withdraw(){

        println("Enter amount to withdraw:")
        val user = readln()
        val amount = user.toInt()
        balance -= amount
        println("Withdraw: $amount Balance: $balance")
        menu()

    }

    fun checkBalance(){

        println("Balance: $balance")
        menu()

    }

    fun exit(){

        println("Goodbye!")
    
    }

    fun menu(){
        
        println("1-deposit -- 2-withdraw -- 3-check balance -- 4-Exit")

        when(readln())
        {
            "1" -> deposit()
            "2" -> withdraw()
            "3" -> checkBalance()
            "4" -> exit()
        }
    }

}

