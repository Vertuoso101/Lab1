package inpt.sud.springbackend.data

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.ToString
import java.io.Serializable
import javax.persistence.*


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
open class Category: Serializable {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private var id: Long? = null
    private var name: String? = null
    private var description: String? = null
    @OneToMany(mappedBy = "category")
    private var products: MutableCollection<Product?>? = null
    constructor(_id: Long?, _name:String, _description: String?, _products: MutableCollection<Product?>?){
        id=_id
        name = _name
        description = _description
        products = _products

    }

}