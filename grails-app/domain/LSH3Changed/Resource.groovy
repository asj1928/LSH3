package LSH3Changed

class Resource {
    String description
//    User createdBy
//    Topic topic
    Date dateCreated
    Date lastUpdated

    static belongsTo = [topic:Topic, createdBy:User]

    static hasMany = [ratings:ResourceRating, readingItems:ReadingItem]

    static constraints = {
    }
    static mapping = {
        description sqlType: "text"

    }
}