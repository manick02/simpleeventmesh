# Introduction
Goal is to build a simple event mesh server to understand the use case and problem it solves
## Inspiration
Want to try the concept of Event mesh explained here by Thiery Habart
https://www.youtube.com/watch?v=FT0gZ_RaEbQ&t=398s
## Problem Definition 
Problem is understood  from the statement here - https://docs.solace.com/Cloud/Event-Mesh/about_event_meshes.htm
EventMesh is a layer which guarantees event delivery between services anywhere in the infrastructure.
If services are connected to the same event broker delivery of message is guaranteed.
If services are connected to different event broker we need an architecture layer to deliver the messages 
across event Brokers. These Event Brokers may be geographically separated or may be separated by different cloud providers
Architecture layer which connects different broker services is called mesh. 
More understanding is also obtained from here - https://www.redhat.com/rhdc/managed-files/mi-event-mesh-primer-analyst-material-F26155-202101-en_0.pdf
Quoting from the above pdf 
```text
* Event Mesh propagates events across disparate cloud platforms
* Support for ingress and egress of events in multiple protocols
* Fault tolerant for high reliable delivery of messages, recover from network failures and fall back for undeliverable messages
* Support for multi protocol bridges
* Multiple client APIs to support wide variety of programming languages
* Support for on premises and multi cloud deployments
* Management console for administration of the mesh and monitoring of activity
* Secure transmission of messages
* Event brokers tend to follow conways law, with each organisation tend to have its own broker instance or different kind of broker. 
  So we need a mesh that helps developer in delivering and receiving message across wide range of broker instances 
```

### Precise Conditions to be met for the solution to be accepted
 List of Brokers participating or collaborating is known
 Parties connect only to their Broker
 Parties state their interest which they are producing or consuming to the broker
 Brokers act on behalf of the Parties to forward or receive events.
 
### NEED to understand different region networking limitations to update the precise conditions
  Do we need gateway at the network boundary of each of the region or data center?
  #### ASSUMPTION
  I could not establish the limitation apart from the fact that it would require an accessible endpoint either available publicly or via VPC
  To make meaningful progress I would make the above assumption




## Requirement 
