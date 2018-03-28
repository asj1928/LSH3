package LSH3Changed

class LinkResource extends Resource{
    String url

    Date dateCreated
    Date lastUpdated

    static constraints = {
        url(url: true)
    }
}
