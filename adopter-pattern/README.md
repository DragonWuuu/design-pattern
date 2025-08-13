# 适配器模式
适配器模式是一种结构型模式，它将一个类的接口转换为客户端期望的另一个接口。

# 优点
1. 客户端可以使用统一的接口来调用不同的类，而不需要知道具体的实现类。
2. 类的复用性提高了，因为可以将一个类的接口转换为客户端期望的另一个接口，而不需要修改原有的类。

# 缺点
1. 适配器模式的性能可能会受到影响，因为需要进行额外的转换操作。

# 示例
在本项目中，客户端需要使用 `target` 接口，被适配的接口是 `adoptee`，适配器是 `adopter`。
`target` 接口需要两个方法：`getBookName` 和 `getBookAuthor`。
`adoptee` 接口需要一个方法：`getBookInfo`。
`adopter` 类实现了 `target` 接口，并且在 `getBookName` 和 `getBookAuthor` 方法中调用了 `adoptee` 接口的 `getBookInfo` 方法。
