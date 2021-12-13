# Spring Bean 的生命周期
- Spring Bean 的生命周期简单易懂。在一个 bean 实例被初始化时,需要执行一系列的舒适化操作达到可用的状态。同样的,当一个 bean 不在被调用时需要进行相关的析构操作,并从 bean 容器中移除。
- Spring bean factory 负责管理在 Spring 容器中被创建的 bean 的生命周期。Bean 的生命周期用两组回调(call back)方法组成。
    - 初始化之后调用的回调方法
    - 销毁之前调用的回调方法
- Spring 框架提供了以下四种方式来管理 bean 的生命周期事件
    - InitalizingBean 和 DisposableBean
    - 针对特殊行为的其他 Aware 接口
    - Bean 配置文件中的 Custom init() 方法和 destroy() 方法
    - @PostConstruct @PreDestroy 注解方式

