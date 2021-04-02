open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10) {
    override fun toString(): String {
        return name
    }
}

class Vegetables(private vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        return if (toppings.isEmpty()) {
            "$name Chef's Choice"
        } else {
            name + " " + toppings.joinToString()
        }
    }
}

class Order (val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item) {
        itemList.add(newItem)
    }

    fun addAll(newItems: List<Item>) {
        itemList.addAll(newItems)
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

fun main() {
    val order1 = Order(1)
    order1.addItem(Noodles())
    order1.print()

    println()

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    order2.print()

    println()

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    order3.print()
}