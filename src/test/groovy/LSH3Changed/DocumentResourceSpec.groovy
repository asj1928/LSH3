package LSH3Changed

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DocumentResourceSpec extends Specification implements DomainUnitTest<DocumentResource> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }
    void "validate and test documentresource"(){
        setup:
        DocumentResource documentResourceResource=new DocumentResource()
        documentResourceResource.description="description of Document resource"
        documentResourceResource.filePath="/home/ajay/grails/grailexp1/grails-app/init/grailexp1/BootStrap.groovy"

        when:
        def result=documentResourceResource.validate()

        then:
        result==true
    }
}
