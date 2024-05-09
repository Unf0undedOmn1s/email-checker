import java.util.regex.Pattern

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    
    println("Enter an email address:")
    val email = scanner.nextLine()

    if (isValidEmail(email)) {
        println("The email '$email' is valid.")
    } else {
        println("The email '$email' is not valid.")
    }
}

fun isValidEmail(email: String): Boolean {
    val emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\$"
    val pattern = Pattern.compile(emailRegex)
    val matcher = pattern.matcher(email)
    return matcher.matches()
}
