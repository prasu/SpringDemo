index files the order to intialize
type defines the type of the value
contructor-arg for passing values to constructor
property for using getter ans setters.

alias is used to have different name for same bean
idref is the reference to bean with that particualr id
inner bean to define a bean inside a bean


#############Lesson12################
There are four types of Aware
We are using ApllicaitoncontextAware and BeanNameAware

#################### Lesson 13 #################################################

Bean Defifnition Inheritance.

There are couple ways.

1) adding absrtract= true will not create beans in context
2) Only same properties in the child and parent classes will be overriden.
3) If class name is not provided then it will treated as template and abstract should be true as always.


##################### Lesson 14 #############################
Lifecycle callback methods

1) implementing DisposableBean and InitializingBean  
2) using xml configuration with  init-method, destroy-method
3) using annotations  @PostConstruct  ,@PreDestroy


######### Lesson15 #######################
 implementing BeanProcessor we can have methods to be run before and after bean creation for all beans in common
 note : uncomment DisplayNameBeanPostProcessor @component to make it run.
 
 ##########Lesson 16 ##########
