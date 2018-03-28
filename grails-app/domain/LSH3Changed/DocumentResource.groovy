package LSH3Changed

class DocumentResource extends Resource{
    String filePath
    Date dateCreated
    Date lastUpdated


    static constraints = {
        filePath nullable: false
    }
}
