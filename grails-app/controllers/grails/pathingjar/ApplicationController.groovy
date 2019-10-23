package grails.pathingjar

import demo.Person
import grails.core.GrailsApplication
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
        Person person = new Person(name: "Nirav")
        [grailsApplication: grailsApplication, pluginManager: pluginManager, person: person]
    }
}
