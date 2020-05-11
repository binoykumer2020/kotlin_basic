package functionals

data class Items ( val name : String, val price : Float)

data class Order ( val items : Collection<Items>)

// fun Order.maxPricedItemValue ( ) : Float = this.items.maxBy { it.price } ? .price ? : 0F
