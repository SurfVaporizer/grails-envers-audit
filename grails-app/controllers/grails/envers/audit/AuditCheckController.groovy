package grails.envers.audit

import net.lucasward.grails.plugin.EnversPluginSupport
import org.codehaus.groovy.grails.commons.DefaultGrailsDomainClass

class AuditCheckController {

    def index() {

        def audited = EnversPluginSupport.isAudited(new DefaultGrailsDomainClass( Item.class ))
        def results = Item.findAllRevisions()
//
//        assert results.size() == 3
//        def r = results[0]
//        assert r.name == "PureGorm"
//        assert r.email == "tester@gorm.org"
//        assert r.address.city == "Chicago"
//        assert r.address.zip == "60640"
//        assert r.revisionType == RevisionType.ADD
//        r = results[1]
//        assert r.email == "tester2@gorm.org"
//        assert r.address.city == "New York"
//        assert r.revisionType == RevisionType.MOD
//        r = results[2]
//        assert r.email == "tester3@gorm.org"
//        assert r.address.zip == "10003"
//        assert r.revisionType == RevisionType.MOD

      render "Audited? ${audited} revisions found: $results"
    }
}
