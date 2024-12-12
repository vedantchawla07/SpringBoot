public class Notes {


    /*

    Spring ---> Configuration karna parta tha bohot.
    Spring Boot ---> Convention follow karta hai jo 80% of the times work karta hai.
    Agar tumko kuch specific chahiye to tumko wo specify karna hoga nai to wo convention ko assume kar k chalega

    Why do we separate the controller and the service layer?


    Controller ka kaam hai bas incoming requests ko map karna forward karna process karna response dena
    Service layer ka kaam hai business logic sambhalna
    Ha tum dono ko saath me karsakte ho
    Par cleanliness k liye ye karte hai log


    RequestMapping me default method GET hai


    GET ---> to get the contents, cacheable hai, and safe hai
    POST ---> to add contents/ create the records
    PUT --->  to alter the contents of a record

    @Autowired
    private TopicService topicService;

    Ye autowired kya hai?  Basically spring iska ek naya object bana deta hai and constructor bhi call kardeta hai
    Kab? Jab application run hota hai and wo classpath scan karta hai tab

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
    Ye @PathVariable kya karta hai ki request body se jo variable hai tumhara wo value wali chiz laa k dedeta hai.
    Fetch kardeta hai basically.

    Agar tumhara variable ka naam is different that the one jo curly braces me hai tab alag syntax hota hai---> thora verbose
    Par agar same variable name hai jo  {} me hai, to @PathVariable se kaam hojaega








    */

}
