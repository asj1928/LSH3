package LSH3Changed

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class UserSpec extends Specification implements DomainUnitTest<User> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }
    void "validating user"(){
        setup:
        User user=new User(email: email,userName: uname,name:name ,password:pswd ,firstName: fname)

        when:
        boolean result=user.validate()






        then:
        result==valid

        where:
        email|uname|name|pswd|fname|valid

        "asjodha22@gmail.com"| "asj1928"|"ajay"|"Harinderdemigod"|"ajay"|true
    }
}
