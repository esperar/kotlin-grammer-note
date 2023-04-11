package in_action.supports

import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

class ObservableProperty(
    var propValue: Int,
    val changeSupport: PropertyChangeSupport
) {
    operator fun getValue(p: Person, prop: KProperty<*>) : Int = propValue
    operator fun setValue(p: Person, prop: KProperty<*>, newValue: Int){
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }



}

class Person(
    val name: String, age: Int, salary: Int
) : PropertyChangeAware(){
    var age: Int by ObservableProperty(age, changeSupport)
    var salary: Int by ObservableProperty(salary, changeSupport)
}