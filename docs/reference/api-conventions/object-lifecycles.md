---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/object-lifecycles.html
---

# Object life cycles and thread safety [object-lifecycles]

There are five kinds of objects in the Java API Client with different life cycles:

**Object mapper**
:   Stateless and thread-safe, but can be costly to create. It’s usually a singleton that is created at application startup and used to create the transport.

**Transport**
:   Thread-safe, holds network resources through the underlying HTTP client. A transport object is associated with an {{es}} cluster and has to be explicitly closed to release the underlying resources such as network connections.

**Clients**
:   Immutable, stateless and thread-safe. These are very lightweight objects that just wrap a transport and provide API endpoints as methods. Closing a client closes the underlying transport.

**Builders**
:   Mutable, non thread-safe. Builders are transient objects that should not be reused after calling `build()`.

**Requests & other API objects**
:   Immutable, thread-safe. If your application uses the same request or same parts of a request over and over, these objects can be prepared in advance and reused across multiple calls over multiple clients with different transports.
