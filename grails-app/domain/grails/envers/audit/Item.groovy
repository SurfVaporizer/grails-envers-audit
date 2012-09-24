package grails.envers.audit
import org.hibernate.envers.Audited
@Audited
class Item {

    static constraints = {
    }
    String ISBN
    String author
    String title
}
