# dubbo-direct
dubbo rpc 本地直连（不需要注册中心）

# VM参数和配置
如果出现 `java.lang` 和 `java.math` 相关报错，添加如下 vm 参数就行：

`--add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.math=ALL-UNNAMED`