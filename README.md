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

### Conditions to be met for the solution to be accepted


## Requirement 
