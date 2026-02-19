package CollectionAndGenerics

fun main() {
    val users: List<User> = mutableListOf(
        User(0, "Максим", 14),
        User(1, "Олег", 16),
        User(2, "Руслан", 18),
        User(3, "Артем", 23),
        User(4, "Олег", 23))

    val products: List<Product> = mutableListOf(
        Product(0, "Банан", 20),
        Product(1, "Оперативная память", 30000),
        Product(2, "Диван", 40000),
        Product(3, "Мяч", 300),
        Product(4, "Патроны 38", 2300),
        Product(5, "Тарелка", 150))

    val purchases: List<Purchase> = mutableListOf(
        Purchase(0, 0, 1),
        Purchase(0, 1, 2),
        Purchase(1, 0, 10),
        Purchase(1, 2, 1),
        Purchase(1, 5, 2),
        Purchase(3, 4, 8),
        Purchase(3, 2, 1),
        Purchase(4, 3, 1),
        Purchase(4, 2, 2),
        Purchase(4, 0, 20))

    //3.1
    println(users.filter { it.age >= 18 })

    //3.2
    println(products.sortedByDescending { it.price }.take(3))

    //3.3
    println(purchases.any { it.userId == 0 && it.productId == 0 })

    //3.4
    println(purchases.groupBy { it.userId })

    //3.5
    println(purchases.groupBy { it.productId })

    //3.6
    println(purchases.sumOf { products.get(it.productId).price * it.quantity })

    //3.7
    var map = mutableMapOf<Int, Int>()

    for (purchase in purchases) {
        if (!map.containsKey(purchase.userId)) {
            map.put(purchase.userId, products.get(purchase.productId).price * purchase.quantity)
        }
        else {
            map[purchase.userId] = map[purchase.userId]!! + products[purchase.productId].price * purchase.quantity
        }
    }

    var key = 0
    for (entry in map.entries) {
        if (entry.value > map.get(key)!!) {
            key = entry.key
        }
    }

    println("${key}: ${map.get(key)!!}")

    //4.А
    println(findMax("a", "b"))

    //4.Б
    val wrapper: Wrapper<String> = Wrapper("text")
    println(wrapper.currentTimeCreate)
}

fun <T> findMax(obj_1: T, obj_2: T) : T {
    return if (obj_1.hashCode() > obj_2.hashCode()) obj_1 else obj_2
}