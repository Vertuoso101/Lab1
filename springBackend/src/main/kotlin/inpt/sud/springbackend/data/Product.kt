package inpt.sud.springbackend.data

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.ToString
import java.io.Serializable
import javax.persistence.*
import kotlin.time.measureTimedValue


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
class Product: Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null
    private var name: String? = null
    private var description: String? = null
    private var currentPrice = 0.0
    private var promotion = false
    private var selected = false
    private var available = false
    private var photoName: String? = null
    @ManyToOne
    private var category: Category? = null

    fun setName(value: String){
        name= value }
    fun setCurrentPrice(value: Double){
        currentPrice = value
    }
    fun setPromotion(value: Boolean){
        promotion = value
    }
    fun setSelected(value: Boolean){
        selected = value
    }
    fun setAvailable(value: Boolean){
        available = value
    }
    fun setPhotoname(value: String){
        photoName = value
    }
    fun setCategory (obj: Category){
        category = obj
    }

}