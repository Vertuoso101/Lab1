package inpt.sud.springbackend

import inpt.sud.springbackend.dao.CategoryRepository
import inpt.sud.springbackend.dao.ProductRepository
import inpt.sud.springbackend.data.Category
import inpt.sud.springbackend.data.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.random.Random

@SpringBootApplication
abstract class SpringBackendApplication : CommandLineRunner {
    @Autowired
    lateinit var categoryRepository : CategoryRepository

    @Autowired
    lateinit var productRepository: ProductRepository
        companion object{
            @JvmStatic
            fun main(args: Array<String>) {
                runApplication<SpringBackendApplication>(*args)
        }

    }

    override fun run(args: Array<String>)  {
        categoryRepository.save(Category(null, "Computers", null, null))
        categoryRepository.save(Category(null, "Printers", null, null))
        categoryRepository.save(Category(null, "Smartphones", null, null))
        try{
            categoryRepository.findAll().forEach { category ->
                for (i in 0..9) {
                    fun getRandomString(length: Int) : String {
                        val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')

                        return List(length) { charset.random() }
                            .joinToString("")
                    }
                    val p = Product()
                    p.setName(getRandomString(10))
                    p.setCurrentPrice(100.0+Random.nextInt(10000))
                    p.setAvailable(Random.nextBoolean())
                    p.setPromotion(Random.nextBoolean())
                    p.setSelected(Random.nextBoolean())
                    p.setCategory(category)
                    p.setPhotoname("unknown.png")
                    productRepository.save(p)





                }
            }
        }catch (e:IllegalStateException){
            println(e)
        }




    }


}







