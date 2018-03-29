package lsh3

import grails.util.Holders

class BootStrap {

    def init = { servletContext ->
        log.info("**********************************************")
        println(Holders.grailsApplication.config.server.contextPath)

    }
    def destroy = {
    }
}
