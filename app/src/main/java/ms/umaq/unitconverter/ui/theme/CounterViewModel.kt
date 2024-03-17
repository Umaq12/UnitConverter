package ms.umaq.unitconverter.ui.theme

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import ms.umaq.unitconverter.CounterModel

class CounterViewModel() :ViewModel() {
    private val _repository: CounterModel.CounterRepository = CounterModel.CounterRepository()
    private var _count = mutableStateOf(_repository.getCounter().count)
    val count: MutableState<Int> = _count // Это делается для того чтобы мы могли изменять неизменяемое состояние
    fun increment() {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }
    fun decrement() {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }


}