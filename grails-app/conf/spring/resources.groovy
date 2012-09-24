import net.lucasward.grails.plugin.StubSpringSecurityService
import net.lucasward.grails.plugin.SpringSecurityServiceHolder

beans = {

    //springSecurityService(StubSpringSecurityService)

    springSecurityServiceHolder(SpringSecurityServiceHolder) {
        springSecurityService = ref('springSecurityService')
    }
}