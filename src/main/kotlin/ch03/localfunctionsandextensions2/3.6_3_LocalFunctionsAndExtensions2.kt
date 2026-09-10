package ch03.localfunctionsandextensions2

class User(val id: Int, val name: String, val address: String)

//fun saveUser(user: User) {
//    fun validate(value: String, fieldName: String) {
//        if (value.isEmpty()) {
//            // Can use user from the outer function.
//            throw IllegalArgumentException(
//                "Can't save user ${user.id}: " +
//                    "empty $fieldName"
//            )
//        }
//    }
//
//    validate(user.name, "Name")
//    validate(user.address, "Address")
//
//    // Save user to the database
//}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName" // Can use User's property.
            )
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave() // Call extension function.
    // Save user to the database
}

fun main() {
    saveUser(User(1, "", ""))
}
